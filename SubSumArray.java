package javatutorials;

import java.util.*;

// Sum of sub array 
// Linear way to solve the problem
// Input : [1,2,3,4,4] and sum = 8 -> It should return True as 4+4=8
// Input : [1,2,3,5,4] and sum = 8 -> It should return True as 3+5=8
// Input : [1,2,3,4,5] and sum = 8 -> It should return True as 3+5=8
// Input : [1,2,3,4,8] and sum = 8 -> It should return FALSE as nothing matches with the data

// Simple way is using 2 loops and find if sum of each no is equal to 8
// Issue : Time complexity will be O(N^2) as 2 loops will be iterated 

// Efficient solution : Use hashmap and store complement of each no in a map and match with array element
// Linearly, this will solve the issue

public class SubSumArray {

	public static void main (String args[])
	{
		Map m = new HashMap();
		int a [] = {1,2,4,5,17,3};
		int val = 8;
		List l = new ArrayList();
		int fl = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(m.containsValue(a[i])==false)
			{
				m.put(a[i],val-a[i] );
				System.out.println(m.containsValue(a[i]));
				System.out.println(m.get(i)+"<-->"+a[i]);
				fl=0;
			}
			else
			{
				System.out.println(m.containsValue(a[i]));
				System.out.println(m.get(i)+"<-->"+a[i]);
				fl=1;
				break;
			}
				
		}
		
		if(fl==1)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		
	}
	
}
