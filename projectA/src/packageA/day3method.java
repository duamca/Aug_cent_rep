package packageA;

public class day3method
{
 public void m()
 {
	 System.out.println("default parameterized method");
 }
 public void m1()
 {
	 this.m3();
	 this.m4();
	 this.m();
	 System.out.println("one parameterized method");
	 this.m2();
 }
 public void m2()
 {
	 System.out.println("two parameterized method");
 }
 public void m3()
 {
	 System.out.println("three parameterized method");
 }
 public void m4()
 {
	 System.out.println("four parameterized method");
 }
 public static void main(String[] args) 
 {
	day3method obj=new day3method();
	obj.m1();
}
}
