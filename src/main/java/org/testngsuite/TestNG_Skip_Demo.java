package org.testngsuite;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_Skip_Demo {
  @Test(enabled = false)
  public void skipTestDemo1 () {
    System.out.println ("Skipping test to implement testng skip test");
  }

  @Test
  public void skipTestDemo2 () {
    throw new SkipException ("Skipping this test case forcefully");
  }

  boolean f = true;

  @Test
  public void skipTestDemo3 () {
    if (f) {
      throw new SkipException ("Skipping this test case based on condition");
    } else {
      System.out.println ("execute test case");
    }
  }
}
