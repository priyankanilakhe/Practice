package HashMap;

import java.util.HashMap;

public class CheckifEveryRowandColumnContainsAllNumbers {
	public static boolean checkValid(int[][] m) {
		int k = m.length;
		for (int i = 0; i < k; i++) {
			HashMap<Integer, Integer> nm = new HashMap<>();
			for (int j = 0; j < k; j++) {
				nm.put(m[i][j], nm.getOrDefault(m[i][j], 0) + 1);
			}
			for (int j = 0; j < k; j++) {
				nm.put(m[j][i], nm.getOrDefault(m[j][i], 0) + 1);
			}
			for (int j = 1; j <= k; j++) {
				if (!nm.containsKey(j))
					return false;
				if (nm.get(j) != 2)
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(checkValid(new int[][] {{1,2,3},{3,1,2},{2,3,1}}));
		System.out.println(checkValid(new int[][] {{1,1,1},{1,2,3},{1,2,3}}));	
	} }

