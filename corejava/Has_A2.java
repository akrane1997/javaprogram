package corejava;
class Bike
{
	private String colour;
	private int maxSpeed;
	public void ShowInfo()
	{
		System.out.println("Bike Colour:"+colour+"\nMax Speed:"+maxSpeed);
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

} 
class Platina extends Bike
{
	public void platinastartDemo()
	{
		Engine e=new Engine();
		e.stop();
	}
}
class Engine
{
	public void start()
	{
		System.out.println("Engine Start");
	}
	
	public void stop()
	{
		System.out.println("Engine Stop");
	}
}
public class Has_A2 {
	public static void main(String[] args) {
		Platina p=new Platina();
		p.setColour("Red");
		p.setMaxSpeed(120);
		p.ShowInfo();
		p.platinastartDemo();
	}
}
