package javatutorials;



import java.util.*;

public class ReverseAddLL {

	public static void main(String argsp[])
	{
		List l1 = new LinkedList();
		List l2 = new LinkedList();
		List l3 = new LinkedList();
		l1.add(1);
		l1.add(5);
		l1.add(4);
		l2.add(7);
		l2.add(8);
		l2.add(9);
		System.out.println(l1);
		System.out.println(l2);
		int rem=0,sum=0,quo=0;
		for(int i=0;i<l1.size();i++)
		{		
			int val1 = (int) l1.get(i);
			int val2 = (int) l2.get(i);
			int org_sum = val1 + val2;	
			if( org_sum > 10)
			{
				rem=org_sum%10;
				quo=org_sum/10;
				if(i!=l1.size()-1)
				{
					sum=rem;
				}
				else
				{
					sum=quo+org_sum;
				}
				//System.out.println(i+">>"+l1.size());
				//System.out.print(rem+"---"+quo+"----"+org_sum+"----"+sum+"\n");
			}
			else
			{
				System.out.print(rem+"---"+quo+"----"+org_sum+"----"+sum+"\n");
				sum=org_sum;
			}
			System.out.print(val1+"+"+val2+"--"+sum+"\n");
			l3.add(sum);
			//sum=0;
		}
		System.out.println(l3);
		
	}
	
	
}
