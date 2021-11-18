package Math;

import java.util.HashMap;
import java.util.Map;

public class RomanToInterger {
	public static int romanToIntergerSolu(String s)
	{
		Map<Character,Integer> RomanValues=new HashMap<>();
		RomanValues.put('I', 1);
		RomanValues.put('V', 5);
		RomanValues.put('X', 10);
		RomanValues.put('L', 50);
		RomanValues.put('C', 100);
		RomanValues.put('D', 500);
		RomanValues.put('M', 1000);
		int length=s.length();
		int result = RomanValues.get(s.charAt(length-1));
		for(int i=length-2;i>=0;i--){
			if(RomanValues.get(s.charAt(i))>= RomanValues.get(s.charAt(i+1))){
				result +=RomanValues.get(s.charAt(i));
			}else{
				result -=RomanValues.get(s.charAt(i));
			}
		}
		return result;
	}
	public static void main(String[] args){
		System.out.println(romanToIntergerSolu("IX"));
	}
}
