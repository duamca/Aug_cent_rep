//Day_6 Polymorphism operator override  Child class


package packageD;

public class COverride extends POverride
{
 public void add(int a, int b)
 {
	 int c;
	 c=a*b;
	 System.out.println("c is= "+c);
 }
 public static void main(String[] args) {
	COverride obj=new COverride();
	obj.add(12, 7);
	
	
}
}

