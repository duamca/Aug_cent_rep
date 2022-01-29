//Day7 Assignment-2 swapping of two numbers 


package packageE;

public class swapping2no
{
	public static void main(String[] args)
	{
		  int a=9;
		  int b=3;
		  System.out.println("Before swapping");
		  System.out.println("first number is="+a+"second number is="+b);
		  a=a+b;
		  b=a-b;
		  a=a-b;
		  System.out.println("After swapping");
		  System.out.println("first number is="+a+"second number is="+b);
	}
}
