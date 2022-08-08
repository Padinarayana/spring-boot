package in.sunera;

import java.net.Socket;

public class Pdt2Wco {

	public static void main(String args[]) {
		int i=10;
		Integer i1=new Integer(i);
	   System.out.println(i1);
	   Integer i2=i;
	   System.out.println(i2);
	   Integer i3=Integer.valueOf(i);
	   System.out.println(i3);
	   
	   Byte b1=new Byte((byte)50);
	   
	   Character c1=new Character('c');
	   Character c2=new Character((char)98);
	   
	   Boolean b11=new Boolean(true);
	   
	   Float f1=new Float(99);
	   Float f2=new Float(67.5f);
	   
	   Double d1=new Double(i);
	   Double d2=new Double(98);
	   Double d3=new Double('d');
	   System.out.println(d3);
	   
	   
	   Integer io1=98;
	   int i22=io1.intValue();
	   byte b22=io1.byteValue();
	   short s22=io1.shortValue();
	   long l22=io1.longValue();
	   float f22=io1.floatValue();
	   
	   System.out.println(i22);
	   System.out.println(b22);
	   System.out.println(s22);
	   System.out.println(l22);
	   System.out.println(f22);
	}
}
