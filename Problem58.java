import acm.program.ConsoleProgram;

public class Problem58 extends ConsoleProgram {

	public void run() {
		int[][] magic = new int[2][2];
		magic[0][0] = 1;
		magic[0][1] = 2;
		magic[1][0] = 3;
		magic[1][1] = 4;
		boolean isMagic = true;
		println(magic.length);
		println(magic[0].length);
		println(isMagic);
		for (int r = 0; r < magic.length; r++) {
			for (int c = 0; c < magic[0].length; c++) {
				int num = magic[r][c];
				if (num > magic.length * magic[0].length) {
					isMagic = false;
				}
				for (int j = 0; j < magic.length; j++) {
					for (int k = 0; k < magic[0].length; k++) {
						if(num == magic[j][k] && r!=j && c!=k){
							isMagic = false;
						}
					}
				}
			}
		}

	}
}
