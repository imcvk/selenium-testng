package org.testngsuite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Listener_Demo {
  @Test
  public void test1 () {
    System.out.println ("test case one");
  }

  @Test
  public void test2 () {
    Assert.assertTrue (false);
  }
}
