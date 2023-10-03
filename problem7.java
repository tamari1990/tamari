import stanford.karel.SuperKarel;

public class problem7 extends SuperKarel  {
	public void run(){
		
		for(!beepersPresent()){
			putBeeper();
		}
		while(frontIsClear()){
			move();
		}
		turnLeft();
		move();
		turnLeft();
		while(frontIsClear()){
			move();
		}
		turnRight();
		move();
		turnRight();
	 
	}

	}
