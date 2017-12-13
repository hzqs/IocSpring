import edu.nf.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hzq on 2017/12/12.
 */
public class PeopleTest {

    @Test
    public void testSay(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        People people=context.getBean("People",People.class);
        people.say();
    }

}
