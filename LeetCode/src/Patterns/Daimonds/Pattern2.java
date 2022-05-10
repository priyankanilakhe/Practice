/**
  	 	   * 
         * * 
       * * * 
     * * * * 
   * * * * * 
  
 * 
 */

package Patterns.Daimonds;

public class Pattern2 {

	public static void pattern(int n) {
		int i, j;

		// outer loop to handle number of rows
		// n in this case
		for (i = 0; i < n; i++) {

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (j = 2 * (n - i); j >= 0; j--) {
				// printing spaces
				System.out.print("-");
			}

			// inner loop to handle number of columns
			// values changing acc. to outer loop
			for (j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();

		}
	}

	public static void pattern1(int n)
	{
		for(int i=0;i<=n;i++){
			for(int j=(n-i);j>0;j--)
			{
				System.out.print(" ");
			}
			for(int j=n-i;j<n;j++)
			{
				System.out.print("* ");	
			}
			
			System.out.println();
		}
	}
	
	public static void reverse(int n)
	{
	
		for(int i=n;i>=0;i--){
			for(int j=(n-i);j>0;j--)
			{
				System.out.print(" ");
			}
			for(int j=n-i;j<n;j++)
			{
				System.out.print("*");	
			}
			
			System.out.println();
		}
	}
	
	public static void outline(int n)
	{
		for(int i=0;i<=n;i++){
			if(i==1 || i==n)
			{
			for(int j=(n-i);j>=0;j--)
			{
				System.out.print("*");
			}
			for(int j=n-i;j<=n;j++)
			{
				System.out.print(" ");	
			}
			}
			else{
				
				for(int j=(n-i);j>0;j--)
				{
					System.out.print(" ");					
				}
				for(int j=n-i;j<n;j++)
				{	if(j==1 || j==i)
					{
					System.out.print("*");	
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		//pattern1(5);
		//reverse(5);
		outline(5);
	}
}
