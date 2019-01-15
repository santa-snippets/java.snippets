package coreservlets;
import java.awt.*;
import java.util.concurrent.*;
import javax.swing.*;

public class FlipCoins3 extends JFrame {
  public FlipCoins3() {
    super("Flipping Coins");
    getContentPane().setLayout(new GridLayout(5, 1));
    int poolSize = 10;
    ExecutorService tasks = 
      Executors.newFixedThreadPool(poolSize);
    for(int i=0; i<5; i++) {
      JLabel label = new JLabel();
      label.setFont(new Font("SansSerif", Font.PLAIN, 60));
      tasks.execute(new LabelingCoinFlipper(label));
      add(label);
    }
    setSize(400, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new FlipCoins3();
  }
}