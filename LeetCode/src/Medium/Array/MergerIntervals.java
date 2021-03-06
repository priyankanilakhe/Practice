/**
 * 56. Merge Intervals
Medium

9189

425

Add to List

Share
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
 */

package Medium.Array;

import java.util.Arrays;
import java.util.LinkedList;

public class MergerIntervals {

	public static int[][] merge(int[][] intervals)
	{
		Arrays.sort(intervals ,(a,b)-> Integer.compare(a[0], b[0]));
		LinkedList<int[]> merge= new LinkedList<>();
		//System.out.println(merge.getLast()[1]);
		for(int[] interval : intervals){
			//System.out.println(interval[0]);
			if(merge.isEmpty() || merge.getLast()[1] > interval[0])
			{
			
				merge.add(interval);
				System.out.println(merge.getLast()[1]);
			}
			
			else
			{
				merge.getLast()[1]=Math.max(merge.getLast()[1], interval[1]);
			}
		}
		return merge.toArray(new int[merge.size()][]);
	}
	public static void main(String[] args)
	{
		int[][] arr={{1,3},{2,6},{8,10},{15,18}};
		Arrays.sort(arr ,(a,b)-> Integer.compare(a[1], b[1]));
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(merge(arr)));
	}
}
