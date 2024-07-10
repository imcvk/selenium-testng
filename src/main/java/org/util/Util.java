package org.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Util extends TestInit{
  public static WebDriver driver = null;

  public static WebDriver getDriverObject (String browser) {
    switch(browser) {
      case "chrome":
        driver = new ChromeDriver ();
        break;
      default:
        driver = null;
    }
    driver.manage ().window ().maximize ();
    return driver;
  }

  @AfterSuite
  public void closeDriver () {
    driver.quit ();
  }

  public static String takeScreenshot () throws IOException {
    TakesScreenshot screenshot = (TakesScreenshot) driver;
    String date = new Date ().toString ().replace (" ", "_").replace (":", "-");
    File f=screenshot.getScreenshotAs (OutputType.FILE);
    File f2=null;
    try {
      f2=new File (System.getProperty ("user.dir")+"//screenshots//"+date+".png");
      FileUtils.copyFile (f,f2);
    } catch (IOException e) {
      throw new RuntimeException (e);
    }
    return f2.getAbsolutePath ();
  }
}