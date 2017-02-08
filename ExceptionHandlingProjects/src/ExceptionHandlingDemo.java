
public class ExceptionHandlingDemo {
public static void main(String[] ar)
{
  int a=5,b=0;
  try
  {
	 int  c=a/b;
	 System.out.println(c);
  }
  catch(ArithmeticException e)
  {
	  System.out.println("There is an exception");
  }
  
}
}
