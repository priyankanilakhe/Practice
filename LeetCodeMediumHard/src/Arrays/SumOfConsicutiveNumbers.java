package Arrays;

public class SumOfConsicutiveNumbers {
	static int canBeSumofConsec( int n) 
	{ 
		//convert n into binary and perform and operation which is
		//1 and 1=1 
		//1 &0 =0
		//0&1=0
		//0&0=0
	    // Updating n with 2n
 	    n = 2 * n;
	     System.out.println(n & (n-1));
	    // (n & (n - 1)) => Checking whether we can write 2n as 2^k
	    // if yes (can't represent 2n as 2^k) then answer 1
	    // if no (can represent 2n as 2^k) then answer 0
	    return ((n & (n - 1)) != 0)?1:0;
	}
	//https://leetcode.com/problems/consecutive-numbers-sum/
	//https://leetcode.com/problems/consecutive-numbers-sum/discuss/1117669/Mathematical-Solution
	static int countOfNumberOfCosicutiveSumPossible(int n)
	{
		int count=0;
		for(int k=1;2*n>k*(k-1);k++)
		{
			int numarator=n-k*(k-1)/2;
			if(numarator%k==0) count++;
		}
		return count;
	}
	  
	public static void main(String[] args)
	{
	    int n = 15;
	    System.out.print(countOfNumberOfCosicutiveSumPossible(n)+"\n");
	}
}
