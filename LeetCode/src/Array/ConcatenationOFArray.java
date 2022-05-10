/**
 * 1929. Concatenation of Array
Easy

303

92

Add to List

Share
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

 

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
 

Constraints:

n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000
 */
package Array;

import java.util.Arrays;

public class ConcatenationOFArray {
	
	public static int[] getConcatenatioArray(int[] nums){
		int[] ans=new int[nums.length*2];
		int k=nums.length;
		for(int i=0;i<nums.length;i++,k++)
		{
			ans[i] =nums[i];
			ans[k]=nums[i];
		}
		return ans;
	}
	public static int[] concatination(int arr[])
	{
		int newarr[]=new int[arr.length *2];
		 System.arraycopy(arr, 0, newarr, 0, arr.length);
		 System.arraycopy(arr, 0, newarr, arr.length, arr.length);

		return newarr;
		 
		
	}
	public static void main(String[] args)
	{
		int[] arr={0,2,5,1,4,3};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(getConcatenatioArray(arr)));
		System.out.println(Arrays.toString(concatination(arr)));
	}

 }
