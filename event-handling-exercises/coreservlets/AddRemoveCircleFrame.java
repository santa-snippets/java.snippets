package coreservlets;

import javax.swing.*;

public class AddRemoveCircleFrame extends JFrame {
  public AddRemoveCircleFrame() {
    super("Adding and Removing Circles");
    setContentPane(new AddRemoveCirclePanel());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new AddRemoveCircleFrame();
  }
}
