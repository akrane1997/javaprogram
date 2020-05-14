package multiThreading;
class ChildThread1 implements Runnable
{
	Thread child1;
	public ChildThread1() {
		// TODO Auto-generated constructor stub
		child1=new Thread(this,"Demo Thread");
		child1.start();
		child1.setName("demoChild");
		child1.setPriority(Thread.MIN_PRIORITY);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Execution of child thread start from here...");
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
			System.out.println("child Interrupted ");
		}
		System.out.println("Exiting child Thread.");
	}
	
}
public class RunnebleDemo {
public static void main(String[] args) {
	ChildThread1 ct=new ChildThread1();
	/*
	 * Thread ct1=new Thread(ct); ct1.start(); ct1.setName("Demo");
	 */
}
}
