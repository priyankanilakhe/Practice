package Game;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hangman {

	public static void main(String[] args)
	{
		Scanner outputString= new Scanner(System.in);
		String MainString= outputString.nextLine().toLowerCase();
		int length=MainString.length();
		Set<Character> noDuplicates= new HashSet<>();
		for(int i=0;i<length ;i++)
		{
			noDuplicates.add(MainString.charAt(i));
			
		}
		System.out.println("Set length" + noDuplicates.size());
		System.out.println("Enter the Television show of length" + MainString.length()+"including spaces");
		
		for(int i=0;i<noDuplicates.size();i++)
		{
			String s =outputString.next();
			if(MainString.toLowerCase().contains(s))
			{
				//MainString.replace(s, "");
				String newString = MainString.toLowerCase().replaceAll(s, "").replaceAll(" ", "").trim();
				/*if(newString.length() != length-i)
				{
					length=length-MainString.
				}*/
				MainString=newString;
				System.out.println(newString);
			}
		}
		if(MainString.length()>0)
		{
			System.out.println("Opps.......Failed");
		}
		else{
			System.out.println("Congrats!!! You WON");
		}
		
	}
	
}
