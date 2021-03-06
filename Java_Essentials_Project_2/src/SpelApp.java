
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SpelApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int aantalSpelers;
		String geboorteJaarSpeler;
		int score;
		String spelersNaam = new String("");
		String beoordeling = new String("");
		SpelEvaluatie [] SpelEvaluatieArray;
		
		OnlineSpel spel = new OnlineSpel("Total War", new Uitgever("The Creative Assembly", "Horsham", 1987, 5, 24));
		
		System.out.println(spel.toString());
		
		System.out.println();
		System.out.println("Hoeveel spelers evalueren het spel: ");
		aantalSpelers = keyboard.nextInt();
		keyboard.nextLine();
		SpelEvaluatieArray = new SpelEvaluatie [aantalSpelers];
		
		//gegevens opnemen
		for(int i = 0; i < aantalSpelers; i++) {
			System.out.println("Geef een speler naam: ");
			spelersNaam = keyboard.nextLine();
			
			System.out.println("Geef Geboortedatum (dd-MM-yyyy):");
			geboorteJaarSpeler = keyboard.nextLine();
						
			System.out.println("Geef score (0-5):");
			score = keyboard.nextInt();
			
			keyboard.nextLine();
			System.out.println("Geef uw motivatie: ");
			beoordeling = keyboard.nextLine();
			
			SpelEvaluatieArray[i] = new SpelEvaluatie(spel, new Speler(spelersNaam, geboorteJaarSpeler));
			SpelEvaluatieArray[i].maaktBeoordeling(score, beoordeling);
		}
		
		printInformatie(SpelEvaluatieArray);
		
		
		SpelEvaluatieArray[0].maaktBeoordeling(5,  "lol");
		
		keyboard.close();
	}
	
	public static void printInformatie(SpelEvaluatie [] SpelEvaluatieArray) {
		DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("HH:mm");
		Score [] scoreArray = new Score [SpelEvaluatieArray.length];
		System.out.println("Evaluatie " + SpelEvaluatieArray[0].getSpel().getNaam());
		
		for(int i = 0; i < SpelEvaluatieArray.length; i++) {
			System.out.printf("%s %-20s %-5s %-20s %c\n", SpelEvaluatieArray[i].getTijdstip().format(outputFormat) ,SpelEvaluatieArray[i].getSpeler().getNaam(), SpelEvaluatieArray[i].getScore().getStars(), SpelEvaluatieArray[i].getMotivatie(), getCharacter(SpelEvaluatieArray[i]));
			scoreArray[i] = SpelEvaluatieArray[i].getScore();
		}
		
		Score totaalScore = new Score(scoreArray);
		System.out.println("Totaalscore: " + totaalScore.getStars());
		
	}
	
	private static char getCharacter(SpelEvaluatie s) {
		if(s.isGeldig()) {
			return '+';
		} else {
			return '-';
		}
	}
	
}
