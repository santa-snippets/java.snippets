package coreservlets;

import java.awt.*;

public class FiveCanvases {
  public static void main(String[] args) {
    Frame f = new CloseableFrame("Five Canvases");
    int[] widths = { 20, 30, 40, 50, 60 };
    Color[] colors = { Color.RED, Color.BLUE, Color.GREEN,
                       Color.YELLOW, Color.BLACK };
    String[] regions = { BorderLayout.NORTH, BorderLayout.SOUTH,
                         BorderLayout.EAST, BorderLayout.WEST,
                         BorderLayout.CENTER };
    for(int i=0; i<widths.length; i++) {
      Canvas c = new Canvas();
      c.setSize(widths[i], widths[i]);
      c.setBackground(colors[i]);
      f.add(c, regions[i]);
    }
    f.setSize(500, 400);
    f.setVisible(true);
  }
}