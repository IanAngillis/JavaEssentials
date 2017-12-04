package asteroids;

//CHECK POSITION AND ERROR HANDLING
import java.util.Scanner;
import java.util.Random;

public class Game {
	private char[][] gameSpace = new char[10][14];
	private String playerName;
	private int points;
	private int shipLocation;
	private boolean playerIsDead;
	private final int ASTEROIDMAX = 15;
	private int asteroidsOnTheField;
	private int turn;

	// Constructors
	Game() {
		this("unknown");
	}

	Game(String newPlayerName) {
		this.setPlayerName(newPlayerName);
	}

	// Getters and setters
	// Getters
	public int getAsteroidsOnTheField() {
		return this.asteroidsOnTheField;
	}

	public int getShipLocationRow() {
		return 9;
	}

	public int getShipLocationColumn() {
		return this.shipLocation;
	}

	public String getPlayerName() {
		return this.playerName;
	}

	public int getPoints() {
		return this.points;
	}

	public char[][] getGameSpace() {
		return this.gameSpace;
	}

	// Setters
	private void setAsteroidsOnTheField(int newAsteroidsOnTheField) {
		if (newAsteroidsOnTheField < 0) {
			newAsteroidsOnTheField = 0;
		}

		this.asteroidsOnTheField = newAsteroidsOnTheField;
	}

	private void setShipLocation(int newColumn) {
		this.shipLocation = newColumn;
	}

	public void setPlayerName(String newPlayerName) {
		Scanner keyboard = new Scanner(System.in);

		if (newPlayerName.equals("unknown")) {
			System.out.println("Name: ");
			newPlayerName = keyboard.nextLine();
		}

		this.playerName = newPlayerName;

	}

	private void setPoints(int newPoints) {
		this.points = newPoints;
	}

	// Functions
	// Prints the current state of the gamespace
	public void printGameSpace() {

		for (int i = 0; i < gameSpace.length; i++) {

			for (int j = 0; j < gameSpace[i].length; j++) {
				System.out.print(gameSpace[i][j]);

			}
			if (i == 0) {
				System.out.print("  Points: " + this.getPoints());
			}
			System.out.println();
		}
	}

	// Prints all the game information
	public void printCurrentGameState() {
		System.out.println("Current game state: ");
		System.out.println("Playername: " + this.getPlayerName());
		System.out.println("Points: " + this.getPoints());
		System.out
				.println("Ship location: row " + this.getShipLocationRow() + " column " + this.getShipLocationColumn());
		System.out.println("Gameboard: ");
		this.printGameSpace();
	}

	public void initializeGameSpace() {
		this.getGameSpace()[9][7] = 'X';
		this.setShipLocation(7);
	}

	public void playGame() {
		Scanner keyboard = new Scanner(System.in);
		char move;
		this.turn = 0;
		this.printWelcomeMessageAndRules();
		this.initializeGameSpace();
		this.updateAsteroids();
		this.printGameSpace();

		while (!this.playerIsDead) {

			move = keyboard.next().charAt(0);

			this.updateGameSpace(move);
			this.printGameSpace();
			this.turn++;

		}

		System.out.println("DEFEAT");
		System.out.println("SCORE: " + this.getPoints());

	}

	private void updateGameSpace(char move) {
		int direction;

		if (move != 'a' && move != 'z' && move != 'e') {
			return;
		}

		if (move == 'z') {
			this.destroyAsteroidInColumn();
		} else {
			direction = this.getDirection(move);
			this.moveShip(direction);
		}

		this.updateAsteroids();
		this.setPoints(this.getPoints() + 1);
	}

	private void updateAsteroids() {
		int[] asteroidPositionsPreviousRow = new int[14];

		for (int i = 0; i < 9; i++) {
			this.deleteAsteroids(this.getGameSpace().length - 1 - i);

			asteroidPositionsPreviousRow = getAsteroidsPosition(this.getGameSpace().length - 2 - i);
			if(i == 0) {
				this.checkShipCondition(asteroidPositionsPreviousRow);

			}
			this.addAsteroidsToCurrentRow(this.getGameSpace().length - 1 - i, asteroidPositionsPreviousRow);

		}
		this.deleteAsteroids(0);
		this.createNewAsteroidsAndObstacles();

	}

	private void checkShipCondition(int[] asteroidList) {
		for (int i = 0; i < asteroidList.length; i++) {

			if (asteroidList[i] == this.getShipLocationColumn()) {
				this.playerIsDead = true;
			}
		}
	}

	private void createNewAsteroidsAndObstacles() {
		Random rand = new Random();
		int random, asteroidsOnCurrentRow = 0;

		for (int i = 1; i < 14; i++) {

			random = rand.nextInt(100);

			if (random < 33) {

				if (asteroidsOnCurrentRow < 3 && this.getAsteroidsOnTheField() <= this.ASTEROIDMAX) {
					this.getGameSpace()[0][i] = '*';
					this.setAsteroidsOnTheField(this.getAsteroidsOnTheField() + 1);
					asteroidsOnCurrentRow++;
				}
			}
		}
	}

	private void addAsteroidsToCurrentRow(int row, int[] asteroidPositions) {
		int index = 0;

		for (int i = 0; i < 14; i++) {

			if (i == asteroidPositions[index]) {

				if (i != 0) {
					this.getGameSpace()[row][i] = '*';
					index++;
				}

			}
		}

	}

	private int[] getAsteroidsPosition(int row) {
		int[] asteroidPositions = new int[14];
		int index = 0;

		for (int i = 0; i < 14; i++) {
			if (this.getGameSpace()[row][i] == '*') {
				asteroidPositions[index] = i;
				index++;
			}
		}

		return asteroidPositions;
	}

	private void deleteAsteroids(int row) {
		for (int i = 0; i < 14; i++) {
			if (this.getGameSpace()[row][i] == '*') {
				this.getGameSpace()[row][i] = ' ';
				this.setAsteroidsOnTheField(this.getAsteroidsOnTheField() - 1);
			}
		}
	}

	private void destroyAsteroidInColumn() {

		for (int i = 1; i < 10; i++) {

			if (this.gameSpace[10 - 1 - i][this.getShipLocationColumn()] == '*') {
				this.gameSpace[10 - 1 - i][this.getShipLocationColumn()] = ' ';
				this.setPoints(this.getPoints() + 5);
				break;
			}
		}
	}

	private int getDirection(char move) {
		if (move == 'a') {
			return -1;
		} else {
			return 1;
		}
	}

	private void moveShip(int direction) {

		if ((this.getShipLocationColumn() + direction) <= 13 && (this.getShipLocationColumn() + direction) >= 0) {
			this.gameSpace[this.getShipLocationRow()][this.getShipLocationColumn()] = ' ';
			this.setShipLocation(getShipLocationColumn() + direction);
			this.gameSpace[this.getShipLocationRow()][this.getShipLocationColumn()] = 'X';
		}

	}

	public void printWelcomeMessageAndRules() {
		System.out.println("********************************************************************");
		System.out.println("Welcome to asteroids " + this.getPlayerName());
		System.out.println("A quick breakdown of how this works.");
		System.out.println("You need to destroy or dodge the asteroids that are coming towards you.");
		System.out.println("You can dodge the asteroids by moving left (a) or right (e)");
		System.out.println("You can destroy asteroids by shooting a bullets at the asteroids (z)");
		System.out.println("Good luck and have fun");
		System.out.println("********************************************************************");
	}
}
