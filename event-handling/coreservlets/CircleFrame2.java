package coreservlets;

import javax.swing.*;

public class CircleFrame2 extends JFrame {
  public CircleFrame2() {
    super("Main JPanel implements MouseListener");
    setContentPane(new CirclePanel2());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new CircleFrame2();
  }
}
