package coreservlets;
import java.util.concurrent.*;

/** Second variation: main class implements Runnable.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class FlipCoins2 implements Runnable {
  // Note that you cannot do tasks.execute(this) directly from main.
  // When you are in main, no instance of the surrounding class has
  // yet been created, so there *IS* no "this". So, here main calls
  // the constructor of the class, and that constructor does tasks.execute(this).
  
  // Similarly, you cannot make
  // an instance of an inner class directly from main. Again, this is because
  // in main, the outer class has not yet been built. 
  public static void main(String[] args) {
    new FlipCoins2();
  }

  public FlipCoins2() {
    int poolSize = 10;
    ExecutorService tasks = 
      Executors.newFixedThreadPool(poolSize);
    for(int i=0; i<5; i++) {
      tasks.execute(this);
    }
    tasks.shutdown();
  }

  @Override
  public void run() {
    int numHeads = 0;
    for(int i=0; i<1000; i++) {
      double coin = Math.random();
      if (coin < 0.5) {
        numHeads = numHeads + 1;
      } else {
        numHeads = 0;
      }
      if (numHeads >= 3) {
        System.out.printf("%s got %d heads in a row.%n",
                          Thread.currentThread().getName(),
                          numHeads);
      }
    }
  }
}