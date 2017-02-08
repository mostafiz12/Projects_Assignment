
abstract class AbstractClassDemo {
abstract void call();
void cllmetoo()
{
	System.out.println("This is a normal method");
}
}

class Demo extends AbstractClassDemo
{
	void call()
        {
		System.out.println("Implementation in Demo class");
        
        }
	}
class AbstractDemo
{
public static void main(String[] args)
{
  Demo d=new Demo();
  d.call();
  d.cllmetoo();
}
}
