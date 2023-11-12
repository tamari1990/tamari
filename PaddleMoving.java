import java.awt.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;

public class PaddleMoving extends GraphicsProgram  {
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;
	private static final int PADDLE_Y_OFFSET = 30;
	public void init() {
		GRect paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
		int x = getWidth() / 2 - PADDLE_WIDTH / 2;
		int y = getHeight() / 2 - PADDLE_Y_OFFSET - PADDLE_HEIGHT;
		paddle.setFilled(true);
		add(paddle, x, y);
		addMouseListeners();
	}
	public void mousePressed(MouseEvent e){
		last = new GPoint(e.getPoint());
	      gobj = getElementAt(last);
		
	}
	public void mouseDragged(MouseEvent e){
		if(gobj != null) {
			gobj.move(e.getX() - last.getX(), e.getY() - last.getY());
	         last = new GPoint(e.getPoint());
		}
	}
GPoint last;
GObject gobj;
GRect paddle;
}
