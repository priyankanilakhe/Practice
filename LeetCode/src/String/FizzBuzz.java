/**
 * 412. Fizz Buzz
Easy

1559

1730

Add to List

Share
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i if non of the above conditions are true.
 

Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 

Constraints:

1 <= n <= 104
 */

package String;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	public static List<String> fizzBuzz(int n)
	{
		List<String> arr = new ArrayList();
		for(int i=1;i<=n;i++)
		{
			boolean devisibleBy3= (i%3==0);
			boolean divisibleBy5=(i%5==0);
			
			if(devisibleBy3 && divisibleBy5)	arr.add("FizzBuzz");
			else if(devisibleBy3) arr.add("Fizz");
			else if(divisibleBy5) arr.add("Bizz");
			else arr.add(Integer.toString(i));
		}
	return arr;
	}
	
	public static void main(String[] args){
		System.out.println(fizzBuzz(15));
	}
	

}
