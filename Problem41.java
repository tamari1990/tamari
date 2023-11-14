import java.awt.event.MouseEvent;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//41. გააკეთეთ Paint-ის ფანქრის ანალოგიური ხელსაწყო. კერძოდ, მაუსის ყოველ მოძრაობაზე
//ეკრანზე დაამატეთ გაფერადებული წრეწირები იმავე წერტილში სადაც მაუსი მდებარეობს.
public class Problem41 extends GraphicsProgram {
    private static final int R = 30; 
		public void run() {
	addMouseListeners();
		}
	public void mouseDragged (MouseEvent event){
		addBall(event.getX(), event.getY());
	}
	public void mouseClicked (MouseEvent e) {
		addBall(e.getX(), e.getY());
	}
	private void addBall(int centerX, int centerY) {
		GOval ball = new GOval (2 * R, 2 * R);
		ball.setFilled(true);
		add(ball, centerX - R, centerY - R );
	}
}
