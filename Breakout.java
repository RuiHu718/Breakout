/*
 * File: Breakout.java
 * -------------------
 * Name: Rui Hu
 * Section Leader: myself
 * This is the first project of reasonable size, good place to try
 * Why isn't the change being picked up by git?
 * This is going to be the first commit
 * This file will eventually implement the game of Breakout.
 * I wanna test out the local git capacity
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Breakout extends GraphicsProgram {

/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

/** Separation between bricks */
	private static final int BRICK_SEP = 4;

/** Width of a brick */
	private static final int BRICK_WIDTH =
	  (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
	private static final int NTURNS = 3;

/* Method: run() */
/** Runs the Breakout program. */
    public void run() {
	/* You fill this in, along with any subsidiary methods */
    	setUpGame();
    }

    private void setUpGame(){
    	setUpBricks();
    }

    
    private void setUpBricks(){
    	//setUpOneRow(70, Color.RED);
    	int i = 0;
    	int y = 70;
    	Color color = Color.RED;
    	
    	while(i < NBRICK_ROWS){
    		int j = 0;
    		int x = 0;
    		y = 70 + i*(BRICK_HEIGHT+BRICK_SEP);
    		if(i < 2) color = Color.RED;
    		else if(i < 4) color = Color.BLUE;
    		else if(i < 6) color = Color.ORANGE;
    		else if(i < 8) color = Color.GREEN;
    		else if(i < 10) color = Color.CYAN;
    			
    		while(j < NBRICKS_PER_ROW){
    			GRect grect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
        		grect.setColor(color);
        		grect.setFilled(true);
        		add(grect);
        		//add(new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT));
        		x = x + BRICK_WIDTH + BRICK_SEP;
        		j++;
    		}   
    		i++;
    	}  	
    }

 /*   private void setUpOneRow(int y, Color color ){
    	System.out.println(y);
    	int i = 0;
    	int x = 0;
    	while(i < NBRICKS_PER_ROW){
    		GRect grect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
    		grect.setColor(color);
    		grect.setFilled(true);
    		add(grect);
    		//add(new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT));
    		x = x + BRICK_WIDTH + BRICK_SEP;
    	}
    }
*/
}
