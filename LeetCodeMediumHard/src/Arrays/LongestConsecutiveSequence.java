package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static int longestConsequetive(int[] nums) {

		Set<Integer> hashSet = new HashSet<Integer>();
		for (int num : nums) {
			hashSet.add(num);
		}
		int longestStreak = 0;
		for (int num : nums) {
			if (!hashSet.contains(num - 1)) {
				int currentNum = num;
				int currentStreak = 1;
				while (hashSet.contains(currentNum + 1)) {
					currentNum += 1;
					currentStreak += 1;
				}
				longestStreak = Math.max(currentStreak, longestStreak);
			}
		}
		return longestStreak;
	}
	public static void main(String[] args) {
		System.out.println(longestConsequetive(new int[] {100,4,200,1,3,2}));
	}
}
