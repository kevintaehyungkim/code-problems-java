/* 
Write an algorithm such that if an element in an MxN matrix is 0,
its entire row and column are set to 0.

Don't need O(MN) space because we're going to set the entire row and column to zero,
so there's no need to track the exact location of the zero. Thus we can implement in O(n) space
using two arrays to keep track of all the rows/cols with zeros.
*/

void setZeros (int[][] matrix){
	// Arrays to hold whether certain rows/cols should be set to 0
	boolean[] zero_rows = new boolean [matrix.length];
	boolean[] zero_cols = new boolean [matrix[0].length];

	// First iterate through matrix and flag rows and cols that need to be set to 0
	for (int r = 0; r < matrix.length; r++){
		for (int c = 0; c < matrix[0].length; c++){
			if (matrix[r][c] == 0){
				zero_rows[r] = true;
			}
		}
	}

	// Nullify rows
	for (int i = 0; i < zero_rows.length; i++){
		if (zero_rows[i]) nullifyRow(i, matrix);
	}

	// Nullify columns
	for (int j = 0; j < zero_cols.length; j++){
		if (zero_rows[i]) nullifyCol(j, matrix);
	}
}

void nullifyRow (int row, int[][] matrix) {
	for (int i = 0; i < matrix[0].length; i++){
		matrix[row][i] = 0;
	}
}

void nullifyCol (int col, int[][] matrix) {
	for (int i = 0; i < matrix.length; i++){
			matrix[i][col] = 0;
		}
}

/* 
Space: O(n)
*/
