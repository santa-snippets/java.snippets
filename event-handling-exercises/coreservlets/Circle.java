package coreservlets;

import java.awt.*;

public class Circle {
  private final int x, y, radius;

  public Circle(int x, int y, int radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }
  
  public int getX() { 
    return(x); 
  }

  public int getY() { 
    return(y); 
  }

  public int getRadius() { 
    return(radius); 
  }

  /** Given a Graphics, draw the Circle
   *  centered around its current position.
   */

  public void draw(Graphics g) {
    g.fillOval(x - radius, y - radius,
               radius * 2, radius * 2);
  }
  
  public boolean containsPoint(int testX, int testY) {
    return(distance(testX, testY, x, y) <= radius);
  }
  
  private double distance(int x1, int y1, int x2, int y2) {
    return(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
  }
}
