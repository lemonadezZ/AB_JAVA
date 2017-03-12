import javax.swing.plaf.synth.SynthEditorPaneUI;

/**
 * Created by jingz on 2017/3/12.
 */
//public class Test3 extends Thread {
//    public void run(){
//        System.out.print("线程开始的地方");
//    }
//}
class T1 extends Test3  implements Runnable {
    public void run() {
        for (int i=0;i<50;i++){
            sfun();
            try {
                System.out.println("线程1休眠60秒");
                Thread.sleep(60);
            }catch (InterruptedException e){
            }

            //System.out.println("===================我是线程"+String.valueOf(i));
            //if(i%5==0){
            // System.out.println("我要休眠了");
            //    Thread.yield();
            //}
        }
    }
}
class T2 extends Test3 implements  Runnable {
    public void run() {
        for (int i=0;i<50;i++){
            sfun();
           // System.out.println("我是线程2================="+String.valueOf(i));
        }
    }
}


public class Test3{
    static  int i=0;
    synchronized void sfun(){
        long id=Thread.currentThread().getId();
        String name=Thread.currentThread().getName();
        int proority=Thread.currentThread().getPriority();
        System.out.println("当前线程id："+String.valueOf(id));
        System.out.println("当前线程name："+String.valueOf(name));
        System.out.println("当前线程优先级："+String.valueOf(proority));
        i++;
        System.out.println(i);
    }
    static public void main(String[] argv){
        T1 mr1=new T1();
        T2 mr2=new T2();
        Thread t1=new Thread(mr1);
        t1.setName("我是线程1");
        Thread t2=new Thread(mr2);
        t2.setName("我是线程2");
        t1.start();
        t2.start();
//        try {
//            t1.join();
//            t2.join();
//        }catch (InterruptedException e){
 //           System.out.println("等待线程1执行完");
 //       }

        System.out.println("主线程执行完了");

    }
}
