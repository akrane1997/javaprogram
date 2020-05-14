package classExercise;
class Rectangle
{
	private float length;
	private float width;
	public Rectangle()
	{
		length=5.0f;
		width=12.0f;
	}
	public Rectangle(float l,float w)
	{
		this.length=l;
		this.width=w;
	}
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public double getArea() {
		return length*width;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", Area=" + getArea() + "]";
	}
	
	
}
public class TestRectangle {
	public static void main(String[] args) {
		System.out.println("using original values initial in constructor:");
		Rectangle r=new Rectangle();
		System.out.println(r);
		System.out.println();
		
		System.out.println("dynamical initial values:");
		Rectangle r1=new Rectangle();
		r1.setLength(10f);
		r1.setWidth(12.0f);
		
		System.out.println(r1);
		
	}
}
