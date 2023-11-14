import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem44 extends GraphicsProgram{
	GOval circle;
	private static final int R = 50;
	private static final int V_Y = 5;
	public void run() {
		circle = new GOval (2 * R, 2 * R);
		circle.setFilled(true);	
		addMouseListeners();
		while(true) {
			circle.move(0,  V_Y);
		}
	}

	public void mouseClicked(MouseEvent e){
		add(circle, e.getX() - R, e.getY() - R);
	}
}
