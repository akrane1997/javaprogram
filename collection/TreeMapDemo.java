package collection;

import java.util.*;

class Employee
{
	int id;
	String name,city;
		int salary;
	public Employee(int id,String name,String city,int salary) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.city=name;
		this.salary=salary;
		
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	
}
public class TreeMapDemo {
public static void main(String[] args) {
	TreeMap<Integer,Employee> t=new TreeMap<>();
	Employee e1=new Employee(10001,"Hitesh" , "kolshewadi", 25000);
	Employee e2=new Employee(10002,"Rohan" , "kdmc", 100000);
	Employee e3=new Employee(10003,"satish" , "hanuman nagar", 13000);
	Employee e4=new Employee(10004,"Akshay" , "chinchpada", 28000);
	
	t.put(1, e1);
	t.put(3, e2);
	t.put(5, e3);
	t.put(2, e4);
	
	Iterator<Map.Entry<Integer,Employee>> itr=t.entrySet().iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
