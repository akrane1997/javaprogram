package corejava;
class Animal1{
 void eat()
 {
	 System.out.println("Eating..");
 }
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("Dog barking");
	}
}
class Cat extends Animal1{
	void meowww(){
		System.out.println("cat meowww...");
	}
}
public class hierarchical_Inheritance {
public static void main(String[] args) {
	Cat c=new Cat();
	c.eat();
	c.meowww();
	Dog1 d=new Dog1();
	d.eat();
	d.bark();
}
}
