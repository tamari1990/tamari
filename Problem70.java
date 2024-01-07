import acm.graphics.*;
import acm.program.*;
import java.awt.Color;
import java.awt.event.ComponentEvent;

public class Problem70 extends GraphicsProgram {
    private GCompound grid;
    private GRect shape;

    private int numRows = 10; 
    private int numCols = 10; 

    public void run() {
        drawShape();
        drawGrid();
    }

    public void componentResized(ComponentEvent e) {
        drawGrid();
    }

    private void drawShape() {
        if (shape != null) {
            remove(shape);
        }
        shape = new GRect(200, 100);
        shape.setFilled(true);
        shape.setFillColor(Color.BLUE);
        add(shape, getWidth() / 2.0 - shape.getWidth() / 2.0, getHeight() / 2.0 - shape.getHeight() / 2.0);
    }

    private void drawGrid() {
        if (grid != null) {
            remove(grid);
        }

        grid = new GCompound();

        double boxWidth = shape.getWidth() / numCols;
        double boxHeight = shape.getHeight() / numRows;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                GRect gridBox = createGridBox(boxWidth, boxHeight);
                grid.add(gridBox, col * boxWidth, row * boxHeight);
            }
        }

        add(grid);
    }

    private GRect createGridBox(double width, double height) {
        GRect gridBox = new GRect(width, height);
        gridBox.setColor(Color.LIGHT_GRAY);
        return gridBox;
    }
}