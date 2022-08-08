package in.suenra;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Calculator calc=new  Calculator();
        System.out.println(calc.add(33, 44));
    }
}
