/**
 * 219. Contains Duplicate II
Easy

1852

1632

Add to List

Share
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
 * 
 */
package OptimizedSolution.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsNearbyDuplicate {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
	        Set<Integer> set = new HashSet<Integer>();
	        for(int i = 0; i < nums.length; i++){
	            if(i > k) set.remove(nums[i-k-1]); //remove element if its distance to nums[i] is not lesser than k
	            if(!set.add(nums[i])) return true; //because all still existed elements is closer than k distance to the num[i], therefore if the add() return false, it means there's a same value element already existed within the distance k, therefore return true.
	        }
	     	        return false;
	 }
	public boolean containsNearbyDuplicate2(int[] nums,int k) {
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i <  nums.length; i++) {
			Integer ord = map.put(nums[i], i);
			if(ord != null && i - ord <= k) {
				return true;
			}
		}
		
		return false;
	}
	
}

