package javatutorials;

/*
 * Given an array of positive integers and a target total of X, find if there exists a contiguous subarray with sum = X 

	[1, 3, 5, 18] X = 8 Output: True 
	X = 9 Output: True 
	X = 10 Output: False 
	X = 40 Output :False

 */

public class SubArraySum {

	public static void main(String args[])
	{
		int [] x = {1,3,5,18};
		int fl=0;
		int num=27;
		outerloop:
		for(int i=0;i<x.length;i++)
		{
			for(int j = 0 ; j < x.length; j++)
			{
				int sum1=0;
				for (int k=i ; k < j+1; k++)
				{
						//System.out.print(x[k]+" ");
						sum1 += x[k];
				}
				//System.out.print("=" + sum1);
				
				if (sum1 == num )
				{
					fl=1;
					break outerloop;
				}
				else
				{	fl=0;
				}
			}

			
			
		}
		if(fl==1)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
	}
	
}
