import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by jingz on 2017/3/12.
 */
public class Test1 {
    static public  void main(String[] argv){
        Vector v=new Vector();
        v.add("a");
        v.add("b");
        v.add("c");
        ArrayList a=new ArrayList();
        a.add("a");
        a.add("b");
        a.add(1);
        Map m=new HashMap();
        m.put("name","jingdor");
        m.put("age","18");
        Set  s1=m.keySet();
        Stack st=new Stack();
        st.push("aaa");
        System.out.println(st.peek());
        st.push("bbb");
        System.out.println(st.peek());



        for (Object o : s1) {
            System.out.println(o);
        }
        Collection s2=m.values();
        for (Object o : s2) {
            System.out.println(o);
        }
        for(int i=0;i<a.size();i++){

            //System.out.println(a.get(i));
            //System.out.println(v.get(i));
        }
        System.out.println("结束");

    }
}
