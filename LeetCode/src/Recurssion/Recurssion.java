package Recurssion;

public class Recurssion {
	
	  public static  int mystery(int x, int y) {
	        if (x % 2 == 1 || y % 2 == 1) {
	            return 1;
	        } else {
	            return 2 * mystery(x / 2, y / 2);
	        }
	    }
	  
	  public static void main(String[] args)
	  {
		  System.out.println(mystery(4, 19));
	  }

}
