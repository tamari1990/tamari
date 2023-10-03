import stanford.karel.SuperKarel;

public class problem7 extends SuperKarel  {
	public void run(){
		while(upIsBlocked())
		
		while(frontIsClear()){
			if(!beepersPresent()){
				putBeeper();
			}
			move();
			
		}
		if(!beepersPresent()){
			putBeeper();
		}
		turnLeft();
		move();
		if(!beepersPresent()){
			putBeeper();
		}
		turnLeft();
	
		
		while(frontIsClear()){
			if(!beepersPresent()){
				putBeeper();
			}
			move();
			
		}
		turnRight();
		move();
		if(!beepersPresent()){
				putBeeper();
			}
	   turnRight();
			
		
		
	
	 
	}

	}
