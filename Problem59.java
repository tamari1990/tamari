import acm.program.ConsoleProgram;

public class Problem59 extends ConsoleProgram {
	
	public void run(){
		int[][] matrix = new int[][] {
			{0,1,1,0,0,1,0,0}, 
			{0,1,1,1,1,1,0,0},
			{0,0,1,1,1,1,0,0}, 
			{0,0,1,1,1,1,0,0},
		};
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				int num = matrix[i][j];
				if(num == 1){
					for(int k = i; k < matrix[0].length; k++){
						if(matrix[k][j] == 1){
							for(int r = 0; r < matrix[0].length - j - 1; r++){
								if(matrix[i][j + 1 + r] == 1 && matrix[k][1 + r + j] == 1){
									println((k - i) * (r + 1));
								}
							}
						}
					}
				}
			}
		}
	}

}
