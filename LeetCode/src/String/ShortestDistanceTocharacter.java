package String;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class ShortestDistanceTocharacter {

	public static void ShortestDistanceCharacter(String s, char c) {
		int[] result = new int[s.length()];
		Arrays.fill(result, Integer.MAX_VALUE);
		int[] index = IntStream.range(0, s.length()).filter(e -> s.charAt(e) == c).toArray();

		for (int i = 0; i < s.length(); i++) {
			int min = Integer.MAX_VALUE;
			for (int in : index) {
				min = in > s.indexOf(s.charAt(i)) ? in - s.indexOf(s.charAt(i)) : s.indexOf(s.charAt(i)) - in;
				result[i] = Math.min(result[i], in > i ? in - i : i - in);
			}
		}
		System.out.print(Arrays.toString(result));
	}

	public int[] shortestToChar(String S, char C) {
		TreeSet<Integer> set = new TreeSet<>();

		// add all indexes of C into tree set
		for (int i = 0; i < S.length(); i++)
			if (S.charAt(i) == C)
				set.add(i);

		int[] result = new int[S.length()];
		for (int i = 0; i < S.length(); i++) {
			if (!set.contains(i)) {

				Integer left = set.floor(i);
				Integer right = set.ceiling(i);

				if (left == null)
					left = Integer.MAX_VALUE;
				if (right == null)
					right = Integer.MAX_VALUE;

				result[i] = Math.min(Math.abs(left - i), Math.abs(right - i));

			} else {
				result[i] = 0;
			}
		}
		return result;
	}

	

	public static void main(String[] args) {
		String s = "aaab";// "loveleetcode";
		char c = 'b';
		ShortestDistanceCharacter(s, c);

	}
}
