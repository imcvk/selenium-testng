package org.util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestInit {
  public static WebDriver driver = null;

  @BeforeSuite
  public void launchDriver () {
    driver = Util.getDriverObject ("chrome");

  }

  @AfterSuite
  public void closeDriver () {
    Util u = new Util ();
    u.closeDriver ();
  }
}
