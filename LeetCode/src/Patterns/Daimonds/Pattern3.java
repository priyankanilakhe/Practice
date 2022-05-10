/**
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 
* 
 */
package Patterns.Daimonds;

public class Pattern3 {
	
	public static void pattern3(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=2*(n-i);j>0;j--){
				System.out.print(" ");
			}
			for(int j=(n-i);j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void reverse(int n)
	{
		for(int i=n;i>0;i--)
		{
			for(int j=2*(n-i);j>0;j--){
				System.out.print(" ");
			}
			for(int j=(n-i);j<n;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void  outline(int n){
		for(int i=n;i>0;i--)
		{
			for(int j=2*(n-i);j>0;j--){
				System.out.print(" ");
			}
			if(i==1||i==n){
			for(int j=(n-i);j<n;j++)
			{
				System.out.print(" *");
			}
			}
			else {
				//if(i>1 || i<n-1){
					for(int j=(n-i);j<n;j++)
					{
						if(j==n || j==n-i)
						{
						System.out.print(" *");
						}
						else{
							System.out.print(" ");
						}
					}
				//}
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		//pattern3(5);
		//reverse(5);
		outline(5);
	}
}
