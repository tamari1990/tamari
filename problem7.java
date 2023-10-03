import stanford.karel.SuperKarel;

public class problem7 extends SuperKarel  {
	public void run(){
		
		if(!beepersPresent()){
			putBeeper();
		}
		if(frontIsClear()){
			move();
		}
		turnLeft();
		move();
	    turnLeft();
	  
	    
	 if(frontIsClear()){
		move();
		}
	 turnRight();
	 move();
	 turnRight();
	 
	}

}
