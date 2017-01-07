package javatutorials;
import java.io.*;
import java.util.*;

public class LinearSearch {

	public static void main(String args[])
	{
		System.out.print("Enter the search no : ");
		 Scanner scanner = new Scanner(System.in);
		 int search=scanner.nextInt();
		 
		 int [] arr = {1,4,2,23,11,32412,223,122,14,611,112,4324};
		 
		 LinearSearch obj1 = new LinearSearch();
		 
		 obj1.lnrSearch(search,arr);
		
	}
	
	public void lnrSearch(int search,int [] arr)
	{
		int fl=0,i=0;
		for (i =0;i<arr.length;i++)
		{
			if (search == arr[i])
			{
				fl=1;
				break;
			}
			else
			{
				fl=0;
			}
		}
		
		if (fl==1)
		{
			System.out.println("Found at " + (i+1) + "position");
		}
		else
		{
			System.out.println("Not found");
		}
		
	}
}
