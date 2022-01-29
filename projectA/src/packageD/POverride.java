
//Day_6 Polymorphism operator override  Parent class


package packageD;

public class POverride 
{
 public void add(int a, int b)
 {
	 int c;
	 c=a+b;
	 System.out.println("c is= "+c);
 }
 public static void main(String[] args) {
	POverride obj=new POverride();
	obj.add(12, 7);
	
	
}
}

