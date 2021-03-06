/**
 *https://leetcode.com/problems/backspace-string-compare/solution/
 * 844. Backspace String Compare
Easy

3161

146

Add to List

Share
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a##c", t = "#a#c"
Output: true
Explanation: Both s and t become "c".
Example 4:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
 

Constraints:

1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.
 

Follow up: Can you solve it in O(n) time and O(1) space?
 */
package OptimizedSolution.Arrays;

import java.util.Stack;

class BackspaceCompare {
   /* public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }*/



//Optimize solution for space complexity
public boolean backspaceCompare(String s, String t) {
    StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();
    
    int i = 0, j = 0;
    while(i < s.length() || j < t.length()){
        if(i < s.length()){
            ex(i++, s, sb1);
        }
        if(j < t.length()){

            ex(j++, t, sb2);
        }
    }
    return sb1.toString().equals(sb2.toString());
}


void ex(int index, String s, StringBuilder sb){
    if(s.charAt(index) != '#'){
        sb.append(s.charAt(index));
    }else{
        if(sb.length() != 0){
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

}