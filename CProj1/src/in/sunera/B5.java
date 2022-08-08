package in.sunera;

class A5 {
	static int a = 10;
	int x = 30;

	static void m1() {
		System.out.println("A Class m1()");
	}
	 void m2() {
		System.out.println("A Class m2()");
	}
	 void m3() {
			System.out.println("A Class m3()");
		}
}

public class B5 extends A5 {
	static int a = 44;
	int x = 42;

	static void m1() {
		
		System.out.println("B Class m1()");
	}
	 void m2() {
super.m2();
		System.out.println("B Class m2()");
	}

	 void m4() {
		 super.m1();
		 super.m2();
		 super.m3();
		 m1();
		 m2();
		 m3();
	 }
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		
		B5 b4 = new B5();
		
		System.out.println(b4.x);
             b4.m2();
             b4.m3();
             b4.m4();
	}
}
