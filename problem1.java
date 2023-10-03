
import stanford.karel.SuperKarel;

public class problem1 extends SuperKarel {
	
	public void run(){
		
		//კარელი დგას 1x1 უჯრაზე. 3x1 უჯრაზე დევს ბრილიანტი, კარელმა ბრილიანტი უნდა
		//გადაიტანოს 4x1 უჯრაზე და დაამთავროს მუშაობა.
		move();
		move();
		pickBeeper();
		move();
		putBeeper();
	}

}
