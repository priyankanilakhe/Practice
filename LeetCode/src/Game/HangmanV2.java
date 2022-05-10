package Game;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HangmanV2 {

	public static void main(String[] arg)
	{
		//Avengers end game
		//its the expected string
		//System.out.println("MainString : " + arg[0] );
		
		Set<Character> inputuniqchar=new HashSet<>();
			String mainString="avengers end game";
			String orignalString=mainString;
			char[] displayString = new char[mainString.length()]; 
			int wrongAttempts=9;
			//String displayString = "";
		//its the actual String
			
			while(wrongAttempts >0)
			{
				if(mainString.length()==0)
				{
					System.out.println("Break");
					break;
					
				}
				System.out.println("Enter the character");
				Scanner inputChar= new Scanner(System.in);
				Character Char= inputChar.next().charAt(0);
			
				boolean inserted =inputuniqchar.add(Char);
			
				if(inserted == false)
				{
					System.out.println("Wrong input character already used");
					continue;
				}
						
				
				if(mainString.contains(Char.toString()))
				{
					//System.out.println("index "+orignalString.indexOf(Char));
						//displayString[orignalString.indexOf(Char)]=Char;
						
						for(int i=0;i<orignalString.length();i++)
						{
							if(orignalString.charAt(i)==Char){
							displayString[i]=Char;
							}
						}
					
										
					 mainString= mainString.replaceAll(Char.toString(), "").replaceAll(" ", "");
					//mainString=newString;
					System.out.println(mainString + mainString.length());
					System.out.println("Display String:  " + Arrays.toString(displayString));
				}
				
				else
				{
					wrongAttempts--;
					System.out.println("Wrong input");
				}
			}
			if(mainString.length()==0)
			{
				System.out.println("Congrats");
			}
			else
			{
				System.out.println("Try one more time!!!");
			}
			
	}
	
	
}
