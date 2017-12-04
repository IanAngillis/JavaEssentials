package tetris;

import java.util.Timer;
import java.util.TimerTask;

public class Game {

	public static void main(String[] args) {
		Timer t = new Timer( );
		t.scheduleAtFixedRate(new TimerTask() {
		    public void run() {
		      System.out.println("Hey");

		    }
		}, 1000,1500);
	}

}
