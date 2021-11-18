package Array;

import java.util.Arrays;

public class Sumof1DArray {
	
	public static int[] sumof1DArray(int[] num)
	{
		for(int i=1;i<num.length;i++)
		{
			num[i]+=num[i-1];
		}
		return num;
	}
	
	public static void main(String[] args)
	{
		int[] arr={0,2,5,1,4,3};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString((sumof1DArray(arr))));
		
	}

}
