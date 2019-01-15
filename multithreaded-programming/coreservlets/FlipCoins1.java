package coreservlets;
import java.util.concurrent.*;

/** First variation: separate class that implements Runnable.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class FlipCoins1 {
  public static void main(String[] args) {
    int poolSize = 10;
    ExecutorService tasks = 
      Executors.newFixedThreadPool(poolSize);
    for(int i=0; i<5; i++) {
      tasks.execute(new CoinFlipper());
    }
    tasks.shutdown();
  }
}