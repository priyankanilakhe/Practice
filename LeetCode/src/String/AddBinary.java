/**
 * Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
 */
package String;

public class AddBinary {
public static String addBinary(String s1,String s2)
{
int carry=0;
String result = "";
int i=0;
int s1len=s1.length();
int s2len=s2.length();

while(i<s1len || i<s2len || carry !=0)
{
	int x=0;
	if(i<s1len && s1.charAt(s1len-i-1)=='1') x=1;
	int y=0;
	if(i<s2len && s2.charAt(s2len-i-1) =='1') y=1;
	
	result=(x+y+carry)%2 +result;
	carry =(x+y+carry)/2;
	i++;
}
return result;
}

public static void main(String arg[])
{
System.out.println(addBinary("100","10"));	
}
}
