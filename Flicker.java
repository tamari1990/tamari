import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Flicker extends GraphicsProgram{
	private static final int CIRCLE_D = 100;
	public void run() {
		addMouseListeners();
	}
	public void mouseClicked (MouseEvent e){
		int x = e.getX();
		int y = e.getY();
		GOval circle = new GOval (CIRCLE_D, CIRCLE_D);
		add(circle, x - CIRCLE_D / 2 , y - CIRCLE_D / 2);
	}

}
