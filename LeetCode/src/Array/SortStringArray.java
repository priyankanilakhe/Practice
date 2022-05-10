package Array;
import java.util.*;
class SortStringArray {
    public static void main(String[] args) {
      String arr[]={"I","mumbai","from","am"};
      String[] result= {};
     Arrays.sort(arr,Comparator.comparing(String::length));
     System.out.println(Arrays.toString(arr));
      
    }
}