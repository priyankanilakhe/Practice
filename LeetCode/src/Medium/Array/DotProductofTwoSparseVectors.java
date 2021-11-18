/**
 * 1874. Minimize Product Sum of Two Arrays
Medium

48

5

Add to List

Share
The product sum of two equal-length arrays a and b is equal to the sum of a[i] * b[i] for all 0 <= i < a.length (0-indexed).

For example, if a = [1,2,3,4] and b = [5,2,3,1], the product sum would be 1*5 + 2*2 + 3*3 + 4*1 = 22.
Given two arrays nums1 and nums2 of length n, return the minimum product sum if you are allowed to rearrange the order of the elements in nums1. 

 

Example 1:

Input: nums1 = [5,3,4,2], nums2 = [4,2,2,5]
Output: 40
Explanation: We can rearrange nums1 to become [3,5,4,2]. The product sum of [3,5,4,2] and [4,2,2,5] is 3*4 + 5*2 + 4*2 + 2*5 = 40.
Example 2:

Input: nums1 = [2,1,4,5,7], nums2 = [3,2,4,8,6]
Output: 65
Explanation: We can rearrange nums1 to become [5,7,4,1,2]. The product sum of [5,7,4,1,2] and [3,2,4,8,6] is 5*3 + 7*2 + 4*4 + 1*8 + 2*6 = 65.
 

Constraints:

n == nums1.length == nums2.length
1 <= n <= 105
1 <= nums1[i], nums2[i] <= 100
 */
package Medium.Array;

public class DotProductofTwoSparseVectors {

	/*public static int TwoDArrayProducts(int[] arr1,int[] arr2)
	{
		if(arr1.length != arr2.length) return 0;
		
		int product=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i] < 0|| arr2[i] < 0) return 0;
			product += arr1[i] * arr2[i];
		}
		return product;
	}*/
	
	 private int[] array;

	 DotProductofTwoSparseVectors(int[] nums) {
	        array = nums;
	    }

	    public int dotProduct(DotProductofTwoSparseVectors vec) {
	        int result = 0;

	        for (int i = 0; i < array.length; i++) {
	            result += array[i] * vec.array[i];
	        }
	        return result;
	    }   
	
	public static void main(String[] args)
	{
		int[] arr1={0,1,0,0,2,0,0};
		int[] arr2={1,0,0,0,3,0,4};
	//	System.out.println(TwoDArrayProducts(arr1,arr2));
		DotProductofTwoSparseVectors vc1=new DotProductofTwoSparseVectors(arr1);
		DotProductofTwoSparseVectors vc2=new DotProductofTwoSparseVectors(arr2);
		System.out.println(vc1.dotProduct(vc2));
	}
}
