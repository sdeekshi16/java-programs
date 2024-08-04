import java.io.*;
import java.util.*;
class files
{
	public static void main(String[] args) throws IOException 
	{
		String str,str1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the file name to read the data");
		str=s.next();
		System.out.println("enter the file name to write the data");
		str1=s.next();
		FileInputStream fis=new FileInputStream(str);
		FileOutputStream fos=new FileOutputStream(str1);
		try 
		{
			int x;
			while((x=fis.read())!=-1)
				fos.write(x);
			System.out.println("data written into file..!!");

		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		finally
		{
			fis.close();
			fos.close();
		}
	}
}