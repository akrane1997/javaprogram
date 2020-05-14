package multiThreading;
class ChildThread extends Thread
{
	ChildThread()
	{
		super("demochild");
		//assign name to the Thread
		start();
	}
	
	public void run()
	{
		System.out.println("Execution of Child Thread Start From Here....");
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(Thread.currentThread().getName()+" : "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Interruped.");
		}
		System.out.println("Exiting Child Thread.");
	}
}
public class ExtendThreadDemo {
public static void main(String[] args) {
	ChildThread ct=new ChildThread();
}
}
