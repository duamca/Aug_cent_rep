//Day7 Assignment-6 Table of any number

package packageE;

import java.util.Scanner;

public class TableAnyNo 
{
   public static void main(String[] args)
   {
          Scanner obj=new Scanner(System.in);
		   System.out.println("enter the number");
		  int num=obj.nextInt();
		   	int i;	
		for(i=1;i<=10;i++)
		{
			System.out.println(num+ "*" +i+"="+num*i);
		}
}
}