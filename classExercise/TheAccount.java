package classExercise;

public class TheAccount {
	private String name;
	private int id;
	private double balance=0;
	int amount=5000;
	public TheAccount(String name, int id, double balance) {
		super();
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}



	public double credit(int x)
	{
		System.out.println("the credited amount is :"+amount);
		this.balance=amount+x;
		return balance;
	}

	public double debit(int x)
	{	amount=x;
		if (amount<=balance)
		{
			
			System.out.println("the debited amount is :"+amount);
			this.balance=amount-x;
			
		}
		else
		{
			System.out.println("Amount Exceeded");
		}
		return balance;
		
	}



	@Override
	public String toString() {
		return "TheAccount [name=" + name + ", id=" + id + ", balance=" + balance + ", amount=" + amount + "]";
	}
	public static void main(String[]args)
	{
		TheAccount t=new TheAccount("Hitesh",101,0);
		System.out.println(t);
		System.out.println();
		
		t.credit(5000);
		System.out.println("After Credit the account details:");
		System.out.println(t);
		System.out.println();
		
		t.debit(2000);
		System.out.println("After Debit the account Details:");
		System.out.println(t);
		
		
	}
}
