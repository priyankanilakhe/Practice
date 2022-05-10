package Arrays;

import java.util.Arrays;

public class ProductExceptSelf {

	/**
	 * Two-pass O(n); O(1) Scan from the beginning to store the result of products
	 * of integers on the left. Scan from the end to start to generate final result.
	 */
	public static int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		result[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			result[i] = result[i - 1] * nums[i - 1];
		}

		for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
			result[i] *= tmp;
			tmp *= nums[i];
		}

		return result;
	}

	/**
	 * One-pass O(n); O(1) The product is actually composed of two parts, the
	 * integers on the left, and integers on the right. For a naive O(n) Time, O(n)
	 * Space solution. You can use two arrays to store products from the beginning
	 * and from the end. Then multiply each position in the two arrays to generate
	 * result. If we want to reduce space usage to O(1), we can just replace the two
	 * arrays with two integers.
	 */
	public static int[] productExceptSelfB(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];
		Arrays.fill(res, 1);
		int left = 1; // Product of integers before i.
		int right = 1; // Product of integers after n-1-i.
		for (int i = 0; i < nums.length; i++) {
			res[i] *= left; // Update result in the front.
			left *= nums[i]; // Update left.
			res[n - 1 - i] *= right; // Update result at the end.
			right *= nums[n - 1 - i]; // Update right.
		}
		return res;
	}

	public static int[] findProductUsingDivision(int[] nums) {

		int len = nums.length;
		int[] ans = new int[len];
		int prod = 1;

		// Find product of all the integers of an array
		for (int i = 0; i < nums.length; i++) {
			prod = prod * nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			ans[i] = prod / nums[i];
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(productExceptSelfB(new int[] { 1, 2, 3, 4 })));

	}

}
