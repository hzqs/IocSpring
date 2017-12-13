package impi;

/**
 * Created by hzq on 2017/12/12.
 */
public class HelloImpl {
    public void say(){
        System.out.print("hello spring");
    }

    public void init(){
        System.out.print("初始化。。");
    }
    public void destroy(){
        System.out.print("销毁...");
    }

}
