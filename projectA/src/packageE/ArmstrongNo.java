//Day7 Assignment-5 Number is Armstrong or not 

package packageE;

import java.util.Scanner;

public class ArmstrongNo 
{
   public static void main(String[] args) 
   {
	System.out.println("please enter the number");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int temp=num; 
	int r;
	int sum=0;
	while(num>0)
	{
		r=num%10;
		sum=sum+(r*r*r);
		num=num/10;
	}
	if(temp==sum)
	System.out.println("you press a Armstrong number");
		
	else
		System.out.println("it is not a Armstrong number");
	
	
}
}
