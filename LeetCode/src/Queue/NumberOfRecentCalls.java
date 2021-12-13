//https://leetcode.com/problems/number-of-recent-calls/
package Queue;

import java.util.LinkedList;

public class NumberOfRecentCalls {
	LinkedList<Integer> list;
 public NumberOfRecentCalls()
 {
	 list= new LinkedList<>();
 }
 public int ping(int val)
 {
	 list.offer(val);
	 System.out.println(list);
	 while(list.getFirst()< val-3000)
	 {
		 this.list.poll();
	 }
	 return this.list.size();
 }
 public static void main(String[] args)
 {
	 int arr[]={0,1,100,3001,3002};
	 NumberOfRecentCalls num= new NumberOfRecentCalls();
	 for(int i=0;i<arr.length;i++){
	 System.out.println(num.ping(arr[i]));
	 }
 }
}
