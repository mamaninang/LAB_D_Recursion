/*Mariah Maninang
 * Cody Flies
 * Amari Bolmer
 * 
 * This GUI displays a star and also smaller versions of it at its corners. Those smaller
 * stars also gets its own tiny stars at its corners. It continues on doing this process
 *  until the length of the star gets small enough.
 */
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class GUITemplate extends JPanel {
	public final int DIMENSION = 400;
	public final int INITIAL_LENGTH = 200;

	public GUITemplate() {
		super();
		setBackground(Color.white);
		setPreferredSize(new Dimension(DIMENSION, DIMENSION));
	}
	
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
        
		int startPoints = DIMENSION/4;
        	star(startPoints, startPoints, INITIAL_LENGTH, INITIAL_LENGTH, pen);
	}
    
    private void star(int x, int y, int width, int height, Graphics pen){
    	if(width >= 25){
    		drawStar(x, y, width, height, pen);
    		if(x <= 375 && y <= 375){
    			star(x+width+width, y, width, height, pen); //recursion that draws top left & right corner
    			star(x, y+height+height, width, height, pen);//recursion that draws bottom left& right corner
    		}
    		star(x/2, y/2, width/2, height/2, pen);//cuts the length of the star in half
    	}
    }
    
    /*
     * Draws the stars
     */
    
    private void drawStar(int x, int y, int width, int height, Graphics pen){
    	int[] xPoints = {x+(width/2),x, x+width, x, x+width, x}; //x points of the polygon
    	int[] yPoints = {y, y+height, y+(height/3), y+(height/3), y+height}; //y points of the polygon
    	int n = 5; //number of points
    	
    	Polygon p = new Polygon(xPoints, yPoints, n);//creates the star
    	pen.setColor(Color.DARK_GRAY);
    	pen.fillPolygon(p);//fills in the star
    }
	
	// DO YOU NEED A HELPER METHOD?
	
	
	public static void main(String[] args) {
		GUITemplate panel = new GUITemplate();
	
		JFrame frame = new JFrame("GUI Program");
		frame.getContentPane().add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}
