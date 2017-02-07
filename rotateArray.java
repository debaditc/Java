package javatutorials;

import java.util.*;
/*
 * Rotate 
 * Input
 * String[] a = {"A","B","C","D"};
 * String[] b = {"D","C","B","A"};
 * 
 * Output : False
 * 
 * Input
 * String[] a = {"A","B","C","D"};
 * String[] b = {"D","A","B","C"};
 * 
 * Output : True
 * 
 * Time compplexity - O(2N) - linear
 */

public class rotateArray {

	public static void main(String args[])
	{
		String[] a = {"A","B","C","D"};
		String[] b = {"D","C","B","A"};
		Map<String,String> map1 = new HashMap<String,String>();
		Map<String,String> map2 = new HashMap<String,String>();
		int len = a.length;
		int len1 = b.length;
		for(int i=0;i<len;i++)
		{
			if(i==0)
			{
				map1.put(a[i], a[len-1]);
			}
			else
			{
				map1.put(a[i], a[i-1]);
			}
		}
		for(int i=0;i<len1;i++)
		{
			if(i==0)
			{
				map2.put(b[i], b[len1-1]);
			}
			else
			{
				map2.put(b[i], b[i-1]);
			}
		}
		
		System.out.println(map1);
		System.out.println(map2);
		System.out.println("Rotate is " + map2.equals(map1));
	}
	
	
}
