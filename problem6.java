import stanford.karel.SuperKarel;

public class problem6 extends SuperKarel {

	public void run(){
		move();
		while(beepersPresent()){
			pickBeeper();
		}
		move();
		while(beepersPresent()){
			pickBeeper();
		}
		move();
		while(beepersInBag()){
			putBeeper();
		}
		move();
	}
}
