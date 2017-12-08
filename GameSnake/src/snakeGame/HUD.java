package snakeGame;

import java.awt.Graphics;

public class HUD {
	
	private int score;
	private int level = 1;

	public void tick() {

		
	}

	public void render(Graphics g) {
		
		g.drawString("Score: " + this.score, 15, 20);
		g.drawString("Level: " + this.level, 15, 30);
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
}
