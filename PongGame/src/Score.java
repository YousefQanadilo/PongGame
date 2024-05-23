import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class Score extends Rectangle {
 
	static int GAME_WIDTH;
	static int GAME_HEIGHT;
	int score1 = 0;
	int score2 = 0;
	String player1;
	String player2;
	 Scanner scnr = new Scanner(System.in);
	
	public void counter1() {
		
		score1 +=1;
		
	}
	
	public int getCount() {
		return score1;
	}
public void counter2() {
		
		score2 +=1;
		
	}
	Score(){
	
 }
	
	
 public void setNames() throws CharacterLengthException{
	 

	 boolean validName1Entered = false;
	 boolean validName2Entered = false;
	    while (!validName1Entered) {
	        try {
	            System.out.println("Player1, Please enter your name: ");
	            player1 = scnr.nextLine();
	            if (player1.length() < 3) {
	                throw new CharacterLengthException("//Make sure the name entered is 3 or more characters!//");
	            }

	            
	            validName1Entered = true; 
	        } catch (CharacterLengthException e) {
	            System.out.println(e.getMessage());
	            
	        }
	    }
	    while (!validName2Entered) {
	        try {
	            System.out.println("Player2, Please enter your name: ");
	            player2 = scnr.nextLine();
	            
	            if (player2.length() < 3) {
	                throw new CharacterLengthException("//Make sure the name entered is 3 or more characters!//");
	            }

	            
	            validName2Entered = true; 
	            
	        } catch (CharacterLengthException e) {
	            System.out.println(e.getMessage());
	            
	        }
	    }
	    scnr.close();
	 
 }
 public String getName1() {
	 
	 return player1;
	 
 }
public String getName2() {
	 
	 return player2;
	 
 }
 
	
 public void write() {
	
	 try {
		 player1 = getName1();
		 player2 = getName2();
		 BufferedWriter writer = new BufferedWriter(new FileWriter("Score.txt"));
		 
		 writer.write(player1 +"\t\t"+   player2 + "\n"+ (String.valueOf(score1)) +"\t\t "+ (String.valueOf(score2)));
		 
		 writer.close();
		 scnr.close();
	 }catch(Exception e) {
		 
		 e.printStackTrace();
	 }
 }
	
		
}
