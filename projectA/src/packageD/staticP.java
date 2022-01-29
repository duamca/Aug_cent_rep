//Day_6 use of Static keyword 

package packageD;

public class staticP 
{
    static int a;
   public static void incre()
   {
	  a=a+1;
   }
   public static void main(String[] args)
   {
	staticP obj=new staticP();
	obj.incre();
	System.out.println("value of is= "+a);
	staticP.incre();
	System.out.println("new value if a is ="  +staticP.a);
	
  }
  }
