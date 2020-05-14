package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("text.txt");
	String str="Java is secure";
	char ch[]=str.toCharArray();
	fw.write(65);
	fw.write('B');
	fw.write(ch, 2, 4);
	System.out.println("Data added Successfully");
	fw.close();
	
}
}
