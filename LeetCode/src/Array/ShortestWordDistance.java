/**
 * https://leetcode.com/problems/shortest-word-distance/
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.

For example,
Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

Given word1 = “coding”, word2 = “practice”, return 3.
Given word1 = "makes", word2 = "coding", return 1.
 */

package Array;

public class ShortestWordDistance {

	
	public static int shortestDistance(String[] words,String word1,String word2)
	{
		if(words==null || words.length==0 || word1.equals(word2)) return 0;
		 int p1=-1,p2=-1 ,result=words.length;
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals(word1))
			{
				p1=i;
				if(p2!= -1) result= Math.min(result, Math.abs(p1-p2));
			}
			else
			{
				p2=i;
				if(p1!=-1) result= Math.min(result, Math.abs(p2-p1));
			}
			
		}
		return result;
					
	}
}
