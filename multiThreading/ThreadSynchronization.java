package multiThreading;

import java.util.Scanner;

class HusbandThread implements Runnable
{
	Thread husband;
	Bank b;
	public HusbandThread(Bank b) {
		// TODO Auto-generated constructor stub
		this.b=b;
		husband =new Thread(this,"depositThread ");
		husband.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.deposit();
	}
	
}
class WifeThread implements Runnable
{
	Thread wife;
	Bank b;
	public WifeThread(Bank b)
	{
		this.b=b;
		wife=new Thread(this,"withdrawthread");
		wife.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.withdraw();
	}
	
}
class Bank
{
	private volatile double balance=50000;
	private int withdrawamt;
	private int depositamt;
	
	public synchronized double deposit()
	{
		try
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("Balance before Deposit : "+balance);
			Thread.sleep(1000);
			System.out.println("Enter deposit Amount:");
			depositamt=sc.nextInt();
			Thread.sleep(500);
			balance=balance+depositamt;
			Thread.sleep(500);
			System.out.println("Balance After deposit : "+balance);
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		return balance;
	}
	
	public synchronized double withdraw() {
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Balance Before Withdraw: "+balance);
			Thread.sleep(1000);
			System.out.println("Enter Withdraw amount:");
			withdrawamt=sc.nextInt();
			Thread.sleep(500);
			balance=balance-withdrawamt;
			Thread.sleep(500);
			System.out.println("Balance After Withdraw : "+balance);
			
			
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		return balance;
	}
}
public class ThreadSynchronization {
public static void main(String[] args) {
	Bank b=new Bank();
	HusbandThread ht=new HusbandThread(b);
	WifeThread wt=new WifeThread(b);
}
}
