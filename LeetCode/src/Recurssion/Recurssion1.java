package Recurssion;

public class Recurssion1 {
	
	static void print(int n)
	{
	    if (n > 4000)
	        return;
	    System.out.println(n);
	    print(2*n);
	    System.out.println(n);
	}
	 
	public static void main(String[] args)
	{
	   print(1000);
	}

}
