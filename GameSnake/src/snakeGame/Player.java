package snakeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject {

	Random r = new Random();
	private Handler handler;
	private HUD hud;

	public Player(float x, float y, ID id, Handler handler, HUD hud) {
		super(x, y, id);

		this.handler = handler;
	}

	public Rectangle getBounds() {
		return new Rectangle((int)x,(int) y, 32, 32);
	}

	public void tick() {
		x += velX;
		y += velY;

		x = Game.clamp(x, -16, Game.WIDTH);
		y = Game.clamp(y, -16, Game.HEIGHT);

		collision();
	}

	private void collision() {
		for (int i = 0; i < handler.object.size(); i++) {

			GameObject tempObject = handler.object.get(i);

			if (tempObject.getID() == ID.Coin) {
				if (getBounds().intersects(tempObject.getBounds())) {
					// Collision code
					hud.setLevel(hud.getLevel() + 1);
					hud.setScore(hud.getScore() + 100);
					handler.removeObject(tempObject);
					handler.addObject(new Coin(r.nextInt((int) (Game.WIDTH - 50)), r.nextInt((int) (Game.HEIGHT - 50)), ID.Coin,
							handler));
					//tempObject.velX *= -1;
					//tempObject.velY *= -1;
				}
			}
		}
	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect((int)x, (int)y, 32, 32);
	}

}