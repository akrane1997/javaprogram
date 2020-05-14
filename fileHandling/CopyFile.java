package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InputStream in=null;
OutputStream out=null;
try
{
	in=new FileInputStream("text.txt");
	out=new FileOutputStream("test.txt");
	int read=0;
	while(read!=-1)
	{
		read=in.read();
		if(read!=-1)
			out.write(read);
	}
	System.out.println("Data copied successfully");
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
	try {
		out.close();
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
}
	}

}
