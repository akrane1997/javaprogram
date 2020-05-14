package multiThreading;
class Operation
{
	int n;
	volatile boolean flagset=false;
	synchronized int get()
	{
		if(flagset==false)
			try
		{
				wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted exception caught");
		}
		System.out.println("Got: "+n);
		flagset=false;
		notify();
		return n;

	}
	synchronized void put(int n)
	{
		if (flagset==true)
			try 
		{
				wait();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted exception caught");
		}
		this.n=n;
		flagset=true;
		System.out.println("put: "+n);
		notify();

	}

}
class producer implements Runnable
{	
	Thread pro;
	Operation q;
	public producer(Operation q) {
		// TODO Auto-generated constructor stub
		this.q=q;
		pro=new Thread(this,"Producer");
		pro.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		try
		{
			while(true)
			{
				q.put(i);
				i++;
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
class Consumer implements Runnable
{
	Thread con;
	Operation q;

	public Consumer(Operation q) {
		// TODO Auto-generated constructor stub
		this.q=q;
		con=new Thread(this,"Consumer");
		con.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				q.get();
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}

public class ProducerConsumerProblem {
	public static void main(String[] args) {
		Operation q=new Operation();
		producer pro=new producer(q);
		Consumer con=new Consumer(q);
	}


}
