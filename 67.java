/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int k,m;
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		m=k+10;
		for(int i=k+1;i<=m;i++)
		{
			if(i%10==0)
			{
				System.out.print(i);
			}
		}
	}
}
