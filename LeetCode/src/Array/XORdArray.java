/**
 * 
 * 1720. Decode XORed Array
Easy

410

69

Add to List

Share
There is a hidden integer array arr that consists of n non-negative integers.

It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].

You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].

Return the original array arr. It can be proved that the answer exists and is unique.

 

Example 1:

Input: encoded = [1,2,3], first = 1
Output: [1,0,2,1]
Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
Example 2:

Input: encoded = [6,2,7,3], first = 4
Output: [4,2,0,7,4]
 

Constraints:

2 <= n <= 104
encoded.length == n - 1
0 <= encoded[i] <= 105
0 <= first <= 105
 */
package Array;

/**
 * 
 * 1486. XOR Operation in an Array
Easy

606

247

Add to List

Share
Given an integer n and an integer start.

Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.

 

Example 1:

Input: n = 5, start = 0
Output: 8
Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
Where "^" corresponds to bitwise XOR operator.
Example 2:

Input: n = 4, start = 3
Output: 8
Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.
Example 3:

Input: n = 1, start = 7
Output: 7
Example 4:

Input: n = 10, start = 5
Output: 2
 

Constraints:

1 <= n <= 1000
0 <= start <= 1000
n == nums.length
 */

import java.util.Arrays;

public class XORdArray {
	public static int[] decodedArray(int[] encode,int first)
	{
		int[] decoded=new int[encode.length+1];
		decoded[0]=first;
		int index=1;
		for(int i=0;i<encode.length;i++)
		{
			decoded[index]=decoded[i]^encode[i];
			index++;
		}
		return decoded;
	}
	
	public static void main(String[] arg)
	{
		int[] arr={6,2,7,3};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(decodedArray(arr,4)));
		
	}
}
