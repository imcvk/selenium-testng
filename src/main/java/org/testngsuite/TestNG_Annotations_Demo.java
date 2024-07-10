package org.testngsuite;

import org.testng.annotations.*;

public class TestNG_Annotations_Demo {
  @BeforeSuite
  public void BeforeSuite () {
    System.out.println ("Before suite method");
  }

  @BeforeClass
  public void BeforeClass () {
    System.out.println ("BeforeClass method");
  }

  @AfterClass
  public void AfterClass () {
    System.out.println ("AfterClass method");
  }

  @Test
  public void test () {
    System.out.println ("Test method");
  }

  @BeforeGroups(groups = "regression")
  public void BeforeGroups () {
    System.out.println ("BeforeGroups method");
  }
  @Test(groups = "regression")
  public void test1 () {
    System.out.println ("Test method");
  }
  @AfterGroups(groups = {"regression"})
  public void AfterGroups () {
    System.out.println ("AfterGroups method");
  }



  @AfterSuite
  public void AfterSuite () {
    System.out.println ("After suite method");
  }
}

