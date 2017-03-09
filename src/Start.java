
class Person{
	public Person(){
		System.out.println("我是一个人");
	}
	public void say(){
		System.out.println("一个人正在说话");
	}
}
class Student extends Person{
		public Student(){
			System.out.println("我继承与一个人");
		}
		public void say(){
			super.say();
			System.out.println("我在说话");
		}
	
}

public class Start {
	public static void main(String[] args) {
		Student s=new Student();
		s.say();
	}

}
