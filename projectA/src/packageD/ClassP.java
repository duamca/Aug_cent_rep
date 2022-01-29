//Day_6 Assignment 1 Parent class

package packageD;

public class ClassP 
{
   public void method()
   {
	   
	   System.out.println("Parent default parameterized method");
   }
   public void method1(int a)
   {	   
	   this.method();
	   System.out.println("Parent 1 parameterized method");
	   this.method3(5, 8, 9);
   }
   public void method2(int a,int b)
   {
	   this.method1(3);
	   System.out.println("Parent 2 parameterized method");
   }
   public void method3(int a, int b, int c)
   {
	   System.out.println("Parent 3 parameterized method");
   }
   public void method4(int a,int b, int c,int d)
   {	
	   this.method2(5, 8);
	   System.out.println("Parent 4 parameterized method");
   }
   
}
