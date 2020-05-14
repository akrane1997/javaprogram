package corejava;
class Animal{
	void eating() {
		System.out.println("Animal can eat ");
	}
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("DOg barking...");
	}
	void legs()
	{
		System.out.println("Dog has 4 legs.");
	}
}


public class SinglelevelInheritance {
public static void main(String[] args) {
	Dog d=new Dog();
	d.eating();
	d.bark();
	d.legs();
}
}
