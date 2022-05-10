package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SetMatrixZero {

	public static int[][] setMatrix(int[][] matrix) {
		int row = 1, col = 1;
		// set col 0 if first row contains 0
		for (int i = 0; i < matrix[0].length - 1; i++) {
			if (matrix[i][0] == 0) {
				col = 0;
				break;
			}

		}
		// set col 0 if first col contains 0
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[0][i] == 0) {
				row = 0;
				break;
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		// set col to zero if found the 0th row as zero
		for (int i = 1; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				for (int j = 0; j < matrix.length; j++) {
					matrix[j][i] = 0;
				}
			}
		}
		// set row to zero if found the 0th row as zero
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				for (int j = 1; j < matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			if (row == 0) {
				matrix[0][i] = 0;
			}
		}
		for (int i = 0; i < matrix[0].length - 1; i++) {
			if (col == 0) {
				matrix[i][0] = 0;
			}
		}
		return matrix;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(setMatrix(new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } })));

	}

}
