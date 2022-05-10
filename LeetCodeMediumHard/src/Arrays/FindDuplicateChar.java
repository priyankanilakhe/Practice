//https://www.geeksforgeeks.org/duplicates-in-an-array-in-on-time-and-by-using-o1-extra-space-set-3/?ref=lbp
//https://leetcode.com/problems/find-the-duplicate-number/discuss/1892921/Java-9-Approaches-Count-%2B-Hash-%2B-Sort-%2B-Binary-Search-%2B-Bit-%2B-Fast-Slow-Pointers
package Arrays;

public class FindDuplicateChar {

	public static String duplicateChar(String str) {
		String duplicate = "";
		for (int i = 0; i < str.length() - 1; i++) {
			int index = str.indexOf(str.charAt(i), i + 1);
			if (index >= 0) {
				duplicate += str.charAt(i);
				str = str.replaceAll(Character.toString(str.charAt(i)), " ");
			}
		}
		return duplicate.replace(" ", "");
	}

	/*
	 * Binary Search Note that the key is to find an integer in the array [1, 2,..,
	 * n] instead of finding an integer in the input array.
	 * 
	 * We can use the binary search algorithm, each round we guess one number, then
	 * scan the input array, narrow the search range, and finally get the answer.
	 * 
	 * According to the Pigeonhole Principle, n + 1 integers, placed in an array of
	 * length n, at least 1 integer will be repeated.
	 * 
	 * So guess a number first(the number mid in the valid range [left, right]),
	 * count the elements of the array which is less than or equal to mid in the
	 * array.
	 * 
	 * If cnt is strictly greater than mid. According to the Pigeonhole Principle,
	 * repeated elements are in the interval [left, mid]; Otherwise, the repeated
	 * element is in the interval [mid + 1, right]. With extra O(1) space, without
	 * modifying the input
	 * 
	 * Analysis Time Complexity: O(nlogn) Space Complexity: O(1)
	 * 
	 */
	public static int findDuplicate_bs(int[] nums) {
		int len = nums.length;
		int low = 1;
		int high = len - 1;
		while (low < high) {
			int mid = low + (high - low) / 2;
			int cnt = 0;
			for (int i = 0; i < len; i++) {
				if (nums[i] <= mid) {
					cnt++;
				}
			}

			if (cnt <= mid) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}

		return low;
	}

	public static int findDuplicate(int[] nums) {
		while (nums[0] != nums[nums[0]]) {
			int nxt = nums[nums[0]];
			nums[nums[0]] = nums[0];
			nums[0] = nxt;
		}
		return nums[0];
	}

	/**
	 * Solution 1:
	 * 
	 * Approach:The elements in the array is from 0 to n-1 and all of them are
	 * positive. So to find out the duplicate elements, a HashMap is required, but
	 * the question is to solve the problem in constant space. There is a catch, the
	 * array is of length n and the elements are from 0 to n-1 (n elements). The
	 * array can be used as a HashMap. Problem in the below approach. This approach
	 * only works for arrays having at most 2 duplicate elements i.e It will not
	 * work if the array contains more than 2 duplicates of an element. For example:
	 * {1, 6, 3, 1, 3, 6, 6} it will give output as : 1 3 6 6. Note: The above
	 * program doesn’t handle 0 cases (If 0 is present in array). The program can be
	 * easily modified to handle that also. It is not handled to keep the code
	 * simple. (Program can be modified to handle 0 cases by adding plus One(+1) to
	 * all the values. also subtracting One from the answer and by writing { arr
	 * [abs(arr[i]) – 1] } in code) In other approach below, the discussed solution
	 * prints repeating elements only once.
	 * 
	 * Approach: The basic idea is to use a HashMap to solve the problem. But there
	 * is a catch, the numbers in the array are from 0 to n-1, and the input array
	 * has length n. So, the input array can be used as a HashMap. While Traversing
	 * the array, if an element ‘a’ is encountered then increase the value of a%n‘th
	 * element by n. The frequency can be retrieved by dividing the a % n’th element
	 * by n. Algorithm: Traverse the given array from start to end. For every
	 * element in the array increment the arr[i]%n‘th element by n. Now traverse the
	 * array again and print all those indexes i for which arr[i]/n is greater than
	 * 1. Which guarantees that the number n has been added to that index This
	 * approach works because all elements are in the range from 0 to n-1 and arr[i]
	 * would be greater than n only if a value “i” has appeared more than once.
	 * 
	 * @param numRay
	 */
	public static void FindDuplicatemostEffective(int[] numRay) {
		// int numRay[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };

		for (int i = 0; i < numRay.length; i++) {
			System.out.println(numRay[i] % numRay.length + " :" + numRay[i] + " %" + numRay.length);
			numRay[numRay[i] % numRay.length] = numRay[numRay[i] % numRay.length] + numRay.length;
		}
		System.out.println("The repeating elements are : ");
		for (int i = 0; i < numRay.length; i++) {
			if (numRay[i] >= numRay.length * 2) {
				System.out.println(i + " ");

			}
		}
	}

	public static void main(String[] args) {
		FindDuplicatemostEffective(new int[] { 0, 4, 3, 2, 7, 8, 2, 3, 1 });
	}
}
