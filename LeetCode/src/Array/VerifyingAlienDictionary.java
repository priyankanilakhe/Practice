/**
 * 953. Verifying an Alien Dictionary
Easy

2065

780

Add to List

Share
In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographically in this alien language.

 

Example 1:

Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
Example 2:

Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
Example 3:

Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false
Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 20
order.length == 26
All characters in words[i] and order are English lowercase letters.
 * 
 */

package Array;

public class VerifyingAlienDictionary {
	static int[] mapping = new int[26];
	    public static boolean alienDictionary(String[] words, String order) {
	    	   
	    	for (int i = 0; i < order.length(); i++)
	            mapping[order.charAt(i) - 'a'] = i;
	        for (int i = 1; i < words.length; i++)
	            if (bigger(words[i - 1], words[i]))
	                return false;
	        return true;
	    }

	    static boolean bigger(String s1, String s2) {
	        int n = s1.length(), m = s2.length();
	        for (int i = 0; i < n && i < m; ++i)
	            if (s1.charAt(i) != s2.charAt(i))
 	                return mapping[s1.charAt(i) - 'a'] > mapping[s2.charAt(i) - 'a'];
	        return n > m;
	    }
	    
/*	public static boolean alienDictionary(String[] words,String order)
	{
		int alphabet[]=new int[order.length()];
		for(int i=0;i<order.length();i++)
		{
			alphabet[order.charAt(i)-'a'] = i;
		}
		
		for(int i=1;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				int min=Math.min(words[i].length(), words[j].length());
				for(int k=0;k<min;k++)
				{
				char chari=words[i].charAt(k);
				char charj=words[j].charAt(k);
				if(alphabet[chari-'a'] < alphabet[charj-'a']) break;
				else if(alphabet[chari-'a'] > alphabet[charj-'a']) return false;
				else if(k==min-1 && words[i].length() >words[j].length()) return false ;
				}
			}
		}
		return true;
	}*/
	
	public static void main(String[] args)
	{
		String[] arr={"word","world","row"};
		String order ="worldabcefghijkmnpqstuvxyz";
		System.out.println(alienDictionary(arr,order));
	}
}
