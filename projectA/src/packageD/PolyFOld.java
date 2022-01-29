//Day_6 Polymorphism method overloading

package packageD;

public class PolyFOld
{
  public void mul(int a,int b)
  {
	  int c;
	  c=a*b;
	  System.out.println("result is="+c);
	  
  }
  public void mul(int a,double b)
  {
	  double d;
	  d=a*b;
	  System.out.println("result of float multi="+d);
  }
  public static void main(String[] args) 
  {
	PolyFOld obj=new PolyFOld();
	obj.mul(12,12.6);
	obj.mul(12,5);
	
}
}
