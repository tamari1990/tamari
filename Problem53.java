import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Problem53 extends ConsoleProgram {

	public void run() {
		try {
			BufferedReader rd = new BufferedReader(new FileReader("53"));
			String text = "";
			while (true) {
				String newLine = rd.readLine();
				if (newLine == null) {
					break;
				}
				text = text + newLine + "/n";
			}
			rd.close();
			countStatistics(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			println("file not found");
		} catch (IOException e) {
			e.printStackTrace();
			println("some other error detected");
		}
	}

	private void countStatistics(String text) {
		int numOfSymbols = 0;
		for(int i = 0; i < text.length(); i++){
			if(text.charAt(i) != ' '){
				numOfSymbols++;
			}
		}
		println(numOfSymbols);
		
	}

}
