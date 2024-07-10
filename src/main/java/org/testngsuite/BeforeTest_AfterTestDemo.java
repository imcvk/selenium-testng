package org.testngsuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTest_AfterTestDemo {
  @Test
  public void login () {
    System.out.println ("Login");
  }

  @Test
  public void logOut () {
    System.out.println ("Logout");
  }
  @BeforeTest
  public void beforeTestDemo () {
    System.out.println ("testing annotation @BeforeTest");
  }

  @AfterTest
  public void AfterTestDemo () {
    System.out.println ("testing annotation @AfterTest");
  }
}
