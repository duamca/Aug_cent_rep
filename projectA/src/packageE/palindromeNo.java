//Day7 Assignment-4 Number is palindrome or not 

package packageE;

import java.util.Scanner;

public class palindromeNo 
{
   public static void main(String[] args)
   {
	   Scanner obj=new Scanner(System.in);
	   System.out.println("enter the number");
	   int num=obj.nextInt();
	   	int r,s=0,t=num;
	
	while(num!=0)
	{
		r=num%10;
		s=(s*10)+r;
		num=num/10;
		
	}
	if(t==s)
		System.out.println(" you enterd a palindrrome number= "+t);
	else
		System.out.println("this number is not palindrome= "+t);
  }
}
