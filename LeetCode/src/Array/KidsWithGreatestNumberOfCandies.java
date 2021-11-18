/**
 * 1431. Kids With the Greatest Number of Candies
Easy

1021

216

Add to List

Share
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

 

Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
Example 2:

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false] 
Explanation: There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
Example 3:

Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]
 
 * 
 * 
 */

package Array;

import java.util.Arrays;

public class KidsWithGreatestNumberOfCandies {

	
	public static boolean[] GreatestNumberOfCandies(int[] nums,int numberofcandies)
	{
		int max=0;
		boolean[] result = new boolean[nums.length];
		//int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			 //sum=nums[i]+numberofcandies;
			 max=Math.max(nums[i]+numberofcandies, max);
			 
			// sum=0;
		}
		for(int i=0;i<nums.length;i++)
		{
			//System.out.println(max);
			//System.out.println((nums[i]+ numberofcandies) > max);
			result[i] = (nums[i]+ numberofcandies) >= max ?  true : false;
			/*if((nums[i]+ numberofcandies) >= max)
				result[i]=true;
			else
				result[i]=false*/;
		}
		
		return result;
	}
	public static void main(String[] args){
		int[] arr={4,2,19,19,2};
		System.out.println(Arrays.toString(GreatestNumberOfCandies(arr,15)));
	}
}
