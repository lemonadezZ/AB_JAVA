package student;

import person.*;

public class Student extends Person{
    public Student(){
        System.out.println("我继承与一个人");
    }
    public void say(){
        System.out.println("我在说话");
    }

}