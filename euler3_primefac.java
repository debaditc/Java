package javatutorials;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.

 */

public class euler3_primefac {

	public static void main(String args[])
	{
		int no = 13195;
		for (int i=2;i<no;i++)
		{    
			int count=0;
			if(no%i==0 && i!=no)
			{
				int a1=no/i;
				for (int j=2;j<a1;j++)
				{
					if(a1%j==0 && j!=a1)
					{
						count++;
					}
				}
				
				if(count==0)
				{
					System.out.println(a1);
				}
				
			}	
		}
	}
}
