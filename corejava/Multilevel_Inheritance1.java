package corejava;
class Car
{
	public Car()
	{
		System.out.println("Class Car");
	}
	public void vehicleType()
	{
		System.out.println("Vehicle Type : car");
	}
}
class Maruti extends Car
{
	public Maruti()
	{
		System.out.println("class Maruti");
	}
	public void brand()
	{
		System.out.println("Brand: Maruti");
	}
	public void speed()
	{
		System.out.println("Max:90kmph");
	}
}
class Maruti800 extends Maruti
{

	public Maruti800() 
	{ 
		System.out.println("Maruti Model:800");
	}
	public void speed()
	{
		System.out.println("Max:80kmph");
	}

}
public class Multilevel_Inheritance1 {

	public static void main(String[] args) {

		Maruti800 m=new Maruti800();
		m.vehicleType();
		m.brand();
		m.speed();
		
	}
}
