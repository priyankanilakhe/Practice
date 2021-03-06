//https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/katrina-and-library-c2ed51f3/
/*
 * Check for the \ backslash in string after that check for the /sash and reverse it from inner most section 
 */
package Stack;

import java.util.Stack;

public class AliceLibrary {

	
	public static String ReverseStringWithgroupofBackslashandRightSlash(String s)
	{
		Stack<Character> stack= new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='/' ||s.charAt(i)>='a' &&s.charAt(i)<='z')	
			{
				stack.push(s.charAt(i));
			}
			else
			{
				String temp="";			
				while(stack.peek()!= '/')
				{
					temp += stack.pop();
				}
				stack.pop();
				
				for(int j=0;j<temp.length();j++)
				{
					stack.push(temp.charAt(j));
				}
			}
		}
		String ans="";
		while(!stack.isEmpty())
		{ ans+=stack.pop();}
		StringBuilder sb= new StringBuilder(ans);
		return sb.reverse().toString();
	}
	
	public static void main(String[] args){
		//String s="/u/love\\i\\";
		System.out.println(ReverseStringWithgroupofBackslashandRightSlash("/u/love\\i\\"));
	}
}
