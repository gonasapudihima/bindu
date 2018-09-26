/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str1;
		Scanner sc=new Scanner(System.in);
		str1=sc.next();
		StringBuilder sb=new StringBuilder(str1);
		int n=str1.length();
		if(n%2!=0)
		{
			sb.setCharAt(n/2,'*');
			str1=sb.toString();
			System.out.print(str1);
		}
		else
		{
			sb.setCharAt(n/2,'*');
			sb.setCharAt(n/2-1,'*');
			str1=sb.toString();
			System.out.print(str1);
		}
	}
}
