package javatutorials;

import java.util.Scanner;

/*
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

	1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

	By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class euler2_evenfibonacci {

	public static void main(String args[])
		{
			System.out.print("Enter the range : ");
			Scanner scanner = new Scanner(System.in);
			int range = scanner.nextInt();
			int s=0;
			Fibonacci obj = new Fibonacci();
			
			for (int i =0;i<range;i++)
			{
				int nos = obj.fibo(i);
				if(nos%2==0)
				{
					s=s+nos;
				}
			}
			System.out.println("Sum - " + s );
		}
		
		public int fibo(int r)
		{
			if (r==0 )
			{
				return 0;
			}
			else if (r==1)
			{
				return 1;
			}
			else
			{
				return(fibo(r-1)+fibo(r-2));
			}
			
		}
	
}
