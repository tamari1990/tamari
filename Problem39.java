import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram {
	private static final int R = 50;
	public void run() {
		drawTheCircle();
	}
    
	private void drawTheCircle() {
		GOval oval = new GOval ( 2 * R , 2 * R);
		int x = 0; 
		int y = getHeight() / 2 - R;
		add(oval, x, y);
		oval.setFilled(true);
	}

}
