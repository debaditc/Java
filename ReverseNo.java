package javatutorials;

/* Input = -123 , Output = -321
* Input = -120 , Output = -12
* Input = 123 , Output = 321
* Input = 1200 , Output = 21
*/

import java.util.*;

public class ReverseNo {

	
	public static void main(String args [])
	{
		int num =-1234601;
		List arr = new ArrayList();
		int count =0 ;
		if(num > 0)
		{
			while(num > 0)
			{
				int r = num%10;
				arr.add(count, r);
				num = num/10;
				count++;
			}
			int first = (int) arr.get(0);
			if (first !=0)
			{
				Object[] a = arr.toArray();
				for (int i=0;i<a.length;i++)
				{
					System.out.print(a[i]);
				}
			}
			else
			{
				arr.remove(0);
				Object[] a = arr.toArray();
				for (int i=0;i<a.length;i++)
				{
					System.out.print(a[i]);
				}
			}
		}
		else
		{
			int num1 = Math.abs(num);
			if(num1 > 0)
			{
				while(num1 > 0)
				{
					int r = num1%10;
					arr.add(count, r);
					num1 = num1 /10;
					count++;
				}
			}
			int first = (int) arr.get(0);
			if (first !=0)
			{
				Object[] a = arr.toArray();
				System.out.print("-");
				for (int i=0;i<a.length;i++)
				{
					System.out.print(a[i]);
				}
			}
			else
			{	
				arr.remove(0);
				Object[] a = arr.toArray();
				System.out.print("-");
				for (int i=0;i<a.length;i++)
				{
					System.out.print(a[i]);
				}
			}
				
			
			
		}
		
	}
}
