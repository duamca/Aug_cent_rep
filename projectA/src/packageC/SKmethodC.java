

package packageC;

public class SKmethodC extends SKmethodP
{
	
 public void supermethodchild()
 {
     super.a=45;
	 super.supermethod();
	 System.out.println("child class");
	 
 }
 public static void main(String[] args)
 {
	SKmethodC obj=new SKmethodC();
	obj.supermethod();
	obj.a=45;
	
	
}
}
