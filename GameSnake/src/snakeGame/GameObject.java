package snakeGame;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {
	protected float x;
	protected float y;
	protected ID id;
	protected float velX;
	protected float velY;
	
	public GameObject(float x2, float y2, ID id) {
		this.x = x2;
		this.y = y2;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	public abstract Rectangle getBounds();
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
	
	public void setID(ID id) {
		this.id = id;
	}
	
	public ID getID() {
		return this.id;
	}
	
	public void setVelX(int velX) {
		this.velX = velX;
	}
	
	public void setVelY(int velY) {
		this.velY = velY;
	}
	
	public float getVelX() {
		return this.velX;
	}
	
	public float getVelY() {
		return this.velY;
	}
}

