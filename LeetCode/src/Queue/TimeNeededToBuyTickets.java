package Queue;

public class TimeNeededToBuyTickets {

public static int timeNeedeToBuyTickets(int[] arr ,int k){
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		
		if(i<=k)
		{
			count += Math.min(arr[k], arr[i]);
		}
		else 
		{
			count += Math.max(arr[k]-1, arr[i]);
		}
		
	}
	
	return count;
}

public static void main(String[] args)
{
	int arr[] ={5,1,1,1};
	System.out.println(timeNeedeToBuyTickets(arr, 0));
}
}
