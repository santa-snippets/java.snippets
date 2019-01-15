package coreservlets;

import java.awt.Color;
import java.awt.Graphics;
import java.util.*;
import javax.swing.*;

public class CirclePanel extends JPanel {
  protected int radius = 25;
  protected List<Circle> circles = new ArrayList<>();
  
  public CirclePanel() {
    setBackground(Color.YELLOW);
    setForeground(Color.RED);
  }

  public int getRadius() {
    return(radius);
  }

  public List<Circle> getCircles() {
    return(circles);
  }
 
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for(Circle c: circles) {
      c.draw(g);
    }
  }
}
