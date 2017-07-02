// Earl Bergquist, Garfield High School
// 10/11/2010
// Introduction to DrawingPanel, Graphics, Color

import java.awt.*;  // to use Graphics, Color

public class GraphicsPrimer {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(300, 200);
		
		// Set its Background
		panel.setBackground(Color.YELLOW);
		
		// Create the Graphics Object
		Graphics g = panel.getGraphics();
		
		// A Line
		g.drawLine(25, 75, 100, 25);
		// Make it a Triangle
		//g.drawLine(100, 25, 175, 75);
		//g.drawLine(175,75,25,75);
		
		// Now draw a Rectangle (<x>, <y>, <width>, <height>)
		//g.drawRect(15,30,20,30);
		
		// Now draw an Oval (<x>, <y>, <width>, <height>)
		//g.drawOval(15,30,20,30);	
		
		// Fill them in
		// Fill a Rectangle (<x>, <y>, <width>, <height>)
		//g.fillRect(200,30,20,30);
		// Fill an Oval (<x>, <y>, <width>, <height>)
		//g.fillOval(250,30,20,30);	
		
		// Set the Color for our Graphics drawing (like the pen)
		//g.setColor(Color.GREEN);
		
		// What shall we color??			
		//g.fillRect(200,100,20,30);
		//g.fillOval(250,100,20,30);	
		
		//Change color and add thier outline?	
		//g.setColor(Color.RED);
		//g.drawRect(200,100,20,30);
		//g.drawOval(250,100,20,30);	
		
		// Using Methods, we can pass Graphics object g along...		
		//drawFace(g);
		//drawSingleCar(g);
		//r2D2(g);
		
		// Loops
		// Draw ten stacked rectangles starting at (20, 20), height 10, 
		//   width starting at 100 and decreasing by 10 each time
		/* for (int i = 0; i < 10; i++) {
    		g.drawRect(20, 20 + 10 * i, 100 - 10 * i, 10);		
		*/
		
	}
	
	
	// Draws a face with a rectangular mouth
	// Notice that drawn shapes "stack" (the last drawn is what shows up)
	public static void drawFace(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval(50, 50, 100, 100);
		
		g.setColor(Color.BLACK);
		g.fillOval(75, 80, 5, 20);
		g.fillOval(125, 80, 5, 20);
		
		g.setColor(Color.RED);
		g.drawRect(80, 120, 40, 10);	
	}
	
	public static void r2D2(Graphics g) {
		//Dome
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(50,100,50,50);
		g.setColor(Color.BLUE);		
		g.fillRect(67,107,20,18);
		g.setColor(Color.RED);		
		g.fillOval(70,110,12,12);
		//Body & Legs
		g.setColor(Color.WHITE);
		g.fillRect(50,125,50,60);
		g.fillRect(40,125,10,75);
		g.fillRect(100,125,10,75);	
		g.fillRect(30,170,10,30);			
		g.fillRect(110,170,10,30);	
		// Detail
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(65,155,10,10);			
		g.fillRect(65,140,10,10);
		g.setColor(Color.BLACK);
		g.drawRect(50,125,50,60);
		g.drawRect(55,130,5,40);
		g.drawRect(90,130,5,40);
		g.drawRect(55,175,40,5);
		g.drawRect(30,195,20,10);
		g.drawRect(100,195,20,10);	
		g.drawRect(40,125,10,70);			
		g.drawRect(100,125,10,70);	
		g.drawOval(66,156,8,8);			
		g.drawOval(66,141,8,8);	
		g.drawLine(30,195,40,170);
		g.drawLine(120,195,110,170);		
		g.drawOval(30,170,8,8);			
		g.drawOval(112,170,8,8);						
	}		
	
	// Draw ten stacked rectangles starting at (20, 20), height 10, 
	//   width starting at 100 and decreasing by 10 each time
	public static void stairs0(Graphics g) {
		for (int i = 0; i < 10; i++) {
    		g.drawRect(20, 20 + 10 * i, 100 - 10 * i, 10);
		}
	}
	
	// Both the width of the stairs and their starting position change
	// as we go down
	public static void stairs1(Graphics g) {
		for (int i = 0; i < 10; i++) {
    		g.drawRect(20 + 10 * i, 20 + 10 * i, 100 - 10 * i, 10);
		}
	}
	
	// The width of the stairs increases, the starting position decreases 
	public static void stairs2(Graphics g) {
		for (int i = 0; i < 10; i++) {
    		g.drawRect(110 - (10 * i), 20 + 10 * i, 10 + 10 * i, 10);
		}
	}
	
	// Standard Single Car
	public static void drawSingleCar(Graphics g) {
	
		g.setColor(Color.BLACK);
		g.fillRect(10, 30, 100, 50);
	
		
		g.setColor(Color.RED);
	
		g.fillOval(20, 70, 20, 20);
	
		g.fillOval(80, 70, 20, 20);
			
		g.setColor(Color.CYAN);
	
		g.fillRect(80, 40, 30, 20);
	}
	
	// parameterized car method
	public static void drawCar(Graphics g, int x, int y, int size) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, size, size / 2);
        
        g.setColor(Color.RED);
        g.fillOval(x + size / 10, y + size * 2 / 5, size / 5, size / 5);
        g.fillOval(x + size * 7 / 10, y + size * 2 / 5, size / 5, size / 5);
        
        g.setColor(Color.CYAN);
        g.fillRect(x + size * 7 / 10, y + size / 10, size * 3 / 10, size / 5);
    }
	 
	 public static void drawCars(Graphics g, int x, int y, int size, int count) {
	 	for(int i = 0; i < count; i++) {
			drawCar(g, x + i * 50, y, size);
		}
	 }
}		




