package in.sunera;

class Example3{
	int x=10;
	int y=20;
	
	void m1() {
		// TODO Auto-generated constructor stub
System.out.println("Example3.m1()");
	}
}
public class Sample3 extends Example3{

	int x=30;
	int y=40;
	void m2() {
		
		System.out.println("x is:"+x);
		System.out.println("y is:"+y);
		
		
		System.out.println("x is:"+super.x);
		System.out.println("y is:"+super.y);
	}
	
	
 void m3() {
		x=50;
		y=60;
		System.out.println("Local x is:"+x);
		System.out.println("Local y is:"+y);
		

		System.out.println("subclass x is:"+this.x);
		System.out.println("subclass y is:"+this.y);
		

		
		System.out.println("superclass x is:"+super.x);
		System.out.println("superclass y is:"+super.y);
	}

public static void main(String[] args) {
	Sample3 a5=new Sample3();
	a5.m2();
	a5.m3();
}
	
}
