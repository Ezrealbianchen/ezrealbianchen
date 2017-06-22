class Person {
	protected String name;
	protected int age;
	//public Person(){}
	
	public Person(String name,int age) {
		
		this.name = name;
		this.age  = age ;		
	}
	
	protected void show() {
		System.out.println("父类show");
	}
	
}

class Student extends Person {
	
	private String department;
	public Student(String name,int age,String dep) {
		
		super(name,age);
		department = dep;
	
	}
	
	protected void show() {
		System.out.println("子类show");
	}
	
	public void subShow() {
		System.out.println("我在子类中");
	}
}

public class TestSuper {
	public static void main(String[] args) {
		
		Person p = new Student("王永涛",24,"电子");
		p.show();
		System.out.println(p.toString());
	}
}
