/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int number1;
          Scanner sc=new Scanner(System.in);
          number1=sc.nextInt();

        
        for(int i = 1; i <= number1; ++i) {
            if (number1 % i == 0) {
                System.out.print(i + " ");
            }
        }
	}
}
