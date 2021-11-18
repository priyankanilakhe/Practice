package String;

import java.util.Stack;

public class StringReverseWithoutSpecialCharacter {

 public static void main(String[] args) {

  String str = "This34#is@&special";

  System.out.println("Original String : "+str);

  str = new StringReverseWithoutSpecialCharacter().reverseString(str);

  System.out.println("Reversed String : "+str);
 }
 
 public String reverseString(String s)
 {
	 
	
	 String rev[]={};
	  int j=0;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			//if(!alphaNumericCheck(s.charAt(j))) rev+="";
		if(!alphaNumericCheck(s.charAt(i)))
		{
			if(!rev[i].isEmpty())
			rev[i]=s.valueOf(i);
			
		}
		else if(alphaNumericCheck(s.charAt(i)))
		{
			if(!rev[i].isEmpty())
			rev[j]=s.valueOf(i);
			//j++;
			
		}
		j++;
		}
		
		return rev.toString();
		
	
 
	/* int len=s.length()-1;
	 char[] rev={};
	 char[] arr= s.toCharArray();
	 for(int i=0;i<arr.length;i++)
	 {	 
		 if(!alphaNumericCheck(arr[len]))
		 {
			 System.out.println("adffag"+rev.length);
		 rev[len]=arr[len];
		 len--;
		 }
		 else if(alphaNumericCheck(arr[i]))
		 {
			 System.out.println(rev.length);
	     rev[i]=arr[len];
		 len--;
		 }
	 }
	 return String.valueOf(rev);*/
 }

 /*public String reverseString(String str) {

  char[] arr = str.toCharArray();

  for (int i = 0, j = str.length() - 1; i < j;) {

   if (alphaNumericCheck(arr[i]) && alphaNumericCheck(arr[j])) {
    char tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
    i++;
    j--;
   } else if (!alphaNumericCheck(arr[i])) {
    i++;
   } else if (!alphaNumericCheck(arr[j])) {
    j--;
   }

  }
  return String.valueOf(arr);*/
 

 public boolean alphaNumericCheck(char ch) {
  if ((ch >= 48 && ch <= 57) // Numeric 0 to 9
    || (ch >= 65 && ch <= 90) // Alphabet A to Z (caps)
    || (ch >= 97 && ch <= 122)) // Alphabet a to z
   return true;
  else
   return false;

 }
 

}