package corejava;
interface Employee1{
	int emp_id=1;
	String name = "Akshay";
	String Company_Name="Google";
	void empInfo();
}
public class AnonymousDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Employee1 e=new Employee1() {
			
			@Override
			public void empInfo() {
				// TODO Auto-generated method stub
				System.out.println("Information About Employee:");
				System.out.println("Employee Id: "+emp_id
						          +"\nEmployee Name: "+name
						          +"\nCompany Name: "+Company_Name);
			}
		};e.empInfo();
	}

}
