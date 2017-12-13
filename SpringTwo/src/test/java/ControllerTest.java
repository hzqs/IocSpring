import edu.nf.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hzq on 2017/12/13.
 */
public class ControllerTest {
    @Test
    public void testAdd(){
        ApplicationContext context=new AnnotationConfigApplicationContext("edu.nf");
        UserController controller=context.getBean("controller",UserController.class);
       controller.addUser();
        ((AnnotationConfigApplicationContext)context).close();


    }


}
