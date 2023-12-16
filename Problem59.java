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
                if (matrix[i][j] == 1) {
                    int k = i;
                    while (k < matrix.length && matrix[k][j] == 1) {
                        int r = 0;
                        while (j + r < matrix[0].length && matrix[i][j + r] == 1 && matrix[k][j + r] == 1) {
                            r++;
                        }
                        int width = r;
                        int height = k - i + 1;
                        int area = width * height;
                        maxLength = Math.max(maxLength, area);
                        k++;
                    }
                }
            }
        }

        println(maxLength);
    }
}