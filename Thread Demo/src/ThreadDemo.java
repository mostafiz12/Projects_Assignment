
public class ThreadDemo extends Thread {
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("The value of i is :"+i);
		}
	}

}

class DemoThread
{
	public static void main(String [] abc)
	{
		ThreadDemo td=new ThreadDemo();
		td.start();
	}	
}