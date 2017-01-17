package javatutorials;

/* Java program to push zeroes to back of array */
import java.io.*;
import java.util.Arrays;

class ZeroLower
{
    private static int[] arr2;

	static void pushZerosToEnd(int arr1[], int n)
    {
        int count = 0,count1=0;  // Count of non-zero elements
        
        int j = 0;
        for (int i = 0; i < n; i++)
        {
        	if (arr1[i] != 0)
        	{
        		arr1[count++] = arr1[i]; 
        	}
        	else
        	{
        		count1++;
        	}
        }
        
        arr2 = new int[count1];
        Arrays.fill(arr2, 0, count1, 0);
        for (int i=0; i<count; i++)
        {
        	System.out.print(arr1[i]+" ");
        }
        for (int i=0; i<count1; i++)
        {
        	System.out.print(arr2[i]+" ");
        }
        
        
    }
 
    /*Driver function to check for above functions*/
    public static void main (String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZerosToEnd(arr, n);
      
    }
}
