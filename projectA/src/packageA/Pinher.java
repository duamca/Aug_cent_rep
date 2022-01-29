package packageA;

public class Pinher
{
 public Pinher()
 {
	 this(12,7,9);
	 System.out.println("parent default constructor");
 }
 public Pinher(int a)
 {
	 this();
	 System.out.println("parent 1 parameterized constructor");
 }
 public Pinher(int a, int b)
 {  
	 this(2);
	 System.out.println("parent 2 parameterized constructor");
 }
 public Pinher(int a, int b, int c)
 {
	
	 System.out.println("parent 3 parameterized constructor");
 }
}
