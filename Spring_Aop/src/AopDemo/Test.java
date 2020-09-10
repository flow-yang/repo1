package AopDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yang
 * @date 2020/8/16 - 21:14
 */
public class Test {
    @org.junit.Test
   public void test(){
       ApplicationContext context=new ClassPathXmlApplicationContext("Aopdemo.xml");
       UserDao userDao=context.getBean("userDao",UserDao.class);
       userDao.add(1,6);
   }


}
