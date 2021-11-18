/**
 * 1013. Partition Array Into Three Parts With Equal Sum
Easy

866

103

Add to List

Share
Given an array of integers arr, return true if we can partition the array into three non-empty parts with equal sums.

Formally, we can partition the array if we can find indexes i + 1 < j with (arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1])

 

Example 1:

Input: arr = [0,2,1,-6,6,-7,9,1,2,0,1]
Output: true
Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
Example 2:

Input: arr = [0,2,1,-6,6,7,9,-1,2,0,1]
Output: false
Example 3:

Input: arr = [3,3,6,5,-2,2,5,1,-9,4]
Output: true
Explanation: 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
 

Constraints:

3 <= arr.length <= 5 * 104
-104 <= arr[i] <= 104
Accepted
 */
package Array;

import java.util.Arrays;

public class partitionArrayIntoThreePartswithEqualSum {

	public static boolean partitionArrayintothreeParts(int[] arr)
	{
		int Arraysum=Arrays.stream(arr).sum();
		if(Arraysum%3 != 0) return false;
		
		int partision=0; int sum=0; ;int partionValue=Arraysum/3;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(sum == partionValue)
			{
				partision++;
				sum=0;
			}
			if(partision >= partionValue && sum==0) return true;
		}
		return false;
/*		int sum = Arrays.stream(A).sum(), part = 0, average = sum / 3, cnt = 0;
        for (int a : A) {
            part += a;
            if (part == average) { // find the average: sum / 3
                ++cnt; // find an average, increase the counter.
                part = 0; // reset part.
            }
        }
        return cnt >= 3 && sum % 3 == 0;*/
	}
	
	
	public static void main(String[] arg)
	{
		int arr[]={0,2,1,-6,6,7,9,-1,2,0,1};
		System.out.println(partitionArrayintothreeParts(arr));
	}
}
