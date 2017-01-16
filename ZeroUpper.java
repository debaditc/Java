package javatutorials;
/* Push zeros to upwards */

import java.util.*;

public class ZeroUpper {

	public static void main(String args[])
	{
		List<Integer> l = new LinkedList<Integer>();
		List<Integer> m = new LinkedList<Integer>();
		l.add(1);l.add(-1);l.add(11);l.add(0);l.add(0);l.add(0);
		
		System.out.println(l.size());
		int count =0;
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==0)
			{
				System.out.println("I am here " + i);
				m.add(count, l.get(i));
				count++;
			}
			else
			{
				m.add(i, l.get(i));
			}
		}
		System.out.println(m);
		
		
	}
	
}
