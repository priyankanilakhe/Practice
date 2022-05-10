
//https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
package Array;

public class MaximumXORArray {
	
	public static int maxXOR(int[] arr)
	{
		int Max=Integer.MIN_VALUE;
		for(int i=1,j=0;i<arr.length;i++,j++)
		{
			Max=Math.max(Max,arr[i]^arr[j]);
		}
		return Max;
	}
	public static void main(String[] args)
	{
		System.out.println(maxXOR(new int[]{14,70,53,83,49,91,36,80,92,51,66,70}));
	}

}
