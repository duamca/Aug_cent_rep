package packageA;

import java.util.Scanner;

public class scann 
{
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
public int mul(int a,int b)
{
	int c;
	c=a*b;
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
	scann obj=new scann();
	Scanner sobj=new Scanner(System.in);
	System.out.println("please enter data");
	System.out.println("enter the value of x1 = ");
	int x1=sobj.nextInt();
	System.out.println("enter the value of x2 =  ");
	int x2=sobj.nextInt();
	int add=obj.sum(x1, x2);
	System.out.println("result ox sum is=  "+add);
	System.out.println("enter the value of x3 = ");
	int x3=sobj.nextInt();
	int s=obj.sub(add, x3);
	System.out.println("result ox sub1 is = "+s);
	System.out.println("enter the value of x4 =");
	int x4=sobj.nextInt();
	int s2=obj.sub(s, x4);
	System.out.println(" result of sub2 is = "+s2);
	System.out.println("enter the value of x5= ");
	int x5=sobj.nextInt();
	int m=obj.mul(s2, x5);
	System.out.println("result of div is=  "+m);
	System.out.println("enter the value of x6=");
	int x6=sobj.nextInt();
	int d=obj.div(m, x6 );
	System.out.println("final result of expression is (((((x1+x2)-x3)-x4)*x5/x6)=" +d);
		
}
}
