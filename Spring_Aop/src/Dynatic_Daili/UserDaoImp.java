package Dynatic_Daili;

/**
 * @author yang
 * @date 2020/8/16 - 17:06
 */
//创建接口实现类实现接口
public class UserDaoImp implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("调用add方法");
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
