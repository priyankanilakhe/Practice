/**
 * 459. Repeated Substring Pattern
Easy

2744

262

Add to List

Share
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

 

Example 1:

Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
Example 2:

Input: s = "aba"
Output: false
Example 3:

Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 

Constraints:

1 <= s.length <= 104
s consists of lowercase English letters.
 */

package String;

public class RepeatedSubStringProblem {

	public static boolean repeatedSubstringProblem(String str)
	{
		String s=str+str;
		return s.substring(1,s.length()-1).contains(str);
	}
	public static void main(String[] args)
	{
		System.out.println(repeatedSubstringProblem("abab"));
	}
}
	