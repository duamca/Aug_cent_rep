package packageA;

public class Assignment1artmaticDay2
{
 public int multi(int a,int b)
  {
	  int c;
	  c=a*b;
	  return c;
  }
 public int sum(int a,int b)
 {
	 int c;
	 c=a+b;
	 return c;
  } 
 public int sub(int a,int b)
 {
	int c;
	c=a-b;
	return c;
 }
 public int div(int a,int b)
 {
	 int c;
	 c=a/b;
	 return c;
 }
 
 public static void main(String[] args)

 {
	 Assignment1artmaticDay2 obj=new Assignment1artmaticDay2();
	int mulresult= obj.multi(10, 2);
	System.out.println("multiplication result is= "+mulresult);
    int sumresult=obj.sum(mulresult, 2);
	System.out.println("sum1 result is= "+sumresult);
    sumresult=obj.sum(sumresult, 2);//void not return value
	System.out.println("sum2 result is= "+sumresult);
    int subresult=obj.sub(sumresult, 2);
	System.out.println("subration result is= "+subresult);
    int finalresult=obj.div(subresult, 2);
	System.out.println("final result of exp (10*2)+2)+2)-2)/2)))))= " +finalresult);
  }
 
}
 