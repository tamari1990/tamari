import stanford.karel.SuperKarel;

public class problem7 extends SuperKarel  {
	public void run(){
		
		
		while(frontIsClear()){
			if(!beepersPresent()){
				putBeeper();
			}
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
