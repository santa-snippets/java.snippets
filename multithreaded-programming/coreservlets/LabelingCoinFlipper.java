package coreservlets;
import javax.swing.*;

public class LabelingCoinFlipper implements Runnable {
  private JLabel label;

  public LabelingCoinFlipper(JLabel label) {
    label.setText(String.format("Heads: %3d", 0));
    this.label = label;
  }

  @Override
  public void run() {
    pause(200);
    int numHeads = 0;
    for(int i=0; i<1000; i++) {
      double coin = Math.random();
      if (coin < 0.5) {
        numHeads = numHeads + 1;
      }
      label.setText(String.format("Heads: %3d", numHeads));
      pause(5);
    }
  }

  private static void pause(int millis) {
    try {
      Thread.sleep(millis);
    } catch(InterruptedException ie) {}
  }
}