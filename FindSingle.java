package javatutorials;

public class FindSingle {

	public static void main(String args[])
	{
		int [] x = {1,2,1,3,3,4};
		int i=0,j=0;

		int fr[]=new int[x.length];

		// Initialize an array with 0
		for(i=0;i<fr.length;i++)
		{
			fr[i]=0;
		}

		//calculating frequency
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x.length;j++)
			{
				if(x[i]==x[j])
				{
		
					fr[i]++;
		
				}
			}
		
		}
		
		for(i=0;i<fr.length;i++)
		{
			if(fr[i]==1)
			{
				System.out.println(x[i]);
			}
		}

	}
}
