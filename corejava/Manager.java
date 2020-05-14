package corejava;
public class Manager {
	static int count=0;
	
	String Mname,company,addr;
	
	public Manager(String name,String comp,String add)
	{
		this.Mname=name;
		this.company=comp;
		this.addr=add;
		count++;
	}
	void display()
	{
		System.out.println("\n\nManager name:"+Mname+" \nComapny Name:"+company+" \nAddress:"+addr);
	}
	public static void main(String[] args) {
		Manager m1=new Manager("Akshay","Barclays","Pune");
		m1.display();
		Manager m2=new Manager("Hitesh","TCS","Mumbai");
		m2.display();
		Manager m3=new Manager("Madhan","Google","Banglore");
		m3.display();
		Manager m4=new Manager("Kirti","Infosys","Pune");
		m4.display();
		Manager m5=new Manager("Tejas","CDAC","Chennai");
		m5.display();
		System.out.println("number of manager:"+count);

	}
}
