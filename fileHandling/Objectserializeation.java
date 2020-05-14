package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Objectserializeation {
public static void main(String[] args) throws IOException {
	FileOutputStream out=null;
	ObjectOutputStream objOut=null;
	out=new FileOutputStream("test.txt");
	objOut=new ObjectOutputStream(out);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Id: ");
	int id=sc.nextInt();
	System.out.println("Enter name: ");
	String name=sc.next();
	System.out.println("Enter Email id: ");
	String email=sc.next();
	System.out.println("ENter Password: ");
	String pass=sc.next();
	
	Employee emp=new Employee();
	emp.setId(id);
	emp.setName(name);
	emp.setEmail(email);
	emp.setPassword(pass);
	
	objOut.writeObject(emp);
	System.out.println("Successfully added .");
	
}
}
