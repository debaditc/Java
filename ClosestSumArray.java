package javatutorials;

/*
 * Input : [[-2, -1, 1, 5], [-2, 1, 4], [-2, 5], [-1, 1, 3], [-1, 4], [3]]
 * Target : 2
 * Output : [[-2, -1, 1, 4], [-2, -1, 5], [-2, 1, 3], [-2, 4], [-1, 3]]
 * Concept used : DFS Algorithm
 */

import java.util.*;

public class ClosestSumArray {

	
	public static void main (String args[])
	{
		int [] a = { 1,3,4,5,-1,-2};
		List<List<Integer>> res = comb(a,2);
		System.out.println(res);
		
	}
	
	public static List<List<Integer>> comb (int [] arr, int tar)
	{
		Arrays.sort(arr);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		dfs(arr,0,tar,path,res);
		return res;
	}
	
	public static void dfs(int [] arr,int cur,int tar,List<Integer> path  , List<List<Integer>> res)
	{
		if(tar ==0)
		{
			res.add(new ArrayList(path));
			return;
		}
		if (tar < 1) return ;
		for (int i =cur;i<arr.length;i++)
		{
			path.add(path.size(),arr[i]);
			dfs(arr,i+1,tar-arr[i],path,res);
			path.remove(path.size()-1);
		}
	}
	
	
}
