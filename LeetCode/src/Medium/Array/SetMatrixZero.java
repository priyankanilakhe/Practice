//https://leetcode.com/problems/set-matrix-zeroes/
package Medium.Array;

public class SetMatrixZero {
	/*
	IDEA:
	    1st matrix loops:  To have a row array, and col array and to mark the row and col index to 1 when we find a 0.
	    2nd matrix loops:  if that row OR col is a 1, we trun the matrix[][] position to 0
	*/
	    public void setZeroes(int[][] matrix) {
	        //Mark the row and col that needs to be turned to 0
	        int[] row = new int[matrix.length]; 
	        int[] col = new int[matrix[0].length];
	        
	        //1st Loops to mark our arrays
	        for(int i=0;i<matrix.length;i++)
	            for(int j=0;j<matrix[0].length;j++)
	                if(matrix[i][j]==0){
	                    row[i]=1;
	                    col[j]=1;
	                }        
	        
	        //2nd loop to check if array row/col position is 1
	        for(int i=0;i<matrix.length;i++)
	            for(int j=0;j<matrix[0].length;j++)
	                if(row[i]==1||col[j]==1)
	                    matrix[i][j]=0;
	                    
	    }
	    
	    //Second solution
	    public void setZeroes1(int[][] matrix) {
	        boolean fr = false,fc = false;
	        for(int i = 0; i < matrix.length; i++) {
	            for(int j = 0; j < matrix[0].length; j++) {
	                if(matrix[i][j] == 0) {
	                    if(i == 0) fr = true;
	                    if(j == 0) fc = true;
	                    matrix[0][j] = 0;
	                    matrix[i][0] = 0;
	                }
	            }
	        }
	        for(int i = 1; i < matrix.length; i++) {
	            for(int j = 1; j < matrix[0].length; j++) {
	                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
	                    matrix[i][j] = 0;
	                }
	            }
	        }
	        if(fr) {
	            for(int j = 0; j < matrix[0].length; j++) {
	                matrix[0][j] = 0;
	            }
	        }
	        if(fc) {
	            for(int i = 0; i < matrix.length; i++) {
	                matrix[i][0] = 0;
	            }
	        }
	        
	    }
}
