/**
 * 219. Contains Duplicate II
Easy

1674

1548

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
 */
package Array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicates2 {

	public static boolean containsDuplicates(int[]  num,int k)
	{
	Map<Integer ,Integer> map=new HashMap<Integer,Integer>();
	for(int i=0;i<num.length;i++)
	{
		if(map.containsKey(num[i])&&i-map.get(num[i])<=k)
		{
			return true;
		}
		else
		{
			map.put(map.get(num[i]), i);
		}
	}
	return false;
	}
	
	
	@SuppressWarnings("static-access")
	public static String duplicate(String s) {
		StringBuilder sb= new StringBuilder();
		for(int i=1,j=0;i<s.length();i++,j++) {
			System.err.println(s.substring(i, s.length()));
			System.out.println(s.valueOf(s.charAt(i-1)));
			if((s.substring(i, s.length()).contains(s.valueOf(s.charAt(i-1))))) {
				s.replaceAll(s.valueOf(s.charAt(i)),"");
				sb.append(s.charAt(i));
			}
		}
		return s.valueOf(sb);
	}
	
	public static void main(String[] args) {
		System.out.println(duplicate("Apple"));
	}
}
