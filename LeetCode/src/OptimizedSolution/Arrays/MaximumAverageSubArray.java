/**
 * 643. Maximum Average Subarray I
Easy

1168

146

Add to List

Share
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000
 

Constraints:

n == nums.length
1 <= k <= n <= 105
-104 <= nums[i] <= 104
 */

package OptimizedSolution.Arrays;

import java.util.ArrayList;

public class MaximumAverageSubArray {

	/**
	 * first method
	 * 
	 * @param arr
	 * @param k
	 * @return
	 */

	public static double maximumAverageArray(int arr[], int k) {
		int sum = 0;
		double max = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		max = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i] - arr[i - k];
			max = Math.max(sum, max);
		}
		return max/k;
	}

	/**
	 * second method
	 * 
	 * @param arr
	 * @param size
	 * @return
	 */
	public static double maximumAveragearray(int[] arr, int size) {
		if (arr.length == 1)
			return arr[0];
		ArrayList<Integer> list = new ArrayList<Integer>();
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
			int windowSum = 0;

			for (int i1 = Math.max(1, list.size() - size); i1 < list.size(); i1++) {
				windowSum += list.get(i1);
			}
			max = Math.max(max, windowSum);
		}
		return max * 1.0 / Math.min(size, list.size());
	}

	public static void main(String[] arg) {
		//int arr[] = { 5 };
		int arr[]={1,12,-5,-6,50,3};
		System.out.println(maximumAveragearray(arr,4));
		System.out.println(maximumAverageArray(arr,4));
	}
}	
