package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
public static void main(String[] args) {
	FileInputStream fi=null;
	try
	{
		fi=new FileInputStream("file:///home/akshay/Desktop/java/Core/src/fileHandling/read.txt");
		
		System.out.println("No of available bytes: "+fi.available());
		System.out.println("FIle data...");
		int read=fi.read();
		while(read!=-1)
		{
			read=fi.read();
			if(read==-1)
			System.out.println((char)read);
		}
		
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	finally
	{
		try
		{
			fi.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
}
