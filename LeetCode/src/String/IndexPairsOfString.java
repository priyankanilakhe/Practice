/**
 /https://leetcode.ca/all/1065.html
 1065. Index Pairs of a String
 Given a text string and words (a list of strings), return all index pairs [i, j] so that the substring text[i]...text[j] is in the list of words.

  

 Example 1:

 Input: text = "thestoryofleetcodeandme", words = ["story","fleet","leetcode"]
 Output: [[3,7],[9,13],[10,17]]
 Example 2:

 Input: text = "ababa", words = ["aba","ab"]
 Output: [[0,1],[0,2],[2,3],[2,4]]
 Explanation: 
 Notice that matches can overlap, see "aba" is found in [0,2] and [2,4].
  

 Note:

 All strings contains only lowercase English letters.
 It's guaranteed that all strings in words are different.
 1 <= text.length <= 100
 1 <= words.length <= 20
 1 <= words[i].length <= 50
 Return the pairs [i,j] in sorted order (i.e. sort them by their first coordinate in case of ties sort them by their second coordinate).
 Difficulty:
 Easy
 Lock:
 Prime
 Company:
 Amazon
 Problem Solution
 1065-Index-Pairs-of-a-String
 * 
 */
package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IndexPairsOfString {

	
	public static List<int[]> indexPairsOfString(String text,String[] words)
	{
		List<int[]> indexPairsList = new ArrayList<int[]>();
		for(int i=0;i<words.length;i++)
		{
			if(text.contains(words[i])) {
				int startIndex=text.indexOf(words[i]);
	
				int endIndex=startIndex+words[i].length()-1;
				System.out.println("startIndex"+startIndex+"endIndex"+endIndex);
				indexPairsList.add(new int[] {startIndex,endIndex});
				if(text.substring(endIndex).contains(words[i])) {
				
					startIndex=text.indexOf(words[i],endIndex);
					endIndex=startIndex+words[i].length()-1;
					System.out.println("startIndex"+startIndex+"endIndex"+endIndex);
					indexPairsList.add(new int[] {startIndex,endIndex});
				}
			}
		}
		/*
		 * Collections.sort(indexPairsList, new Comparator<int[]>() { public int
		 * compare(int[] array1, int[] array2) { if (array1[0] != array2[0]) return
		 * array1[0] - array2[0]; else return array1[1] - array2[1]; } });*/
	//Arrays.asList(indexPairsList).stream().sorted().map(e->e.toString()).toList().forEach(System.out::print);
		//indexPairsList.stream().sorted();
		Collections.sort(indexPairsList,(a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
		/*
		 * int length = indexPairsList.size(); int[][] indexPairs = new int[length][2];
		 * for (int i = 0; i < length; i++) { int[] indexPair = indexPairsList.get(i);
		 * 
		 * indexPairs[i][0] = indexPair[0]; indexPairs[i][1] = indexPair[1]; }
		 */
        return indexPairsList;
       
	}
	
	public static void main(String[] args) {
		List<int[]> list = indexPairsOfString("ababa",new String[] {"aba","ab"});
		System.out.println(Arrays.deepToString(list.toArray()));
		//System.out.println(Arrays.deepToString(indexPairsOfString("thestoryofleetcodeandme",new String[] {"story","fleet","leetcode"})));

	}
}
