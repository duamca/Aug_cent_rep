package packageA;

public class Assignment2artmatic2Day2
{
 public int div(int a,int b)
  {
	  int c;
	  c=a/b;
	  return c;
  }
 public int sub(int a,int b)
 {
	 int c;
	 c=a-b;
	 return c;
  } 
 public int sum(int a,int b)
 {
	int c;
	c=a+b;
	return c;
 }
 public int mul(int a,int b)
 {
	 int c;
	 c=a*b;
	 return c;
 }
 
 public static void main(String[] args)
 {
	 Assignment2artmatic2Day2 obj=new Assignment2artmatic2Day2();
	int divresult= obj.div(10, 2);
	System.out.println("division result is= "+divresult);
    int subresult=obj.sub(divresult, 2);
	System.out.println("subtraction result is= "+subresult);
	int sumresult=obj.sum(subresult, 2);
  	System.out.println("Addition result is= "+sumresult);
    subresult=obj.sub(sumresult, 2);
	System.out.println("subration2 result is= "+subresult);
	obj.mul(subresult, 2);
    //int finalresult=obj.mul(subresult, 2);
	System.out.println("final result of exp  (10/2)-2)+2)-2)*2)))))= "+obj.mul(subresult,2));
    
    
 }
 
}
 