package org.testngsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.util.Util;

public class TestNG_SoftAssert_HardAssert {
  WebDriver driver = null;

  TestNG_SoftAssert_HardAssert () {
    driver = Util.getDriverObject ("chrome");
  }

  @Test
  public void softAssertionsDemo () {

    SoftAssert softAssert = new SoftAssert ();
    driver.get ("https://www.flipkart.com/");
    String title = driver.getTitle ();
    String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
    softAssert.assertEquals (title, expectedTitle);
    WebElement webElement = driver.findElement (By.xpath ("//a[@title=\"Flipkart\"]"));
    softAssert.assertTrue (webElement.getText ().equals (""), "Text validation failed");
    softAssert.assertAll ();

  }

  @Test
  public void softAssertionsDemo_failed () {
    SoftAssert softAssert = new SoftAssert ();
    driver.get ("https://www.flipkart.com/");
    String title = driver.getTitle ();
    String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
    softAssert.assertEquals (title, expectedTitle);
    WebElement webElement = driver.findElement (By.xpath ("//a[@title=\"Flipkart\"]"));
    softAssert.assertTrue (webElement.getText ().equals ("dfgdfg"), "Text validation failed");
    softAssert.assertAll ();
  }

  @AfterTest
  public void closeDriver () {
    driver.close ();
  }
}
