import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram {
	private static final int R = 50;
	private static final int PAUSE_MS = 20;
	private static final int vx = 2;
	public void run() {
		GOval circle = drawTheCircle();
		while(circle.getX() <= getWidth()) {
			int vy = 0;
			circle.move(vx,vy);
			pause(PAUSE_MS);
		}
	}
    
	private GOval drawTheCircle() {
		GOval oval = new GOval ( 2 * R , 2 * R);
		int x = 0; 
		int y = getHeight() / 2 - R;
		add(oval, x, y);
		oval.setFilled(true);
		return oval;
	}

}
