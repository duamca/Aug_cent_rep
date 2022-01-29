package packageA;

import java.util.Scanner;

public class scann2 
{
public int mul(int a,int b)
	{
		int c;
		c=a*b;
		return c;
	}
public int sum(int a,int b)
   {
	int c;
	c=a+b;
	return c;
   }
public int sub(int a,int b)
{
	int c;
	c=a-b;
	return c;
}

public int div(int a,int b)
{
	int c;
	c=a/b;
	return c;
}
 public static void main(String[] args) 
 {
	scann2 obj=new scann2();
	Scanner sobj=new Scanner(System.in);
	System.out.println("please enter data");
	System.out.println("enter the value of x1 = ");
	int x1=sobj.nextInt();
	System.out.println("enter the value of x2 =  ");
	int x2=sobj.nextInt();
	int m=obj.mul(x1, x2);
	System.out.println("result of mul is=  "+m);
	System.out.println("enter the value of x3 = ");
	int x3=sobj.nextInt();
	int add=obj.sum(m, x3);
	System.out.println("result of sum is = "+add);
	System.out.println("enter the value of x4 =");
	int x4=sobj.nextInt();
	int add2=obj.sum(add, x4);
	System.out.println(" result of sum2 is = "+add2);
	System.out.println("enter the value of x5= ");
	int x5=sobj.nextInt();
	int s=obj.sub(add2, x5);
	System.out.println("result of sub is=  "+s);
	System.out.println("enter the value of x6=");
	int x6=sobj.nextInt();
	int d=obj.div(s,x6 );
	System.out.println("final result of expression is (((((x1*x2)+x3)+x4)-x5/x6)="  +d);
		
}
}
