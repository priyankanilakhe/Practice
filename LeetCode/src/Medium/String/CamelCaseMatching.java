/**
 * 1023. Camelcase Matching
Medium

433

189

Add to List

Share
Given an array of strings queries and a string pattern, return a boolean array answer where answer[i] is true if queries[i] matches pattern, and false otherwise.

A query word queries[i] matches pattern if you can insert lowercase English letters pattern so that it equals the query. You may insert each character at any position and you may not insert any characters.

 

Example 1:

Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FB"
Output: [true,false,true,true,false]
Explanation: "FooBar" can be generated like this "F" + "oo" + "B" + "ar".
"FootBall" can be generated like this "F" + "oot" + "B" + "all".
"FrameBuffer" can be generated like this "F" + "rame" + "B" + "uffer".
Example 2:

Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FoBa"
Output: [true,false,true,false,false]
Explanation: "FooBar" can be generated like this "Fo" + "o" + "Ba" + "r".
"FootBall" can be generated like this "Fo" + "ot" + "Ba" + "ll".
Example 3:

Input: queries = ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "FoBaT"
Output: [false,true,false,false,false]
Explanation: "FooBarTest" can be generated like this "Fo" + "o" + "Ba" + "r" + "T" + "est".
 
 */
package Medium.String;

import java.util.ArrayList;
import java.util.List;

public class CamelCaseMatching {

	
	public static boolean isMatch(String query,String pattern)
	{
		//char[] c=query.toCharArray();
		int i=0;
		for(char c:query.toCharArray())
		{
		if(i<pattern.length()&& c==pattern.charAt(i))
		{
			i++;
		}else if(c<'a'){ return false;}		
	}	
		return i==pattern.length();
}
	
	public static  List<Boolean> isCamel(String[] queries,String pattern){
	ArrayList<Boolean> res=new ArrayList<Boolean>();
	for(String query :queries)
	{
		res.add(isMatch(query,pattern));
	}
	return res;
	}
	
	public static void main(String[] args)
	{
		String[] query= {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
		System.out.println(isCamel(query,"FoBa"));
	}
}
