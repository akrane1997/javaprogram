package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) {

		FileOutputStream out=null;
		try
		{
			out=new FileOutputStream("text.txt");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String: ");
			String str=sc.next();
			byte data[]=str.getBytes();
			out.write(data);
			System.out.println("data added successfully");

		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				out.close();

			}
			catch(IOException e)
			{
				System.out.println(e);
			}
		}
	}
}
