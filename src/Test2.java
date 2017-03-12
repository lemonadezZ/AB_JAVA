import java.util.Stack;

/**
 * Created by jingz on 2017/3/12.
 */
public class Test2 {
    public Test2(){
        System.out.println("这是构造类");
    }

    String name="Test2";
    static public class Sinner{
        static {

        }
        public void say(){
            System.out.println("我是精通内部类的方法");
        }
        static public void says(){
            System.out.println("我是精通内部类的静态方法");
        }
    }
    public class Inner {
        String name="Test2.Inner";
        public void say(String a){
            System.out.println("我是内部类1");
            System.out.println(a);
        }
        public void  show(){
            System.out.println(this.name);
            System.out.println(Test2.this.name);
        }
    }
    static public  void main(String []argv){

        Test2.Sinner si1=new Test2.Sinner();
        si1.say();
        Test2.Sinner.says();



        String name1="我是一个名字";
            class Inner {
                    public String name="我是局部内部类";
                    public void say(String a){
                        System.out.println("我是内部类2");
                        System.out.println(a);
                    }
                    public void show(){
                        System.out.println(name1);
                        System.out.println(this.name);
                    }
            }
            Inner i=new Inner();
            i.show();
            i.say("这是什么鬼东西");
            Test2 t2=new Test2();

            //匿名类
            Test2 f =  new Test2()
            {
                {
                    System.out.println("我是匿名内部类的初始化");
                }
                public void say1(){
                    System.out.println("我是匿名内部类");
                }
            };

            Test2.Inner i1=t2.new Inner();
            i1.say("这次应该对了");
            i1.show();
    }
}
