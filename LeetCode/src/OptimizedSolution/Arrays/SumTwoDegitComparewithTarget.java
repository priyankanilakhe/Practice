package OptimizedSolution.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumTwoDegitComparewithTarget {
	    public int[] twoSum(int[] nums, int target) {	
	        Map<Integer,Integer> map= new HashMap<Integer ,Integer>();
	        for(int i=0;i<nums.length;i++)
	        {
	        int curr = target - nums[i];
	        System.out.println(curr);
	        if(map.containsKey(curr))
	        {
	            return new int[]{map.get(curr),i};
	        }
	        map.put(nums[i],i);
	        
	        }
	        return null;
	    }
	    
	    public static void main(String[] args)
	    {
	        int arr[]={2,5,6,7,8,4};
	        SumTwoDegitComparewithTarget s= new SumTwoDegitComparewithTarget();
	        int[] result=s.twoSum(arr,7);
	        System.out.println(Arrays.toString(result));
	        
	    }
}
