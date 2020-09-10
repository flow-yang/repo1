package AopDemo;

import org.springframework.stereotype.Component;

/**
 * @author yang
 * @date 2020/8/16 - 20:55
 */
//被增强的类
@Component //利用注解创建一个UserDao 类的对象
public class UserDao {

    public void add(int a, int b) {
        System.out.println("调用add方法.....");
        System.out.println(a+b);
    }
}
