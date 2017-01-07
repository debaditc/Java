// Factorial using recursive method

package javatutorials;
import java.io.*;
import java.util.*;


public class Factorial {
	public static void main(String args[])
	{
		System.out.print("Enter a number : ");
		 Scanner scanner = new Scanner(System.in);
		 int nos=scanner.nextInt();
		 
		 Factorial fact = new Factorial();
		 
		long factorial = fact.factorialnos(nos);
		System.out.println("Factorial - " + factorial);
	}
	
	public int factorialnos(int no)
	{
		if (no == 1 || no == 0)
		{
			return 1;
		}
		else
		{
			return(no * factorialnos(no-1));
		}
	}

}
