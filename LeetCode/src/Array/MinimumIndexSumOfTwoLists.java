package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class MinimumIndexSumOfTwoLists {
	
	public static String[] findRestaurant(String[] list1, String[] list2) {
	    Map<String, Integer> map = new HashMap<>();
	    List<String> res = new LinkedList<>();
	//Map.of(list2,list1).entrySet().forEach(e->System.out.println(Arrays.toString(e.getKey())+" "+Arrays.toString(e.getValue())));;
	
	    int minSum = Integer.MAX_VALUE;
	    for (int i=0;i<list1.length;i++) map.put(list1[i], i);
	    for (int i=0;i<list2.length;i++) {
	        Integer j = map.get(list2[i]);
	        if (j != null && i + j <= minSum) {
	            if (i + j < minSum) { res.clear(); minSum = i+j; }
	            res.add(list2[i]);
	        }
	    }
	    return res.toArray(new String[res.size()]);
	}

	public static void main(String[] args)
	{
		String[] l1= {"Shogun","Tapioca Express","Burger King","KFC"};
		String[]  l2= {"KFC","Shogun","Burger King"};
	
		System.out.println(Arrays.toString(findRestaurant(l1,l2)));
	}
}
