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
}
