package multiThreading;

import java.util.Scanner;

class HusbandThread1 implements Runnable
{
	Thread husband;
	Bank1 b;
	Scanner sc=new Scanner(System.in);
	public HusbandThread1(Bank1 b) {
		// TODO Auto-generated constructor stub
		this.b=b;
		husband=new Thread(this,"DepositThread");
		husband.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int depositamt;
		synchronized(b)
		{
			System.out.println("Balance before Deposit: "+b.getBalance());
			System.out.println("Enter Deposit amount:");
			depositamt=sc.nextInt();
			double balance=b.diposit(depositamt);
			System.out.println("Balance after deposit:"+balance);

		}
	}	

}
class WifeThread1 implements Runnable
{
	Thread wife;
	Bank1 b;
	Scanner sc=new Scanner(System.in);
	public WifeThread1(Bank1 b) {
		// TODO Auto-generated constructor stub
		this.b=b;
		wife=new Thread(this,"WithdawThread");
		wife.start();


	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int withdrawamt;
		synchronized(b)
		{
			System.out.println("Balance before withdraw: "+b.getBalance());
			System.out.println("Enter withdraw amount: ");
			withdrawamt=sc.nextInt();
			double balance=b.withdraw(withdrawamt);
			System.out.println("balance after withdraw : "+balance );

		}
	}

}


class Bank1
{
	private volatile double balance=50000;
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double diposit(int depositamt)
	{
		try
		{
			Thread.sleep(500);
			balance=balance+depositamt;
			Thread.sleep(1500);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		return balance;
	}
	public double withdraw(int withdrawamt) 
	{
		try
		{
			Thread.sleep(500);
			balance=balance-withdrawamt;
			Thread.sleep(1500);

		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		return balance;
	}


}
public class ThreadSynchronizationBlock {
	public static void main(String[] args) {
		Bank1 b=new Bank1();
		HusbandThread1 ht=new HusbandThread1(b);
		WifeThread1 wt=new WifeThread1(b);
	}
}
