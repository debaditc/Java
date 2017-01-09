package javatutorials;

import java.io.*;
import java.util.*;
import java.lang.*;
 
public class QuickSort {
 
      public static int partitions(int[] numbers, int left, int right)
    {
        int pivot = numbers[left];
        while (true)
        {
            while (numbers[left] < pivot)
                left++;
 
            while (numbers[right] > pivot)
                right--;
 
            if (left < right)
              {
                int temp = numbers[right];
                numbers[right] = numbers[left];
                numbers[left] = temp;
              }
              else
              {
                    return right;
              }
        }
    }
 
      public static void QuickSort_Recursive(int[] arr, int left, int right)
    {
        // For Recusrion
        if(left < right)
        {
            int pivot = partitions(arr, left, right);
 
            if(pivot > 1)                                                                                                                                                                                                                                                 
                QuickSort_Recursive(arr, left, pivot - 1);
 
            if(pivot + 1 < right)
                QuickSort_Recursive(arr, pivot + 1, right); 
        }
    }
 
    public static void main(String[] args)
    {
        int[] numbers = {1,34,124,12,22,114,5,11,22};
        QuickSort_Recursive(numbers, 0, numbers.length - 1);
            for (int i = 0; i < numbers.length; i++)
            {
                  System.out.println(numbers[i]);
            }
    }
}
