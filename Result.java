import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Result extends GraphicsProgram {
	public void run() {
		int x = 1;
		int y = 2;
		GOval o = new GOval(2, 1); // width, height
		println(racxa(x, 2, o));
		println(racxa(y, x / 2 + x, o));
	}

	public int racxa(int x, int y, GOval o){
	String s = "hello world";
	x = varesiRacxa(x/y, x+(int)o.getHeight(), s); //5
	o.scale(2);
	y = varesiRacxa(x, y+(int)o.getHeight(), s);   //7
	return x+y;
	}

	public int varesiRacxa(double x, int y, String s) {
		int z = (int) x + s.charAt(0) - s.charAt(1);
		s = s.substring(1);
		return z + y;
	}
}
