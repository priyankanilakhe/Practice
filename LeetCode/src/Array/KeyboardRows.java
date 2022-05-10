
/**
 * https://leetcode.com/problems/keyboard-row/
 */
package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class KeyboardRows {

	public static void keyboardRows(String[] words){
		  ArrayList<String> ans = new ArrayList<String>();
	        for(int i=0;i<words.length;++i){    
	            String s = words[i].toLowerCase();
	            if(s.matches("^[qwertyuiop]*$") || s.matches("^[asdfghjkl]*$") || s.matches("^[zxcvbnm]*$")){
	                ans.add(words[i]);
	            }
	        }
	       // String[] ret = new String[ans.size()];
	       // ret = ans.toArray(ret); 
	      // System.out.println(Arrays.toString(ans.toArray(ret)));
	        System.out.println(ans);
	    }
	
	public static void main(String[] args)
	{
		keyboardRows(new String[]{"Hello","Alaska","Dad","Peace"});
	}
	
}
