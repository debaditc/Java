package javatutorials;

/* Reverse word in sentence 
  Input : This  is   Java
  Output  : 
  >> Java is This 
  >> avaJ si sihT 
*/

import java.util.*;

public class wordReverse {

	public static void main(String args[])
	{
		String sent = "This is Java";
		System.out.println(sent);
		String[] str = sent.trim().split("  *");
		for(int i=str.length-1;i>=0;i--)
		{		
			System.out.print(str[i].trim()+" ");
		}	
		System.out.println("");
		for(int i=str.length-1;i>=0;i--)
		{		
			//System.out.print(str[i].trim()+" ");
			for (int j =str[i].length()-1;j>=0;j--)
			{
				System.out.print(str[i].charAt(j));
			}
			System.out.print(" ");
		}	

	}
	
}
