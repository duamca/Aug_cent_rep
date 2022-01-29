//Day7 Assignment-8 Factorial of any number

package packageE;

import java.util.Scanner;

public class factorial 
{
   public static void main(String[] args)
   {
          Scanner obj=new Scanner(System.in);
		   System.out.println("enter the number");
		  int num=obj.nextInt();
		  int fac=1;
		  	
		while(num!=0)
		{
			fac=fac*num;
			num--;
		}
	
			System.out.println("factorial of a num="+fac);
	    
   }
}
