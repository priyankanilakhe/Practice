/**
 * 1408. String Matching in an Array
Easy

395

66

Add to List

Share
Given an array of string words. Return all strings in words which is substring of another word in any order. 

String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j].

 

Example 1:

Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.
Example 2:

Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".
Example 3:

Input: words = ["blue","green","bu"]
Output: []
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 30
words[i] contains only lowercase English letters.
It's guaranteed that words[i] will be unique.
 */

package String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StringMatchingInAnArray {
	
	public static List<String> stringMatching(String[] words)
	{
		HashSet<String> set=new HashSet<>();
		for(int i=0;i<words.length-1;i++)
		{
			String currWord =words[i];
			for(int j=i+1;j<words.length;j++)
			{
				String nextWord=words[j];
				if(currWord.contains(nextWord)){
					set.add(nextWord);
				}
				if(nextWord.contains(currWord))
				{
					set.add(currWord);
				}
			}
		}
		List<String> res= new ArrayList<String>(set);
		return res;
	}
	
	public static void main(String[] args)
	{
		String[] words ={"mass","as","hero","superhero"};
		System.out.println(stringMatching(words));
	}

}
