import impi.HelloImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hzq on 2017/12/12.
 */
public class HelloTest {
    @Test
    public void testSay(){
        //创建ioc容器工厂
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        //通过工厂获取实例
        HelloImpl hello=context.getBean("hello", HelloImpl.class);
        hello.say();


    }
}
