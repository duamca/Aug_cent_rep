package packageA;

public class Const1
{
  public Const1()
  {
	  this(5,8,9);
	System.out.println("default constructor");  
  }
  public Const1(int a)
  {  
	  this(7,6,9,8); 
	  System.out.println("one parameterized constructor");
  }
  public Const1(int a,int b,int c, int d)
  {
	  this(); 
	  System.out.println("four parameterized constuctor");
  }
  public Const1(int a, int b)
  {
	  this(7); 
	  System.out.println("two parameried constructor");
  }
  public Const1(int a,int b,int c)
    {
	  	  System.out.println("three parameterized constuctor");
  }
  public static void main(String[] args)
  {
	  Const1 obj=new Const1(6,5);
  }
}
