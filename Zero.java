import acm.program.ConsoleProgram;

public class Zero extends ConsoleProgram {

	public void init() {
		int[][] matrix = { { 1, 0, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 1, 2 } };
		println(matrix[1][3]);
	}

}
