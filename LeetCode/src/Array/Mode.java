package Array;
public class Mode {
   static int mode(int a[],int n) {
      int maxValue = 0, maxCount = 0, i, j;

      for (i = 0; i < n; ++i) {
         int count = 0;
         for (j = 0; j < n; ++j) {
            if (a[j] == a[i])
            ++count;
         }

         if (count > maxCount) {
            maxCount = count;
            maxValue = a[i];
         }
      }
      return maxValue;
   }
   public static void main(String args[]){
      int n = 5;
      int a[] = {0,6,6,9,9};
      System.out.println("Mode ::"+mode(a,n));
   }
}