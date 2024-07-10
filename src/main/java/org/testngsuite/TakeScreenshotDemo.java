package org.testngsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.util.TestInit;

public class TakeScreenshotDemo extends TestInit {
  @Test(retryAnalyzer = RetryDemo.class)
  public void launchTest () {
    driver.get ("https://www.flipkart.com/");
    Assert.assertTrue (false);
  }
}
