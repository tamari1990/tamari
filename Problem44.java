import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem44 extends GraphicsProgram{
	GOval circle;
	private static final int R = 50;
	public void run() {
		circle = new GOval (2 * R, 2 * R);
		circle.setFilled(true);
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e){
		add(circle, e.getX() - R, e.getY() - R);
	}
}
