package Array;

import java.util.HashSet;
//Oracle

import java.util.Set;

public class UniqueValues {
	 public static String uniqueValues(int[] nums)
     {
             
         Set<Integer> values= new HashSet<Integer>();
         Set<Integer> result=new HashSet<Integer>(); int i=0;
         for(int num:nums)
         {
         if(values.add(num)==false)
         {
             result.add(num);
         }
         
     }
     return result.toString();
     }


public static void main(String args[]) {

 System.out.println(uniqueValues(new int[]{4,4,7,8,8,9}));;
}

}
