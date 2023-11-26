import acm.program.GraphicsProgram;

import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class Zigzag extends GraphicsProgram {
private int x1;
private int y1;
	public void run() {
		x1 = 0;
		y1 = 0;
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		int x2 = e.getX();
		int y2 = e.getY();
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
		x1 = x2;
		y1 = y2;
	}
	public void mouseDragged(MouseEvent e) {
		int x2 = e.getX();
		int y2 = e.getY();
		GLine line = new GLine(x1, y1, x2, y2);
		add(line);
		
	}

}
