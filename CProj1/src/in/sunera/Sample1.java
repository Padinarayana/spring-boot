package in.sunera;

class Example1{
	public Example1() {
		// TODO Auto-generated constructor stub
		System.out.println("Example1.Example1()");
	}
    public Example1(int a) {
    	System.out.println("abc");
    	System.out.println("rajarani");
    }
}
public class Sample1 extends Example1{

	public Sample1() {
		// TODO Auto-generated constructor stub
		System.out.println("Sample1.Sample1()");
	}
	public Sample1(int a) {
		System.out.println("Sample1.Sample1()"+a);
	}
	
	public static void main(String[] args) {
//		Sample1 s1=new Sample1();
//		Sample1 s2=new Sample1(10);
		
		Example1 e1=new Sample1();
	
	}
}
