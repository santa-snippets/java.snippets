package coreservlets;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class MinTester {
  @Test
  public void testMin() {
    double d1 = Math.random();
    double d2 = Math.random();
    assertThat(Math.min(d1, d2), 
               is(equalTo(Math.min(d2, d1))));
  }
}
