package edu.nf;

/**
 * Created by hzq on 2017/12/12.
 */
public class People {

    private String name;
    private int age;
    private Tools tools;

    /*
    * 注入*/
    public People(String name,int age){
        this.name=name;
        this.age=age;
    }

    public People(Tools tools) {
        this.tools = tools;
    }

    public void say(){
        System.out.print("name"+name);
        System.out.print("age"+age);
    }

    private void work(){
        tools.fix();
    }


}
