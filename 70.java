/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i=0,m=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=n;
		while(n>2)
		{
			if(n%2==1)
			{
				i++;
				break;
			}
			n=n/2;
		}
		if(i==1)
		{
			
		}
		else
		{
			System.out.print(m*2);
		}
	}
}
