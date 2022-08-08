package in.sunera;

class A4{
	static int a=10;
	int x=m1();
	
	public static int m1() {
		System.out.println("A4.m1()");
		return 20;
	}
	public A4() {

		System.out.println("A4 Constructor");
		
		x=33;
	}
}


public class B4 extends A4 {
   static int b=44;
   int y=42;
   
   
   
   public B4() {

	   System.out.println("B4 Consturctor");
	   
	   y=22;
    }
   
	public static void main(String[] args) {
		B4 b4=new B4();
		System.out.println(a);
		System.out.println(b);
		System.out.println(b4.x);
		System.out.println(b4.y);
	}
}
