import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class HierarchyLines extends GraphicsProgram {
	private static final double distanceBetweenTheAboveAndCentreRects = 120;
	public void run() {
	double x1 = getWidth() / 2;
	double y1 = getHeight() / 2 - distanceBetweenTheAboveAndCentreRects / 2 ;
	double x2 = x1;
	double y2 =  getHeight() / 2 + distanceBetweenTheAboveAndCentreRects / 2 ;
	GLine firstLine = new GLine (x1, y1, x2, y2);
	add(firstLine);
	

}
}