package corejava;


public class Exception_Demo1 {
public static void main(String[] args) {
	try{
		int arr[]=new int[4];
		arr[5]=40;
		System.out.println("arr[0] value is :"+arr[0]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("u put wrong input");
		}
	}

}

