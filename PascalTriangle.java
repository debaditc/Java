package javatutorials;

import java.util.Scanner;

public class PascalTriangle {

	private static Scanner scanner;

	public static void main(String argsp[])
	{
		System.out.print("Enter the range :");
		scanner = new Scanner(System.in);
		int range = scanner.nextInt();
		
		PascalTriangle obj = new PascalTriangle();
		
		for (int i =0;i<range;i++)
		{
			for (int j=0; j < i;j++)
			{
				System.out.print(obj.pascal(j,i));
			}
			System.out.println("");
		}
		
	}
	
	public int pascal(int c,int r)
	{
		if (c==0 || c==r)
		{
			return 1;
		}
		else
		{
			return (pascal(c,r-1)+pascal(c-1,r-1));
		}
	}
}

