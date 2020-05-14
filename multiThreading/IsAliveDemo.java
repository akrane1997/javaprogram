package multiThreading;
class ChildThreads1 implements Runnable
{
	Thread child;
	public ChildThreads1(String name) {
		// TODO Auto-generated constructor stub
		child=new Thread(this,name);
		child.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		System.out.println("Execution of "+name+" started from here....");
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
			System.out.println("child Interrupted");
		}
		System.out.println(name+" exiting .");
	}

}
public class IsAliveDemo {
	public static void main(String[] args) {
		ChildThreads1 ct1=new ChildThreads1("child 1");
		ChildThreads1 ct2=new ChildThreads1("child 2");
		ChildThreads1 ct3=new ChildThreads1("child 3");
		System.out.println(ct1.child.getName()+" is Alive ? "+ct1.child.isAlive());
		System.out.println(ct2.child.getName()+" is Alive ? "+ct2.child.isAlive());
		System.out.println(ct3.child.getName()+" is Alive ? "+ct3.child.isAlive());

		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("main thread : "+i);
				Thread.sleep(1000);
			}
			System.out.println("Main Thread Waiting");
			ct1.child.join();
			ct2.child.join();
			ct3.child.join();
			System.out.println(ct1.child.getName()+" is Alive ? "+ct1.child.isAlive());
			System.out.println(ct2.child.getName()+" is Alive ? "+ct2.child.isAlive());
			System.out.println(ct3.child.getName()+" is Alive ? "+ct3.child.isAlive());
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting");
	}
}
