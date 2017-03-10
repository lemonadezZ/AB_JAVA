import person.*;
import student.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.*;

public class Start {
    final static String desc="这是描述\n";
    static {
        System.out.print("这是静态方法\n");
    }
	public static void main(String[] args) {
        System.out.print(desc);
	    GregorianCalendar d=new GregorianCalendar();
	    Date d1=new Date();
	    System.out.print(d.get(d.YEAR));
        int i=0;
        while(true) {
            Runtime run=Runtime.getRuntime();
            try {
                Process p = run.exec("\"C:\\Program Files\\Java\\jdk1.8.0_77\\bin\\java\" -Didea.launcher.port=7547 \"-Didea.launcher.bin.path=C:\\Program Files (x86)\\JetBrains\\IntelliJ IDEA Community Edition 2016.3\\bin\" -Dfile.encoding=UTF-8 -classpath \"C:\\Users\\jingz\\workspace\\AB_JAVA\\bin;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\charsets.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\deploy.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\ext\\access-bridge-64.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\ext\\cldrdata.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\ext\\dnsns.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\ext\\jaccess.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\ext\\jfxrt.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\ext\\localedata.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\ext\\nashorn.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\ext\\sunec.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\ext\\sunjce_provider.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\ext\\sunmscapi.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\ext\\sunpkcs11.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\ext\\zipfs.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\javaws.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\jce.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\jfr.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\jfxswt.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\jsse.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\management-agent.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\plugin.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\resources.jar;C:\\Program Files\\Java\\jdk1.8.0_77\\jre\\lib\\rt.jar;C:\\Program Files (x86)\\JetBrains\\IntelliJ IDEA Community Edition 2016.3\\lib\\idea_rt.jar\" com.intellij.rt.execution.application.AppMain Test\n");
                BufferedInputStream in = new BufferedInputStream(p.getInputStream());
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String s;
                System.out.print("开始读取数据\n");
                try {
                    while ((s = br.readLine()) != null)
                        System.out.println(s);
                    }
                catch (Exception e){
                    System.out.print("输出发生了错误\n");
                }
         }catch (Exception e){
                System.out.print(e.getMessage());
                System.out.print("进程执行发生了错误\n");
            }finally {
                System.out.print("最终执行\n");
            }
            i++;
            if(i>=10){
                break;
            }
        }
        System.out.print("运行结束了");
	}

}
