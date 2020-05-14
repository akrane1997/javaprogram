package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FIleCharRead {
public static void main(String[] args) {
	Reader r=null;
	try
	{
		r=new FileReader("test.txt");

		int read=0;
		while(read!=-1) {
			read=r.read();
			if(read!=-1)
				System.out.print((char)read);
		}
	}
	catch(FileNotFoundException e)
	{
		System.out.println(e);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	
}
}
