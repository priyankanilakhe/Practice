package Math;

public class IntergerToRoman {
/*	
	public static String integerToRoman(int intValue)
	{
		// 1 to 9
		String units[]={"","I","II","III","IV","V","VI","VII","VIII","VX"};
		// 10 to 90
		String tens[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		//100 to 900
		String hunderds[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","DM"};
		//thousand
		String thousand[]=new String[]{"","M","MM","MMM"};
		
		return thousand[intValue /1000] + 
				hunderds[(intValue%1000)/100] +
				tens[(intValue%100)/10] +
				units[intValue%10];
	}*/
	
	 public static String intToRoman(int num) {
	      String[] thousands = {"", "M", "MM", "MMM"};
	      String[] hundreds = 
	        {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	      String[] tens = 
	        {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	      String[] units = 
	        {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	      
	      return thousands[num / 1000] + 
	           hundreds[(num % 1000) / 100] + 
	           tens[(num % 100) / 10] + 
	           units[num % 10];
	    }
	
	public static
	void main(String[] args)
	{
		System.out.println(intToRoman(3456));
	}

}
