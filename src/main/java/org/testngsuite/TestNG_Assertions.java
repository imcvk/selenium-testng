package org.testngsuite;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.util.Util;

public class TestNG_Assertions {
  @Test
public void validateTitle(){
  WebDriver driver= Util.getDriverObject ("chrome");
  driver.get ("https://www.flipkart.com/");
  String title= driver.getTitle ();
  String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
  Assert.assertEquals (title,expectedTitle);
  driver.close ();
}

}
