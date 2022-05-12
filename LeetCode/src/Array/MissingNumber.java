package Array;

import java.util.Arrays;

public class MissingNumber {
	public static int MissingNumber(int[] nums) {
		int xor= 0,i=0;
		for(i=0;i<nums.length;i++) {
			xor=xor^i^nums[i];
		}
		return xor^i;
	}
	public static void main(String[] args) {
		//System.out.println(Arrays.toString(MissingNumber(new int[] {0,1,3})));
		System.out.println(MissingNumber(new int[] {3,0,1}));
	}

}
