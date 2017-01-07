package javatutorials;

import java.io.*;
import java.util.*;

public class Fibonacci {
	
	public static void main(String argsp[])
	{
		System.out.print("Enter the range : ");
		Scanner scanner = new Scanner(System.in);
		int range = scanner.nextInt();
		
		Fibonacci obj = new Fibonacci();
		
		for (int i =0;i<range;i++)
		{
			int nos = obj.fibo(i);
			System.out.print(nos);
			if (i!=range-1)
			{
				System.out.print(",");
			}
		}
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
