package org.testngsuite;

import org.testng.annotations.Test;

public class GroupDemoTestcases {
  @Test(groups = {"regression,sanity"}, priority = 2)
  public void test1 () {
    System.out.println ("Login");
  }

  @Test(priority = 2, groups = "sanity")
  public void test2 () {
    System.out.println ("Logout");
  }

  @Test(priority = 2, groups = {"regression"})
  public void test3 () {
    System.out.println ("Login");
  }

  @Test(groups = {"regression,sanity"}, priority = 2)
  public void test4 () {
    System.out.println ("Logout");
  }

}
