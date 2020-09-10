package Dynatic_Daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author yang
 * @date 2020/8/16 - 17:07
 */
//使用Proxy类创建接口代理对象
public class JDKProxy {
    public static void main(String[] args) {
        //创建接口实现类代理对象
        Class[] interfaces={UserDao.class};
        UserDaoImp userDao=new UserDaoImp();
        //都是针对UserDaoLmp这个类来创建代理对象，所以传递的参数和这个UserDaoLmp类有关
        UserDao dao= (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new UserDaoProxy(userDao));
        int result=dao.add(2,5);
        System.out.println("result:"+result);
    }
}
class UserDaoProxy implements InvocationHandler {
    //把创建的是谁的代理对象，把谁传递过来
    //有参数构造传递
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj=obj;
    }

//增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法执行之前
        System.out.println("方法前执行3.。。。。"+method.getName()+"参数传递"+ Arrays.toString(args));
        //被增强的方法执行
        Object res = method.invoke(obj,args);
        //方法之后
        System.out.println("方法之后执行。。。。。"+obj);
        return res;
    }
}