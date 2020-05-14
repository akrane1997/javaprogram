package multiThreading;
class ChildThread2 implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Execution of child tread start from here...");
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
			System.out.println("child Interrupted");
		}
		System.out.println("Exiting Child Thread.");
	}

}
class CreateThread
{
	Thread child;
	public CreateThread(ChildThread2 ct) {
		// TODO Auto-generated constructor stub
		child=new Thread(ct,"Childthread");
		child.start();
		child.setPriority(Thread.MIN_PRIORITY);

	}
}
public class RunnebleDemo1 {
	public static void main(String[] args) {
		ChildThread2 ct=new ChildThread2();
		CreateThread t=new CreateThread(ct);
	}
}
