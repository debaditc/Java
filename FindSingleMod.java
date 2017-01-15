package javatutorials;
/* Given an array of integers, every element appears twice except for one. Find that single one.
 * Input : [1 2 2 3 1]
 * Output : 3
 */

/* Time Complexity : O(N) */

import java.util.*;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class FindSingleMod {

	public static void main(String args[])
	{
		int [] x = {6,2,2,4,2,5};
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		int i=0,j=0;
		//a =null;
		int num = x.length;
		System.out.println(num);
		//calculating frequency
		try {
			for(i=0;i<x.length;i++)
			{
				System.out.println("Array - " + x[i]);
				if (a.contains(x[i]))
				{
					b.add(x[i]);
				}
				else
				{
					a.add(x[i]);
				}
				
			}
			
			a.removeAll(b);
			System.out.println("A--"+a);
			
		}
		catch (Exception e) {
		     
		}
		//System.out.println(a.size());
		
		
	}
}
