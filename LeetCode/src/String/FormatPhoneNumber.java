package String;

public class FormatPhoneNumber {

	public static void main(String[] args)
	{
		String input = "1234567890";		 
		String number = input.replaceFirst("(\\d{3})(\\d{2})(\\d{2})(\\d+)", "($1)$2-$3-$4");		 
		System.out.println(number);
	}
}
