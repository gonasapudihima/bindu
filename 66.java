/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int j,m=0,flag=0;      
		  int n;
		  Scanner sc=new Scanner(System.in);
		  n=sc.nextInt();
		  m=n/2;      
		  if(n==0||n==1)
		  {  
		   System.out.println("no");      
		  }
		  else
		  {  
		   for(j=2;j<=m;j++)
		   {      
		    if(n%j==0)
		    {      
		     System.out.println("no");      
		     flag=1;      
		     break;      
		    }      
   }      
   if(flag==0)
   {
   	System.out.println("yes"); 
   	
   }  
  }
	}
}
