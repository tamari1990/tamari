import acm.graphics.*;
import acm.program.ConsoleProgram;

public class Print1 extends ConsoleProgram {
	public void run() {
		int x = 1;
		int y = 2;
		GObject o = new GRect(x, y);
		String s = "shalaxo";
		println(iseRa(x, y, o, s));
		println(iseRa(x, y, o, s));
	}

	private int iseRa(int x, double y, GObject r, String s){
	x++;    // X = 2;   x = 3;
	y += 1;  // Y = 3;  y = 4;
	r.move(x,y);
	s = s.substring(s.indexOf('a')); // S = "alaxo" length = 5;
	return (int)(x + y + r.getX() + s.length());
	}
	}
