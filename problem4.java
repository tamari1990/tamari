import stanford.karel.SuperKarel;

public class problem4 extends SuperKarel {

	public void run() {
		while(frontIsClear()){
			putBeeper();
			move();
		}
	}
}
