package corejava;

import java.util.Scanner;

interface CreditCard
{
	void rupees();
	void dollars();
	void ponds();
	void euro();
}
class Bank implements CreditCard
{

	@Override
	public void rupees() {
		// TODO Auto-generated method stub
		System.out.println("Accept only Ruppes.");
	}

	@Override
	public void dollars() {
		// TODO Auto-generated method stub
		System.out.println("Accept only Dollars.");
	}

	@Override
	public void ponds() {
		// TODO Auto-generated method stub
		System.out.println("Accept only Pounds.");
	}

	@Override
	public void euro() {
		// TODO Auto-generated method stub
		System.out.println("Accept only Euro.");
	}

}
public class InterfaceDemo {
	static String currency;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("System Accept Below Currency");
		System.out.println("1.Rupees"
				+ "\n2.Dollars "
				+ "\n3.Pounds"
				+ "\n4.Euro");
		System.out.println("Enter Which currency You accept");
		currency=sc.nextLine();

		switch(currency)
		{
		case "Rupees":
			b.rupees();
            break;
            
		case "Dollars":
			b.dollars();
			break;
			
		case "Pounds":
			b.ponds(); 
			break;
			
		case "Euro":
			b.euro();
			break;
	   default:
		   System.out.println("Invalid choice.");
		}

	}

}
