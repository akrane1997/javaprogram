package classExercise;

class Employee {
	private int id;
	private String Firstname;
	private String Lastname;
	private double salary;
	
	Employee()
	{
		
	}

	public Employee(int id, String firstname, String lastname, double salary) {
		super();
		this.id = id;
		Firstname = firstname;
		Lastname = lastname;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "TheEmp [id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", salary=" + salary
				+",  Anual Salary= "+Annualsal()+ "]";
	}
	
	public double Annualsal()
	{
		return 12*salary;
	}
}
	public class TheEmployee{
		
	public static void main(String[]args)
	{
		Employee e=new Employee();
		Employee e1=new Employee(1,"Hitesh","Sonar",12000);
		System.out.println(e1);
		System.out.println();
		System.out.println("Adding Second Employee Details:");
		e1.setId(2);
		e1.setFirstname("Akshay");
		e1.setLastname("Rane");
		e1.setSalary(20000);
		System.out.println(e1);
		
	}

}
