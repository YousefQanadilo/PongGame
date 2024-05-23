import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Ball extends Rectangle {

	Random random;
	int xVel;
	int yVel;
	int speed = 10;
	
	Ball(int x, int y, int width, int height){
		super(x,y,width,height);
		
		random = new Random();
		int randomXDir = random.nextInt(2);
		if(randomXDir == 0) 
			randomXDir--;
			setXDir(randomXDir*speed);
		
		int randomYDir = random.nextInt(2);
		if(randomYDir == 0) 
			randomYDir--;
			setYDir(randomYDir*speed);
		
	}
	
	public void setXDir(int randXDir) {
		xVel = randXDir;
	}
	public int getXVel() {
		return xVel;
	}
public void setYDir(int randYDir) {
	yVel = randYDir;
	}
public int getYVel() {
	return yVel;
}
public void move() {
	x+=xVel;
	y+=yVel;
}
public void draw(Graphics g) {
	g.setColor(Color.WHITE);
	g.fillOval(x,y,width,height);
}
	
}
