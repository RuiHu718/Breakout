/*
 * File: Breakout.java
 * -------------------
 * Name: Rui Hu
 * Section Leader: myself
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


/** Runs the Breakout program. */
    public void run() {
	/* You fill this in, along with any subsidiary methods */
    	setUpGame();
    }

/** Sets up the basic blocks of the game. */    
    private void setUpGame(){
    	setUpBricks();
    }


/** Initializes the bricks*/    
    private void setUpBricks(){    	
    	int i = 0;
    	Color brickColor = Color.RED;
    	
    	while(i < NBRICK_ROWS){
    		int j = 0;
    		int x = 0;
    		int y = BRICK_Y_OFFSET + i*(BRICK_HEIGHT+BRICK_SEP);
    		
    		if(i < 2) brickColor = Color.RED;
    		else if(i < 4) brickColor = Color.BLUE;
    		else if(i < 6) brickColor = Color.ORANGE;
    		else if(i < 8) brickColor = Color.GREEN;
    		else if(i < 10) brickColor = Color.CYAN;
    			
    		while(j < NBRICKS_PER_ROW){
    			GRect grect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
        		grect.setColor(brickColor);
        		grect.setFilled(true);
        		add(grect);
        		x = x + BRICK_WIDTH + BRICK_SEP;
        		j++;
    		}   
    		
    		i++;
    	}  	
    }


}
