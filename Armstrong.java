package javatutorials;

import java.util.*;

public class Armstrong {
	private static Scanner sc;
  
	public static void main(String args[])
	{
		System.out.print("Enter the no : ");
		sc = new Scanner(System.in);
		int nos = sc.nextInt();
	
		Armstrong pali = new Armstrong();
		
		for (int i=0;i<nos;i++)
		{
			int s = 0;
			s=pali.arms(i);	
			if(s == i)
			{
				System.out.println(i);
			}
		}
	}
	
	public int arms(int nos)
	{
		int sum=0;
		while(nos>0)
		{
			int rem = nos%10;
			sum += rem*rem*rem;
			nos=nos/10;
		}
		return(sum);
	}

}
