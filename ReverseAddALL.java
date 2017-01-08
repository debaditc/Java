package javatutorials;

/*
*You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

*Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
*Output: 7 -> 0 -> 8
*/
package javatutorials;

/*
*You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

*Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
*Output: 7 -> 0 -> 8
*/

import java.util.*;

public class ReverseAddLL {

	public static void main(String argsp[])
	{
		List l1 = new LinkedList();
		List l2 = new LinkedList();
		List l3 = new LinkedList();
		l1.add(2);
		l1.add(4);
		l1.add(3);
		l2.add(5);
		l2.add(6);
		l2.add(4);
		System.out.println(l1);
		System.out.println(l2);
		int rem=0,sum=0,quo=0;
		for(int i=0;i<l1.size();i++)
		{		
			int val1 = (int) l1.get(i);
			int val2 = (int) l2.get(i);
			int org_sum = val1 + val2;	
			if( org_sum >= 10)
			{
				rem=org_sum%10;
				quo=org_sum/10;
				if(i!=l1.size())
				{
					sum=rem;
				}
				else
				{
					sum=quo+org_sum;
				}
				System.out.println(i+">>"+l1.size());
				System.out.print(rem+"---"+quo+"----"+org_sum+"----"+sum+"\n");
			}
			else
			{
				System.out.print(rem+"---"+quo+"----"+org_sum+"----"+sum+"\n");
				sum=org_sum+quo;
			}
			System.out.print(val1+"+"+val2+"--"+sum+"\n");
			l3.add(sum);
			
		}
		System.out.println(l3);
		
	}
	
	
}
