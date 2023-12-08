import java.io.*;

import acm.program.ConsoleProgram;

public class Problem52 extends ConsoleProgram {

	public void run() {
		try {
			BufferedReader rd = new BufferedReader(new FileReader("52"));
			while (true) {
				String line = rd.readLine();
				if (line == null) {
					break;
				}
				println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
			println("error detected");
		}

	}

}
