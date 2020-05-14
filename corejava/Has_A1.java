package corejava;
class Address {
	String city,state;
	public Address(String city,String state)
	{
		this.city=city;
		this.state=state;
	}
}
 class Employee{
	 Address addr;
	 int id;
	 String name;
	 public Employee(int id,String name,Address addr)
	 {
		 this.id=id;
		 this.name=name;
		 this.addr=addr;
	 }
	 
	 void display() {
		 System.out.println(id+" "+name);
		 System.out.println("city:"+addr.city+" state:"+addr.state);
	 }
 }
public class Has_A1 {
	public static void main(String[] args) {
		
	Address addr1=new Address("Kalyan", "Maharashtra");
	Address addr2=new Address("Kolshewadi", "Maharashtra");
	Employee e1=new Employee(1, "Akshay", addr1);
	Employee e2=new Employee(2 , "Hitesh", addr2);
	
	e1.display();
	e2.display();

	}
}
