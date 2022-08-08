package in.sunera;

public  class MyThread extends Thread{

        public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("MyThread "+i);
		}
	}
	public static void main(String[] args) {
		
		MyThread thread=new MyThread();
		thread.start();
		
		MyThread thread1=new MyThread();
		thread1.start();
		
		
		for (int i=0;i<10;i++) {
			System.out.println("Main "+i);
		}
	}
}
