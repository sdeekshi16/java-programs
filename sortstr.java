import java.io.*;
class sortstr
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str[]=new String[10],temp;
		int no,i,j;
		System.out.println("enter strings count");
		no=Integer.parseInt(br.readLine());
		System.out.println("enter the "+no+"strings");
		for(i=0;i<no;i++)
		{
			str[i]=br.readLine();
		}
		System.out.println("strings before sorting");
		for(i=0;i<no;i++)
		{
			System.out.println(str[i]);
		}
		for(i=0;i<no;i++)
		{
			for(j=0;j<no;j++)
		   {
			 if(str[i].compareTo(str[j])<0)
			 {
			 	temp=str[i];
			 	str[i]=str[j];
			 	str[j]=temp;
			 }
		   }
		}
		System.out.println("strings after sorting");
		for(i=0;i<no;i++)
		{
			System.out.println(str[i]);
		}
	}

}