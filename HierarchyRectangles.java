import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class HierarchyRectangles extends GraphicsProgram {
	private static final double RECT_LENGTH = 200;
	private static final double RECT_HEIGHT = 60;
	private static final double distanceBetweenTheThreeRects = 40;
	private static final double distanceBetweenTheAboveAndCentreRects = 120;

	public void run() {
		for (int i = 0; i < 3; i++) {
			double x = getWidth() / 2 - RECT_LENGTH * 3 / 2 - distanceBetweenTheThreeRects + i * distanceBetweenTheThreeRects + RECT_LENGTH;
			double y = getHeight() / 2 + distanceBetweenTheAboveAndCentreRects / 2;
			GRect leftRect = new GRect(RECT_LENGTH, RECT_HEIGHT);
			add(leftRect, x, y);
			
		}
	}

}
