package javatutorials;
import java.io.*;
import java.util.*;

public class SearchAlgo {

	//Main function
	public static void main(String args[])
	{
		System.out.print("Enter the search no : ");
		 Scanner scanner = new Scanner(System.in);
		 int search=scanner.nextInt();
		 
		 int [] arr = {1,3,5,7,88,123,443};
		 
		 LinearSearch obj1 = new LinearSearch();
		 
		 obj1.lnrSearch(search,arr);
		 System.out.println("");
		 obj1.binsearch(search, arr);
		 System.out.println("");
		 obj1.interpolsearch(search, arr);
		
	}
	
	//Linear Search
	public void lnrSearch(int search,int [] arr)
	{
		System.out.println("Linear search");
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
			System.out.println("Found at " + (i+1) + " position");
		}
		else
		{
			System.out.println("Not found");
		}
		
	}
	
	//Binary Search
	public void binsearch(int search,int a[])
	{
		System.out.println("Binary search");
		int high = a.length;
		int low=0;
		System.out.println(low+" "+high+" ");
		while (high>=low)
		{
			int mid = low+(high-low)/2;
			System.out.println(low+"---"+high+"---"+mid+"---"+search);
			if (search == a[mid])
			{
				System.out.println("Found at " + (mid+1) + " position");
				break;
			}
			else if (search > a[mid])
			{
				low = mid +1;
			}
			else
			{
				high = mid -1;
			}
		}
	}
	
	//Interpolation Search
	public void interpolsearch(int search,int a[])
	{
		System.out.println("Interpolation search");
		int high = a.length-1;
		int low=0;
		System.out.println(low+" "+high+" ");
		while (a[high] != a[low] && search >= a[low] && search <= a[high])
		{
			int mid = low+((high-low)/(a[high]-a[low]))*(search - a[low]);
			if (search == a[mid])
			{
				System.out.println("Found at " + (mid+1) + " position");
				break;
			}
			else if (search > a[mid])
			{
				low = mid +1;
			}
			else
			{
				high = mid -1;
			}
		}
	}
}
