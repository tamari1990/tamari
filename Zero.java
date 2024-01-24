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
		return matrix;
	}

}
