package BinaryTree;

public class FindFirstandLastPositionofElementinSortedArray {

	public static int BinarySearch(int[] nums, int left, int right, int target) {
		while (left <= right) {
			int mid = (int) Math.floor((left + right) / 2);
			int foundValue = nums[mid];
			if (foundValue == target) {
				return mid;
			} else if (foundValue < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	public int[] SearchRange(int nums[],int target)
	{
		if(nums.length<1)
		{
			return new int[]{-1,-1};
		}
		int firstPos=BinarySearch(nums,0,nums.length,target);
		if(firstPos == -1) return new int[]{-1,-1};
		int endPos=firstPos;
		int startPos=firstPos;
		int temp1 = 0,temp2 = 0;
		while(startPos!= -1)
		{
			temp1=startPos;
			startPos=BinarySearch(nums,startPos-1,endPos,target);
		}
		startPos=temp1;
		while(endPos!= -1)
		{
			temp2=endPos;
			endPos=BinarySearch(nums,endPos+1,nums.length,target);
		}
		endPos=temp2;
		return new int[]{startPos,endPos};
	}

}
