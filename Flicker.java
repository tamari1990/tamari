import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Flicker extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int CIRCLE_D = 100;
	private int colorNumber;

	public void run() {
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());

        if (obj == null) {
            createCircle(e.getX(), e.getY());
        } else if (obj instanceof GOval) {
            flashCircle((GOval) obj);
        }
		}

	private void flashCircle(GOval obj) {
		// TODO Auto-generated method stub
		
	}

	private void createCircle(int x, int y) {
		GOval circle = new GOval(CIRCLE_D, CIRCLE_D);
		add(circle, x - CIRCLE_D / 2, y - CIRCLE_D / 2);
		circle.setFilled(true);
		
	}
		
	}

	

	
