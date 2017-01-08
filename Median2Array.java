package javatutorials;

public class Median2Array {

    public static double findMedianSortedArrays(double[] nums1, double[] nums2) {
	double l1 = nums1.length;
	double l2 = nums2.length;
	
	double mid,a2med;
	double a1med;
	
	if(l1==1)
	{
		a1med = nums1[0];
	}
	else if (l1!=1 && l1%2 == 0)
	{
		a1med = (nums1[(int) (l1/2)] + nums1[(int) (l1/2-1)])/2;
	}
	else
	{
		a1med=nums1[(int) (l1/2)];
	}
	
	if(l2==1)
	{
		a2med = nums2[0];
	}
	else if (l2!=1 && l2%2 == 0)
		
	{
		a2med = (nums2[(int) (l2/2)] + nums2[(int) (l2/2-1)])/2;
	}
	else
	{
		a2med=nums2[(int) (l1/2)];
	}		
	System.out.println(a1med +"---" + a2med);
	return((a2med+a1med)/2);
    }


	public static void main (String[] args)
	{
		double [] a1 = {1,3};
		double [] a2 = {3,4};
		
		double median = findMedianSortedArrays(a1,a2);
		System.out.println(median);

	}
	
}

