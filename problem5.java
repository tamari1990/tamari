import stanford.karel.SuperKarel;

public class problem5  extends SuperKarel {

	public void run(){
		while(frontIsClear()){
			if(!beepersPresent()){
				putBeeper();
			}
			move();
		}
		if(!beepersPresent()){
			putBeeper();
		}
	}
}
