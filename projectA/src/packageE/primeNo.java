//Day7 Assignment-3 Number is prime or not 

package packageE;

import java.util.Scanner;

public class primeNo 
{
   public static void main(String[] args)
   {       int num;
		   Scanner obj=new Scanner(System.in);
		   System.out.println("enter the number");
		    num=obj.nextInt();
		   	int i,count=0;
		
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			count++;
			break;
			
		}
		if(count==0)
			System.out.println(" you enterd a prime number= "+num);
		else
			System.out.println("this number is not prime= "+num);
	  }
   
}
