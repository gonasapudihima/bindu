/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int m,rev=0,n=0;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		while(m>0){
			
		n=m%10;
		rev=rev*10+n;
		
			m=m/10;
		}
		System.out.print(rev);
	}
}
