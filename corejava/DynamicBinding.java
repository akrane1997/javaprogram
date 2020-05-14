package corejava;
class Animal3
{
	public void sound() {
		System.out.println("Some Animal Sound");
	}
}
class Dog3 extends Animal3{
	public void sound()
	{
		System.out.println("Dog sound is Wooofff");
	}
}
class Cat2 extends Animal3
{
	public void sound()
	{
		System.out.println("Cat sound maoooowwwww");
	}
}
public class DynamicBinding {
public static void main(String[] args) {
	System.out.println("Upcasting:");
	
	
	Animal3 a=new Dog3();
	a.sound();
	
	Animal3 a1=new Cat2();
	a1.sound();
	
	System.out.println("downcasting:");
    Dog3 d=(Dog3) a;
    d.sound();
    
    Cat2 c=(Cat2) a1;
    c.sound();
    
    
}
}
