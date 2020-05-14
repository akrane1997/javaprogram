package corejava;
class Outer{
	static int a=10;
	int b=20;
	private static int c=30;
	
	static class SaticInnerClass{
		void display()
		{
			System.out.println("value of a: "+a);
			//System.out.println("value of b: "+b);
			System.out.println("value of c: "+c);
		}
	}
	
}

public class Static_Inner_Class {
 public static void main(String[] args) {
	Outer.SaticInnerClass o=new Outer.SaticInnerClass();
	
	o.display();
}
}
