/**
 * Input: nums = [0,2,1,5,3,4] 
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
 * 
 * 
 * let a = nums[i] and b= nums[nums[i]]
let nums=[0,2,1,5,3,4]
if a = nums[3] = 5 then b = nums[nums[3]] = nums[5] = 4
a+nb = 5 + 24 = 29
29%n = 29 % 6 = 5 = a; so formula for a = (a+nb)%n
29/n = 29/6 = 4 = b ; so formula for b = (a+nb)/n
 */
package Array;

import java.util.Arrays;

public class BuildArrayFromPermultation {
	
	public static int[] buildArray(int[] nums)
	{
		int size=nums.length;
		for(int i=0;i<size;i++)
		{
			
			//nums[i]=nums[i]+(size*(nums[nums[i]]%size));
			nums[i] = nums[i]+(size*(nums[nums[i]]%size));
			
		}
		for(int i=0;i<size ;i++)
		{
			nums[i]/=size;
		}
		return nums;
	}
	public static int[] buildArray_Approch2(int[] nums)
	{
	          int[] ans= new int[nums.length];
	        for(int i:nums){
	            ans[i]=nums[nums[i]];
	        }      return ans;        

	}

	public static void main(String[] args)
	{
		int[] arr={0,2,5,1,4,3};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(buildArray_Approch2(arr)));
		
	}
}
