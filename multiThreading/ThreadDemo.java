package multiThreading;

public class ThreadDemo {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	//currentThread() Containing Three Information 
	//1.Current Thread Name         - by default name is 'main'
	 //2.Priority of thread         - by default priority is '5'
	//3.Group of Thread             - by default Thread group is 'main'
	System.out.println("Current Thread: "+t);
	
	t.setName("My Thread");
	//change the name of Thread using setName().
	System.out.println("After name change: "+t);
	try {
		for(int n=6;n>0;n--)
		{
			System.out.println(n);
			System.out.println("Tread is sleeping");
			Thread.sleep(1000);
			System.out.println("Thread Woke up");
			
		}
	}
	catch(InterruptedException e)
	{
		System.out.println("Main Tread Interrupted");
	}
}
}
