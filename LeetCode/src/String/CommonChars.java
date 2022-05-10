//https://leetcode.com/problems/find-common-characters/
/**
 * 1002. Find Common Characters
Easy

2130

179

Add to List

Share
Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.

 

Example 1:

Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
Example 2:

Input: words = ["cool","lock","cook"]
Output: ["c","o"]
 

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists of lowercase English letters.
 */

package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CommonChars {
	public static List<String> commonChars2(String[] words) {
		List<String> result = new ArrayList<>();
	
		List<String[]> result1 = new ArrayList<>();
		
		
		for (int i = 0; i < words[0].length(); i++) {
			for (int j = 1; j < words.length; j++) {
				if (!words[j].contains(Character.toString(words[0].charAt(i))))
					break;
				
				if (words[j].contains(Character.toString(words[0].charAt(i)))) {
					words[j] = words[j].replaceFirst(
							Character.toString(words[j].charAt(words[j].indexOf(words[0].charAt(i)))), ".");

					if (words[j] == words[words.length - 1]) {
						{
							result.add(Character.toString(words[0].charAt(i)));
							// int re = words[j].indexOf(words[0].charAt(i));
							// words[j].replace(words[j].charAt(re),'.');
						}
						
					}
				}
			}

		}
		return result;
	}

	public static List<String> commonChars(String[] A) {
		List<String> result = new ArrayList<>();

		for (char c = 'a'; c <= 'z'; c++) {
			int minCount = Integer.MAX_VALUE;
			for (String s : A) {
				int wordCount = 0;
				for (char cur_c : s.toCharArray())
					if (cur_c == c)
						wordCount++;
				minCount = Math.min(minCount, wordCount);
			}

			for (int i = 0; i < minCount; i++)
				result.add("" + c);
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(commonChars2(new String[] { "bella","label","roller"}));
	}
}
