package AopDemo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author yang
 * @date 2020/8/16 - 21:05
 */
//增强的类
    @Aspect  //生成代理对象
    @Component//创建一个UserDaoProxy 的对象
public class UserDaoProxy {
    //前置通知
    @Before(value = "execution(* AopDemo.UserDao.add(..))")
    public void before(){
        System.out.println("方法之前....");
    }
}
