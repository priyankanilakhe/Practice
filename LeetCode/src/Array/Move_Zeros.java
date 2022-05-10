package Array;

import java.util.Arrays;

public class Move_Zeros {

	public static void move_zero(int[] Num) {
		for (int lastNonZeroFoundAt = 0, curr = 0; curr < Num.length; curr++) {
			if(Num[curr] !=0)
			{
				int temp=Num[lastNonZeroFoundAt];
				Num[lastNonZeroFoundAt++]=Num[curr];
				Num[curr]=temp;
				
			}
		}
		System.out.println(Arrays.toString(Num));

	}

	public static void main(String[] args) {
		move_zero(new int[]{1,0,0,0,0});
	}
}
