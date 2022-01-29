//Day7 Assignment-7 Fibonacci series

package packageE;

import java.util.Scanner;

public class fibonacci 
{
   public static void main(String[] args)
   {
          Scanner obj=new Scanner(System.in);
		   System.out.println("enter the number");
		  int num=obj.nextInt();
		  int b=1;
		  int c=0;
		  int a=0;
		  int i;	
		for(i=1;i<num;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println("fibonacci series="+c);
	    }
   }
}
