import stanford.karel.SuperKarel;

public class problem6 extends SuperKarel {

	public void run(){
		move();
		moveFisrtPileToDestinitionAndBackup();
		move();
		moveFisrtPileToDestinitionAndBackup();
		//moveToFisrtPilePosition
		restoreFromBackup();
		//moveToFisrtPilePosition
		restoreFromBackup();
}

	private void moveFisrtPileToDestinitionAndBackup() {
		while(beepersPresent()){
			pickBeeper();
			moveBeeperFromFirstPileToDestination();
			backupBeeper();
		}
		
	}

	private void backupBeeper() {
		turnLeft();
		move();
		putBeeper();
		turnAround();
		move();
		turnLeft();
		
	}

	private void moveBeeperFromFirstPileToDestination() {
           move();
           move();
           putBeeper();
           turnAround();
           move();
           move();
           turnAround();
		
	}
}