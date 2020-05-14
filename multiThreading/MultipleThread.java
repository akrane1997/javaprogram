package multiThreading;
class ChildThreads implements Runnable
{
	Thread child;
	public ChildThreads(String name) {
		// TODO Auto-generated constructor stub
		child=new Thread(this,name);
		child.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		System.out.println("execution of "+name+" strats from here....");

		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name+" : "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Interrupted");
		}
		System.out.println("Exiting "+name);
	}

}
public class MultipleThread {
	public static void main(String[] args) {
		ChildThreads ct1=new ChildThreads("Child 1");
		ChildThreads ct2=new ChildThreads("Child 2");
		ChildThreads ct3=new ChildThreads("Child 3");

		try {
			for(int i=5;i>0;i--)
			{
				System.out.println("main Thread : "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("main thread Interrupted.");
		}
		System.out.println("main thread exiting .");
	}
}
