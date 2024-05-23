import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class GameFrame extends JFrame  {
	GamePanel panel;
	
	GameFrame() throws CharacterLengthException{
		this.panel = new GamePanel();
		
		this.add(panel);
		this.setTitle("Ping pong");
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
	}

}
