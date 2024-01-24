import acm.program.ConsoleProgram;

public class Zero extends ConsoleProgram {

	public void init() {
		int[][] matrix = { { 1, 0, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 1, 2 } };
		matrix = nullTheMatrix(matrix);
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				print(matrix[row][column]);
			}
		}
	}

	private int[][] nullTheMatrix(int[][] matrix) {
		int[][] newMatrix = new int[matrix.length][matrix[0].length];
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				newMatrix[i][j] = matrix[i][j];
			}
		}
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				if (matrix[row][column] == 0) {
					for (int c = 0; c < matrix[0].length; c++) {
						matrix[row][c] = 0;
					}
					for (int r = 0; r < matrix.length; r++) {
						matrix[r][column] = 0;
					}
				}
			}
		}
		return newMatrix;
	}

}
