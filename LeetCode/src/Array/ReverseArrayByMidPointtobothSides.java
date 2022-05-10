package Array;

public class ReverseArrayByMidPointtobothSides {
	public static void main(String args[]) {
		int[] arr = { 10, 2, 5, 4, 6, 9, 5, 3 };
		int len = arr.length;

		System.out.println(len / 4);
		System.out.println(len / 2);

		for (int i = 0; i < len / 4; i++)

		{
			int t = arr[i];
			arr[i] = arr[len / 2 - i - 1];
			arr[len / 2 - i - 1] = t;

		}
		for (int i = (len / 2), j = len - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		for (int j = 0; j < len; j++){
			System.out.print(arr[j] + " ");
		}
	}

// Second way recussion 
	
	private void reverse(int[] ar, int i, int j) {
		   if(i>j)
		     return;
		   else{
		     int temp = ar[i];
		     ar[i] = ar[j];
		     ar[j] = temp;
		     reverse(ar, ++i, --j);
		   }
		}
}
