package org.testngsuite;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.util.TestInit;
import org.util.Util;

public class DependencyTest extends TestInit {
  @Test
  public void userRegistration () {

    Assert.assertTrue (false);
    System.out.println ("User Registered...");
  }

  @Test(dependsOnMethods = {"userRegistration"},alwaysRun = true)
  public void userSearch () {
    System.out.println ("User Search...");

  }
}
