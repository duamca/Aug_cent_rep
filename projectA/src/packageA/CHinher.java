package packageA;

public class CHinher extends Pinher
{
 public CHinher()
 {
	 this(12,10);
	 System.out.println("child default constructor");
 }
 public CHinher(int a)
 {
	 this(12,13,14);
	 System.out.println("child  1 parameterized constructor");
 }
 public CHinher(int a, int b)
 { 
	 super(1,6);
	 System.out.println("child  2 parameterized constructor");
 }
 public CHinher(int a, int b, int c)
 {
	this();
	 System.out.println("child  3 parameterized constructor");
 }
 public static void main(String[] args)
 {
	CHinher obj=new CHinher(1);
	
	
	
	
	 
}
}
