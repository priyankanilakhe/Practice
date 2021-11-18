/**
 * 347. Top K Frequent Elements
Medium

5971

295

Add to List

Share
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
 

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */

package Medium.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TopKFrequentElement {
 
	public List<Integer> topFrequent(int[] num,int k){
		Map<Integer,Integer> map= new HashMap<>();
		for(int n:num)
		{
			map.put(n,map.getOrDefault(n, 0)+1);
		}
		
		PriorityQueue<Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			maxHeap.add(entry);
		}
		List<Integer> res= new ArrayList<Integer>();
		while(res.size()<k){
			Map.Entry<Integer, Integer> entry=maxHeap.poll();
			res.add(entry.getKey());
		}
		return res;
	
	}
}
