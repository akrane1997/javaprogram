package corejava;
class MyException extends Exception{
	String str1;
	  
	   MyException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}

public class UserDefine_Exception {
	public static void main(String[] args) {
		
	
	try{
		throw new MyException("This is My error Message");
	}
	catch(MyException e){
		System.out.println(e) ;
	}
	finally {
		System.out.println("Finally block execute once");
	}
}
}
