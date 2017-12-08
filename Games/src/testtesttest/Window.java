package testtesttest;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas {
	
	private static final long serialVersionUID = -240840600533728354L;
	
	public Window(int width, int height, String title, Game game) {
		JFrame frame = new JFrame(title); // the frame of our window, inbuilt librabry in Java
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //xbutton in the top corner, exits the thread of the game operations when you close the frame
		frame.setResizable(false); //Resize windows to fals
		frame.setLocationRelativeTo(null);//Not needed but window starts in top left and not in the middle
		frame.add(game);
		frame.setVisible(true);
		game.start();
		
	}
}
