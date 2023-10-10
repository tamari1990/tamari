import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class GraphicPractice extends GraphicsProgram {
	public void run (){
		GOval rugbyBall = new GOval(100, 200);
		
		add(rugbyBall, 100,100);
		//GOval secondOval = new GOval(100, 200);
		rugbyBall = new GOval(200,200);
		add(rugbyBall, 200, 200);
		
		GOval oldBall = rugbyBall;
		rugbyBall= new GOval(100, 200, 200, 300);
		
		add(rugbyBall);
		rugbyBall.setFilled(true);
		rugbyBall.setColor(Color.RED);
		
		oldBall.setFilled(true);
	}

}
