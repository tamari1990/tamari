import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class HierarchyLines extends GraphicsProgram {
	private static final double distanceBetweenTheAboveAndCentreRects = 120;
	private static final double RECT_LENGTH = 200;
	private static final double distanceBetweenTheThreeRects = 40;
	public void run() {
		for(int i = 0; i < 3; i++) {
	double x1 = getWidth() / 2;
	double y1 = getHeight() / 2 - distanceBetweenTheAboveAndCentreRects / 2 ;
	double x2 = getWidth() / 2 - RECT_LENGTH - distanceBetweenTheThreeRects + i * (RECT_LENGTH + distanceBetweenTheThreeRects);
	double y2 =  getHeight() / 2 + distanceBetweenTheAboveAndCentreRects / 2 ;
	GLine firstLine = new GLine (x1, y1, x2, y2);
	add(firstLine);
	
		}
}
}