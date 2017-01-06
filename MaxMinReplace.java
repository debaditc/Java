/*
 * Given 2 numbers (where 6 can also be written as 5, and 5 as 6), calculate the maximum and minimum possible sum 
	Ex : 
	456 485 
	Min 455 + 485 
	Max 466 + 486
 */

package javatutorials;

import java.io.*;
import java.util.*;


public class MaxMinReplace {

	public static void main (String args[])
	{
		String a = "265";
		String b = "456";
		
		String min1 = a.replace('6', '5');
		String min2 = b.replace('6', '5');
		
		String max1 = a.replace('5', '6');
		String max2 = b.replace('5', '6');
		
		System.out.println(Integer.parseInt(max1)+Integer.parseInt(max2));		
		System.out.println(Integer.parseInt(min1)+Integer.parseInt(min2));	
	}
	
}