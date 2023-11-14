import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem43 extends GraphicsProgram {
	private static final int R = 50;
	private GOval circle;
	private int prevX;
	private int prevY;
	public void run() {
		circle = new GOval(2 * R, 2 * R);
		circle.setFilled(true);
		add(circle, getWidth() / 2 - R, getHeight() / 2 - R);
		addMouseListeners();
	}
	public void mousePressed(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj != null) {
			prevX = e.getX();
			prevY = e.getY();
		}
	}
	public void mouseDragged(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if(obj != null){
			obj.move(e.getX() - prevX, e.getY() - prevY);
			prevX = e.getX();
			prevY = e.getY();
		}
	}

}
