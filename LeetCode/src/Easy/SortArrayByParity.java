/**
 * 905. Sort Array By Parity
Easy

2088

103

Add to List

Share
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 5000
0 <= nums[i] <= 5000
 */

package Easy;

import java.util.Arrays;

public class SortArrayByParity {

	public static int[] sortArrayByParity(int[] A){
		Integer[] B= new Integer[A.length];
		for(int i=0;i<A.length;i++)
		{
			B[i]=A[i];
		}
System.out.println(Arrays.toString(B));
		Arrays.sort(B,(a,b)-> Integer.compare(a%2,b%2));
		for(int i=0;i<A.length;i++)
		{
			A[i]=B[i];
		}
		return A;
	}
	public static void main(String[] args)
	{
		int[] arr={2,3,5,6,8,9,13,12};
		System.out.println(Arrays.toString(sortArrayByParity(arr)));
	}
}
