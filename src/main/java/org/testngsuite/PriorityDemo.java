package org.testngsuite;

import org.testng.annotations.Test;

public class PriorityDemo {
  @Test(priority = 2)
  public void login () {
    System.out.println ("Login");
  }

  @Test(priority = 2)
  public void logOut () {
    System.out.println ("Logout");
  }

}
