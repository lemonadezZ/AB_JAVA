public class Start {
	class inner {
		public inner(){
			System.out.print("�ڲ��� ����\n");
		}
		public void run(){
			System.out.print("�ڲ��� run ����\n");
		}
	}
	public Start(){
		System.out.print("���ǹ��췽��\n");
	}
	
	protected void finalize(){
		System.out.print("������������\n");
	}
	
	static void run() {
		System.out.print("run ����\n");
	}

	public static void main(String[] args) {
		Start a=new Start();
		Start.inner b=a.new inner();
		b.run();
		System.gc();
	}

}
