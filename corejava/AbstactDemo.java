package corejava;
abstract class Animal2
{
	abstract void sound();
} 
class Dog2 extends Animal2{

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Wooooooff");
	}
	
}
public class AbstactDemo {
public static void main(String[] args) {
	Dog2 d=new Dog2();
	d.sound();
}
}
