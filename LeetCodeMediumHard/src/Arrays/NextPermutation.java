package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NextPermutation {
	//https://leetcode.com/problems/next-permutation/discuss/13994/Readable-code-without-confusing-ij-and-with-explanation
	static int lastIndexOfPeak(int[] arr)
	{
		for(int i=arr.length-1;i>0;i--)
		{
			if(arr[i-1]<arr[i]) return i;
		}
		return 0;
	}
	
	static int lastIndexOfGreater(int[] arr,int threshold)
	{
		for(int i=arr.length-1;i>=0;i--) {
			if(threshold<arr[i] ) return i;
		}
		return -1;
	}
	static void reverse(int[] arr,int start)
	{
		int end=arr.length-1;
		while(start<end)
		{
			swap(arr,start++,end--);
		}
	}
	static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static int[] nextPermulatation(int[] nums)
	{
		int pivote=lastIndexOfPeak(nums)-1;
		if(pivote != -1) {
			int nextPrfix=lastIndexOfGreater(nums,pivote);
			swap(nums,nextPrfix,pivote);
		}
		reverse(nums,pivote+1);
		return nums;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(nextPermulatation(new int[] {1,3,2})));

	}

}
