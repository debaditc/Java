package javatutorials;

public class BubbleSort {

	public static void main (String args[])
	{
		int [] arr = {123,24343,112,344,12,4,2,4,5,611,1,3,12,56};	
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(arr);
	}
	
	public void bubbleSort(int [] a)
	{	
		boolean flag = true;
		while(flag)
		{
			flag=false;
			for (int i =0;i<a.length-1;i++)
			{	
				if(a[i] > a[i+1])
				{
					int c = a[i];
					a[i] = a[i+1];
					a[i+1]=c;
					flag = true;
				}
			}
		}
		for (int i =0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
	
}
