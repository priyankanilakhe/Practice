//https://www.lintcode.com/problem/642/description
package Queue;

import java.util.LinkedList;

public class MovingAverageFromDataStream {
	
	public static void movingAverageSlidingWindow(int[] arr,int k)
	{
		int sum=0;
		double avg=0;
		for(int i=0;i<k;i++)
		{
			sum+=arr[i];
			//.out.println("sum "+sum);
			avg=sum/(i+1);
			
			System.out.println(" Avg :"+avg);
		}
		for(int i=k;i<arr.length;i++)
		{
			sum+= arr[i]-arr[i-k];
			//System.out.println("sum 3 "+sum);
			avg=sum/3;
			System.out.println(" Avg :"+avg);
		}
		
	}
	
	public static void movingSumQueue(int arr[],int size){
		LinkedList<Integer> list = new LinkedList<>();
		int sum=0;
		double avg=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			list.offer(arr[i]);
			//System.out.println(list.size());
			if(list.size()<=size)
			{
				avg= sum/list.size();
				System.out.println(avg);
			}
			else {
		
			sum-=list.poll();
			avg=sum/size;
			System.out.println(avg);
			}
		}
	}
	public static void main(String[] args)
	{
		int arr[]={1,10,3,5};
		movingAverageSlidingWindow(arr,3);
		movingSumQueue(arr,3);
	}

}

