/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str1, rev = "";
      Scanner sc = new Scanner(System.in);
 
     
      str1 = sc.nextLine();
 
      int length = str1.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str1.charAt(i);
 
      if (str1.equals(rev))
         System.out.println("yes");
      else
         System.out.println("no");
 
	}
}
