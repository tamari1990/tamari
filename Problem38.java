import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

/*38. მოხმარებელს აქვს საწყისი თანხა 1000, თამაშობს მანამ სანამ არ წააგებს ყველაფერს. ყოველ
ჯერზე შეყავს ფსონის თანხა და რიცხვი რომელზეც დებს. ხდება რულეტკის დატრიალების
სიმულაცია(0-დან 36-მდე შემთხვევითი რიცხვი), მოგების შემთხვევაში მოთამაშეს
უორმაგედბა დადებული თანხა წაგების შემთხვევაში კი მოთამაშე კარგავს დადებულ თანხას.
მოთამაშე მოგებულია მაშინ თუ რულეტკაზე ამოსული რიცხვი ემთხვევა მის მიერ დადებულ
რიცხვს. პროგრამა ყოველ მოქმედებაზე უნდა ბეჭდავდეს შესაბამის შეტყობინებას, ადვილად

რომ გაერკვეს მოთამაშე, რა რიცხვი ამოვიდა, რამდენი წააგო, რამდენი მოიგო, რამდენი აქვს
ბალანსი. */
public class Problem38 extends ConsoleProgram {
	private static final int AMOUNT_OF_MONEY = 1000;
	private static final int MIN_NUM = 0;
	private static final int MAX_NUM = 36;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		while (AMOUNT_OF_MONEY > 0) {
			int remainingMoney = AMOUNT_OF_MONEY;
			int betMoney = betTheMoney();
			int outcome = spinTheRoulette();
			int betNum = makeTheBet();
			if (betNum == outcome) {
				println("YOU WON!");
				remainingMoney = remainingMoney * 2;
				println("remainingMoney");

			} else {
				println("YOU LOST");
				remainingMoney = remainingMoney - betMoney;
				println("remainingMoney");
			}
		}

	}

	private int makeTheBet() {
		int numYouBetOn = readInt("Enter a number 0 - 36: ");	
		return numYouBetOn;
	}

	private int spinTheRoulette() {
		int outcomingNumber = rgen.nextInt(MIN_NUM, MAX_NUM);
		return outcomingNumber;

	}

	private int betTheMoney() {
		int betMoney = readInt("Enter bet amount: ");
		return betMoney;
	}
}
