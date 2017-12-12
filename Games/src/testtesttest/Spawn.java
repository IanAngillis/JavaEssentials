package testtesttest;

import java.awt.Graphics;
import java.util.Random;

public class Spawn {

	private int scoreKeep = 0;

	private Handler handler;
	private HUD hud;
	private Random r = new Random();

	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}

	public void tick() {
		// Control the entire game
		scoreKeep++;

		if (scoreKeep >= 250) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);

			if (hud.getLevel() == 2) {
				handler.addObject(new BasicEnemy(r.nextInt((int) (Game.WIDTH - 50)),
						r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
			} else if (hud.getLevel() == 3) {
				handler.addObject(new BasicEnemy(r.nextInt((int) (Game.WIDTH - 50)),
						r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
			} else if (hud.getLevel() == 4) {
				handler.addObject(new FastEnemy(r.nextInt((int) (Game.WIDTH - 50)), r.nextInt((int) (Game.HEIGHT - 50)),
						ID.FastEnemy, handler));
			} else if (hud.getLevel() == 5) {
				handler.addObject(new SmartEnemy((int) r.nextInt((int) (Game.WIDTH - 50)),
						r.nextInt((int) (Game.HEIGHT - 50)), ID.SmartEnemy, handler));
			} else if (hud.getLevel() == 6) {
				handler.addObject(new FastEnemy((int) r.nextInt((int) (Game.WIDTH - 50)),
						r.nextInt((int) (Game.HEIGHT - 50)), ID.FastEnemy, handler));
			} else if (hud.getLevel() == 7) {
				handler.addObject(new BasicEnemy((int) r.nextInt((int) (Game.WIDTH - 50)),
						r.nextInt((int) (Game.HEIGHT - 50)), ID.BasicEnemy, handler));
			} else if (hud.getLevel() == 7) {
				handler.addObject(new SmartEnemy((int) r.nextInt((int) (Game.WIDTH - 50)),
						r.nextInt((int) (Game.HEIGHT - 50)), ID.SmartEnemy, handler));
			}
		}

	}

	public void render(Graphics g) {

	}
}
