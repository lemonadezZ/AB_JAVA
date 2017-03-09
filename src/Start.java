public class Start {
	class inner {
		public inner(){
			System.out.print("内部类 构造\n");
		}
		public void run(){
			System.out.print("内部类 run 方法\n");
		}
	}
	public Start(){
		System.out.print("这是构造方法\n");
	}
	
	protected void finalize(){
		System.out.print("这是析构方法\n");
	}
	
	static void run() {
		System.out.print("run 方法\n");
	}

	public static void main(String[] args) {
		Start a=new Start();
		Start.inner b=a.new inner();
		b.run();
		System.gc();
	}

}
