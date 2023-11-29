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
	x++;
	y += 1;
	r.move(x,y);
	s = s.substring(s.indexOf('a'));
	return (int)(x + y + r.getX() + s.length());
	}
	}
