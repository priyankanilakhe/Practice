/**
 * 346. Moving Average from Data Stream
Easy

977

98

Add to List

Share
Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

Implement the MovingAverage class:

MovingAverage(int size) Initializes the object with the size of the window size.
double next(int val) Returns the moving average of the last size values of the stream.
 

Example 1:

Input
["MovingAverage", "next", "next", "next", "next"]
[[3], [1], [10], [3], [5]]
Output
[null, 1.0, 5.5, 4.66667, 6.0]

Explanation
MovingAverage movingAverage = new MovingAverage(3);
movingAverage.next(1); // return 1.0 = 1 / 1
movingAverage.next(10); // return 5.5 = (1 + 10) / 2
movingAverage.next(3); // return 4.66667 = (1 + 10 + 3) / 3
movingAverage.next(5); // return 6.0 = (10 + 3 + 5) / 3
 

Constraints:

1 <= size <= 1000
-105 <= val <= 105
At most 104 calls will be made to next.
 */
package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovingAverageFromDataStream {
	 int size;
	  List queue = new ArrayList<Integer>();
	  public MovingAverageFromDataStream(int size) {
	    this.size = size;
	  }

	  public double next(int val) {
	    queue.add(val);
	    // calculate the sum of the moving window
	    int windowSum = 0;
	    for(int i = Math.max(0, queue.size() - size); i < queue.size(); i++)
	      windowSum += (int)queue.get(i);

	    return windowSum * 1.0 / Math.min(queue.size(), size);
	  }
	
	public static void main(String[] arg)
	{
		Scanner sc= new Scanner(System.in);
		int arr[]= {20,30,59,23,34};
		MovingAverageFromDataStream mv =new MovingAverageFromDataStream(2);
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(mv.next(arr[i]));
		}
	}
}
