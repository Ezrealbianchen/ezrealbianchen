interface Face1 {
	
	final double Pi = 3.14;
	abstract double area();
}

interface Face2 {
	
	abstract void setColor(String Color);
}

interface Face3 extends Face1,Face2 {
	
	abstract void volume();
}

public class TestImplement implements Face3 {
	
	private double radius;
	private int height;
	private String color;//
	
	public TestImplement(double r,int h) {
		this.radius = r;
		this.height = h;	
	}
	
	public double area(){
		return Pi*this.radius*this.radius;
	}
	
	public void setColor(String Color){
		this.color = Color;
	}
	
	public void volume(){
		System.out.println("���Ϊ:"+this.area()*this.height);
	}
	
	public static void main(String[] args) {
		TestImplement volu = new TestImplement(3.0, 2);
		volu.setColor("��ɫ");
		volu.volume();
		System.out.println(volu.color);
		volu.color = "��ɫ";
		System.out.println(volu.color);
	}
}