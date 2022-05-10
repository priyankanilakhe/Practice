/**
 * 2154. Keep Multiplying Found Values by Two
Easy

197

7

Add to List

Share
You are given an array of integers nums. You are also given an integer original which is the first number that needs to be searched for in nums.

You then do the following steps:

If original is found in nums, multiply it by two (i.e., set original = 2 * original).
Otherwise, stop the process.
Repeat this process with the new number as long as you keep finding the number.
Return the final value of original.

 

Example 1:

Input: nums = [5,3,6,1,12], original = 3
Output: 24
Explanation: 
- 3 is found in nums. 3 is multiplied by 2 to obtain 6.
- 6 is found in nums. 6 is multiplied by 2 to obtain 12.
- 12 is found in nums. 12 is multiplied by 2 to obtain 24.
- 24 is not found in nums. Thus, 24 is returned.
Example 2:

Input: nums = [2,7,9], original = 4
Output: 4
Explanation:
- 4 is not found in nums. Thus, 4 is returned.
 

Constraints:

1 <= nums.length <= 1000
1 <= nums[i], original <= 1000
Accepted
26,797
Submissions
36,444
 */

package HashMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//5,3,6,1,12
public class KeepMultiplyFoundValueByTwo {

	public static int KeepMultiplyFoundValueByTwo(int[] num,int value) {
		
		Map<Integer,Integer> map=new HashMap<>();
		int mulValue = 1;
		for(int n:num)
		{
			map.put(n, null);
			if(value==n)
			{
				mulValue=value *2;
				map.put(n,mulValue);
			}
			if(mulValue==n)
			{
				mulValue*=2;
				map.put(n,mulValue);
			}
			
		}
		Stream.of(map).forEach(System.out::println);
		HashMap<Integer,String[]> map1= new HashMap<>();
		map1.put(1,new String[] {"a","b","c","D"});
		map1.put(3,new String[] {"a","b","c","D"});
		map1.put(4,new String[] {"a","b","c","D"});
		map1.put(5,new String[] {"a","b","c","D"});
		/*System.out.println();
		for(Integer i:map1.keySet()) {
			System.out.print(i +" ");
		for(String val : map1.get(i)) {
			System.out.print(val);
		}
		System.out.println();
		}*/
		/*
		 * for(Map.Entry<Integer,String[]> val:map1.entrySet()) {
		 * System.out.println(val.getKey());
		 * System.out.println(Arrays.toString(val.getValue())); }
		 */
		 
		 map1.entrySet().stream().forEach(e->System.out.println(e.getKey()+" "+ Arrays.toString(e.getValue()).substring(1,11).replaceAll(",", "")));
	    
		return mulValue==1? value:mulValue;
		
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(KeepMultiplyFoundValueByTwo(new int[] {5,3,6,1,12},3));

	}

}
