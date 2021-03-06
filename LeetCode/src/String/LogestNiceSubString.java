/**
 * 1763. Longest Nice Substring
Easy

278

254

Add to List

Share
A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.

Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.

 

Example 1:

Input: s = "YazaAay"
Output: "aAa"
Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
"aAa" is the longest nice substring.
Example 2:

Input: s = "Bb"
Output: "Bb"
Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.
Example 3:

Input: s = "c"
Output: ""
Explanation: There are no nice substrings.
Example 4:

Input: s = "dDzeE"
Output: "dD"
Explanation: Both "dD" and "eE" are the longest nice substrings.
As there are multiple longest nice substrings, return "dD" since it occurs earlier.
 

Constraints:

1 <= s.length <= 100
s consists of uppercase and lowercase English letters.
 */
package String;

import java.util.HashSet;

public class LogestNiceSubString {

	public static String longestNiceSubString(String s)
	{
		if(s.length()<2) return "";
		HashSet<Character> set= new HashSet<Character>();
		for(char c:s.toCharArray()) set.add(c);
		for(int i=0;i<s.length();i++)
		{
			if(set.contains(Character.toUpperCase(s.charAt(i)))&&set.contains(Character.toLowerCase(s.charAt(i))))
			continue;
			String subString1=longestNiceSubString(s.substring(0,i));
			String subString2=longestNiceSubString(s.substring(i+1));
			return subString1.length() >= subString2.length() ? subString1 :subString2;
		}
		return s;
	}
	
	public static void main(String[] args)
	{
		System.out.println(longestNiceSubString("dDzeE"));
	}
}
