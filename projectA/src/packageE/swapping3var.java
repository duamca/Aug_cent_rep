//Day7 Assignment-1 swapping of two numbers using third variable 


package packageE;

public class swapping3var
{
	public static void main(String[] args)
	{
		  int temp;
		  int a=4;
		  int b=6;
		  System.out.println("Before swapping");
		  System.out.println("first number is="+a+"second number is="+b);
		  temp=b;
		  b=a;
		  a=temp;
		  System.out.println("After swapping");
		  System.out.println("first number is="+a+"second number is="+b);
	}
}
