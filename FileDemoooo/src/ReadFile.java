import java.io.File;
import java.util.Scanner;
import java.util.*;
import java.io.*;


public class ReadFile 
{
	 
		Scanner x;
		public void openFile()
		{
			try
			{
			x=new Scanner(new File("abc.txt"));
			}
			catch(Exception e)
			{
				System.out.println("There is no such a file");
			}
		}
	public void readFile()
	{
	while(x.hasNext())
	{
	String a=x.next();
	String b=x.next();
	String c=x.next();

	System.out.printf("%s %s %s\n",a,b,c);


	}
	}


	public void closeFile()
	{
	x.close();	
	}

	}



