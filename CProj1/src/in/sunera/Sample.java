package in.sunera;

 class Example {
     static int a=m1();
     
     int k=30;
     
     static {
    	 System.out.println("Example SB");
     }
     
     int x=m2();
     
     {
    	 System.out.println(" Example NOn Static BLock");
     }
	
     
     public Example() {
        System.out.println("Example Constructor");
     }
     
     
      static int m1() {
    	 System.out.println("Static m1() method.");
    	 return 10;
     }
     
     int m2() {
    	 System.out.println("Example.m2()");
     return 20;
     }
     
     
     void abc() {
    	 System.out.println("Example.abc()");
     }
     
     void bbc() {
    	 System.out.println("Example.bbc()");
     }
}

class Sample extends Example{
	  static int b=m3();
	     
	     static {
	    	 System.out.println("Sample SB");
	    
	     }
	     
	     int y=m4();
	   
	     
	     {
	    	 System.out.println(" Sample NOn Static BLock");
	     }
		
	     
	     public Sample() {
	        System.out.println("Sample Constructor");
	        System.out.println(super.k);
	        System.out.println(this.k);
	     }
	     
	     
	     static int m3() {
	    	 System.out.println("Static m3() method.");
	    	 return 10;
	     }
	     
	     int m4() {
	    	 System.out.println("Example.m4()");
	     return 20;
	     }
	     
          int k=50;	     
	     void abc() {
	    	 System.out.println("Sample.abc()");
	     }
	     
	     {
	    	 System.out.println("Anthoer NOn Static Block");
	     }
	public static void main(String[] args) {
		System.out.println("Main Method");
		
		Sample s=new Sample();
		s.abc();
		s.bbc();
	}
	
}