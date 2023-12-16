import acm.program.ConsoleProgram;

public class Problem59 extends ConsoleProgram {

    public void run() {
        int[][] matrix = new int[][] {
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
        };

        int maxLength = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int num = matrix[i][j];
                if (num == 1) {
                    for (int k = i; k < matrix.length; k++) {
                        if (matrix[k][j] == 1) {
                            for (int r = 0; j + 1 + r < matrix[0].length && matrix[i][j + 1 + r] == 0 && matrix[k][j + 1 + r] == 0; r++) {
                                int width = r + 1;
                                int height = k - i + 1;
                                int area = width * height;
                                if (area > maxLength) {
                                    maxLength = area;
                                }
                            }
                        }
                    }
                }
            }
        }

        println(maxLength);
    }
}