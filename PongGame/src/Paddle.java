import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Paddle extends Rectangle{

	int id;
	int yVel;
	int speed = 8;
	Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
		super(x,y,PADDLE_WIDTH, PADDLE_HEIGHT);
		this.id = id;
		
	}
	
	public void keyPressed(KeyEvent e) {
		switch(id) {
		case 1: 
			if(e.getKeyCode() == KeyEvent.VK_W) {
			
				setYDir(-speed);
				move();
		} 
			if(e.getKeyCode() == KeyEvent.VK_S) {
			
				setYDir(speed);
				move();	
		}
			break;
		case 2: 
			if(e.getKeyCode() == KeyEvent.VK_UP) {
			
				setYDir(-speed);
				move();
		} 
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			
				setYDir(speed);
				move();	
		}
			break;
		
	}
	}
public void keyReleased(KeyEvent e) {
	switch(id) {
	case 1: if(e.getKeyCode() == KeyEvent.VK_W) {
		
			setYDir(0);
			move();
			
		
	} 
			if(e.getKeyCode() == KeyEvent.VK_S) {
		
			setYDir(0);
			move();
			
	}
			break;
	case 2: if(e.getKeyCode() == KeyEvent.VK_UP) {
				
			setYDir(0);
			move();
			
		} 
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			
			setYDir(0);
			move();
				
		}
			break;
	}
	}

public void setYDir(int yDir) {
	yVel = yDir;
}
public void move() {
	y+=yVel;
}

public void draw(Graphics g) {
	if(id ==1) {
		g.setColor(Color.WHITE);
		g.fillRect(x,y,width,height);
	}
	if(id==2){
		g.setColor(Color.RED);
		g.fillRect(x,y,width,height);
	}
	
}
}


