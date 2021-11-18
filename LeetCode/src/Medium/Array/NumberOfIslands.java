/**
 * 200. Number of Islands
Medium

10147

267

Add to List

Share
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] is '0' or '1'.
 */

package Medium.Array;

public class NumberOfIslands {
static int m;
static int n;
	private static void DSMarking(char[][] grid ,int i, int j){
		if(i<0 || j<0 || i>=m || j>=n || grid[i][j]!='1') return;
		grid[i][j] = '0';
		DSMarking(grid,i+1,j);
		DSMarking(grid,i-1,j);
		DSMarking(grid,i,j+1);
		DSMarking(grid,i,j-1);
	}
	public static int numIsLands(char[][] grid)
	{
		int count =0;
		n=grid.length;
		if(n == 0) return 0;
		m=grid[0].length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(grid[i][j] == '1')
				{
					DSMarking(grid ,i,j);
					count++;
				}
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		char[][] arr={
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'}};
		System.out.println(numIsLands(arr));
	}

}
