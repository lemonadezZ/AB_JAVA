/**
 * Created by jingz on 2017/3/12.
 */
public class Test2 {
    public class Inner {
        public void say(String a){
            System.out.println("我是内部类1");
            System.out.println(a);
        }
    }
    static public  void main(String []argv){
            class Inner {
                    public void say(String a){
                        System.out.println("我是内部类2");
                        System.out.println(a);
                    }
            }
            Inner i=new Inner();
            i.say("这是什么鬼东西");
            Test2 t2=new Test2();
            Test2.Inner i1=t2.new Inner();
            i1.say("这次应该对了");
    }
}
