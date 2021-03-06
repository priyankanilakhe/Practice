/**
 * 
 * Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Example 3:

Input: haystack = "", needle = ""
Output: 0
 

Constraints:

0 <= haystack.length, needle.length <= 5 * 104
haystack and needle consist of only lower-case English characters.
 */

package String;

public class ImplementSTRSTR {

	public static boolean contains(String Text,String substring)
	{
		int mainString=Text.length();
		int subString=substring.length();
		
		
		for(int i=0;i<(mainString-subString);i++)
		{
			boolean isPresent = true;
			for(int j=0;j<subString;j++)
			{
				if(Text.charAt(j+i)!=substring.charAt(j))
				{
					isPresent=false;
					break;
				}
			}
			if(isPresent)
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args)
	{
		System.out.println(contains("aaabbbrsser","aa4bb"));
	}
}
