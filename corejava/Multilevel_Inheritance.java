package corejava;
class TV{
	void display()
	{
		System.out.println("function of TV:-displaying Motion pictures");
	}
}
class BlackandWhite extends TV{
	void black() {
		System.out.println("dispalying moives,serials in black and white format");
	}
}
class ColourTv extends BlackandWhite{

	void color() {
		System.out.println("dispalying movies and serials  in colour format");
	}
}
class SmartTv extends ColourTv{
	void smart() {
		System.out.println("You can access Youtube , internet on smart tv");
	}
}

public class Multilevel_Inheritance {
	public static void main(String[] args) {
		SmartTv s=new SmartTv();
		s.display();
		s.black();
		s.color();
		s.smart();
	}
}
