
//Day_6 Assignment 1 Child class

package packageD;

public class ClassC extends ClassP
{
	public void method5()
	   {
		this.method7(6, 9);
		System.out.println("child default parameterized method");
	   }
	public void method6(int a)
	   {
			this.method9(6,8,9,4);	
		System.out.println("child 1 parameterized method");
	   }
	public void method7(int a, int b)
	   {
		this.method8(9, 6, 4);
		   System.out.println("child 2 parameterized method");
	   }
	public void method8(int a, int b,int c)
	   {
		   super.method4(5,8,9,5);
		   System.out.println("child 3 parameterized method");
	   }
	public void method9(int a, int b, int c,int d)
	   {
		   this.method5();
		   System.out.println("child 4 parameterized method");
	   }
	public static void main(String[] args)
	{
		ClassC obj=new ClassC();
		obj.method6(6);
	}
 
}
