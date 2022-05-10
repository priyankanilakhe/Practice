
/**
 * https://leetcode.com/problems/di-string-match/
 * 
 * 
 * 942. DI String Match
Easy

1580

626

Add to List

Share
A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

 

Example 1:

Input: s = "IDID"
Output: [0,4,1,3,2]
Example 2:

Input: s = "III"
Output: [0,1,2,3]
Example 3:

Input: s = "DDI"
Output: [3,2,0,1]
 

Constraints:

1 <= s.length <= 105
s[i] is either 'I' or 'D'.
 */
package String;

import java.util.Arrays;

public class DiStringMatch {
	 public static int[] diStringMatch(String s) {
	        int result[]=new int[s.length()+1];
	        int k=0,m=s.length();
	        for(int i=0;i<s.length();i++)
	        {
	        if(s.charAt(i)=='I'){
	            result[i]+= k;   
	            k++;
	        }else if(s.charAt(i)=='D') {
	            result[i]+= m;
	            m--;
	        }
	        } 
	        result[result.length-1]= m;
	        return result;
	 }
	 
	  public static int[] diStringMatch2(String S) {
	        int n = S.length(), left = 0, right = n;
	        int[] res = new int[n + 1];
	        for (int i = 0; i < n; ++i)
	            res[i] = S.charAt(i) == 'I' ? left++ : right--;
	        res[n] = left;
	        return res;
	    }
	      
	 
	public static void main(String[] args) {
		System.out.println(Arrays.toString(diStringMatch2("IDID")));
	}
	    }


