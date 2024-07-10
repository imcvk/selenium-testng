package org.DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.util.Util;

public class DatProviderDemo2 {
  @Test(dataProvider = "dataProvider1", dataProviderClass = DatProviderClass.class)
  public void test (String username, String password) {
    WebDriver driver = Util.getDriverObject ("chrome");
    driver.get ("https://www.saucedemo.com/v1/");
    WebElement userName = driver.findElement (By.xpath ("//input[@id=\"user-name\"]"));
    WebElement passWord = driver.findElement (By.xpath ("//input[@id=\"password\"]"));
    WebElement loginButton = driver.findElement (By.xpath ("//input[@id=\"login-button\"]"));
    userName.sendKeys (username);
    passWord.sendKeys (password);
    loginButton.click ();
    driver.close ();
  }
}
