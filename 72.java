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
        Scanner sc = new Scanner(System.in);
		
       
       str1=sc.next();
	int count=0;
	for(int i=0;i<=str1.length()-1;i++)
	{
        if(str1.charAt(i)=='a' || str1.charAt(i)=='A' || str1.charAt(i)=='e' || str1.charAt(i)=='E' ||
        str1.charAt(i)=='i' || str1.charAt(i)=='I' || str1.charAt(i)=='o' || str1.charAt(i)=='O' ||
        str1.charAt(i)=='u' || str1.charAt(i)=='U')
        {
        	count++;
        }
	}
        if(count==0)
        {
            System.out.print("no");
        }
        else
        {
            System.out.print("yes");
        }
	}
	}
        
