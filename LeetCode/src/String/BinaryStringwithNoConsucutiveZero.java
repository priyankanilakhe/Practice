/*
 * 696. Count Binary Substrings
Easy

1938

333

Add to List

Share
Give a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's, and all the 0's and all the 1's in these substrings are grouped consecutively.

Substrings that occur multiple times are counted the number of times they occur.

 

Example 1:

Input: s = "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
Example 2:

Input: s = "10101"
Output: 4
Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
 

Constraints:

1 <= s.length <= 105
s[i] is either '0' or '1'.
 */

package String;

import java.util.Scanner;

public class BinaryStringwithNoConsucutiveZero {

public static void main(String[] args)
{
	Scanner s= new Scanner(System.in);
	int n = s.nextInt();
	
	// With array
	int dp0[]=new int[n+1];
	int dp1[] =new int[n+1];
	dp0[1]=1;
	dp1[1]=1;
	for(int i=2;i <= n; i++)
	{
		dp0[i] = dp1[i-1];
		dp1[i] = dp1[i-1] + dp0[i-1];
	}
	System.out.println(dp1[n]+dp0[n]);
	
	// Without Array
	int ocZeros = 1;
	int ocones=1;
	
	for(int i=2;i<=n;i++){
		int newOCZeros = ocZeros;
		int newOCones =ocZeros +ocones;
		
		ocZeros =newOCZeros;
		ocones=newOCones ;
	}
	System.out.println(ocZeros + ocones);
}
}

	