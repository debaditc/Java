package javatutorials;

import java.util.*;

// Sum of sub array 
// Linear way to solve the problem
// Input : [1,2,3,4,4] , Outout - 1,2,3,4
// Input : [1,12,13,5,14] , Output - 1,12,5,5
// Input : [11,2,23,4,51] , Output - 2,2,4,4

// Simple way is using 2 loops and find minimum value between a[i] and a[j] where j = i+1 and store it in seperate array
// Issue : Time complexity will be O(N^2) as 2 loops will be iterated 

// Efficient solution : Use 1 list or hashmap and store min of each no in a map (seperate method)
// Linearly, this will solve the issue

public class MinSubArray {

	public static int min (int [] arr , int count)
	{
		int min=0;
		if(arr[count] < arr[count-1])
		{
			min = arr[count] ;
		}
		else
		{
			min = arr[count-1] ;
		}
		//System.out.println(min);
		return min;
	}
	
	public static void main (String args[])
	{
		List m = new LinkedList();
		int a [] = {11,2,23,4,51};
		int val = 8;
		List l = new ArrayList();
		int fl = 0;
		System.out.println(a.length);

		for(int i=0;i< a.length;i++)
		{
			if (i!=0)
			{
				m.add(min(a,i) );
			}
			else
			{
				m.add(i,0 );
			}
	
			System.out.println(m.get(i));	
		}	

		
	}
	
	
	
}
