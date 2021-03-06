//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/

package Stack;

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
	
	public static String removeCharToMakeValidParntheses(String s)
	{
		char[] c=s.toCharArray();
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='(')
			{
				stack.push(i);
			}
			else if(c[i]==')')
			{
				if(stack.size()==0) c[i]='.';	
				else stack.pop();
			}
		}
		while(stack.size()>0)
		{
			c[stack.pop()]='.';
		}
		StringBuilder sb= new StringBuilder();
		for(char ch:c)
		{
			if(ch != '.')
			sb.append(ch);
		}
		return sb.toString();
	}

public static void main(String[] arg)
{
System.out.println(removeCharToMakeValidParntheses("lee(t(c)o)de)"));

}		
}
