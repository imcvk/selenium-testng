package org.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.util.Util;

import java.io.IOException;

public class TestNGListenersReport implements ITestListener {
  @Override
  public void onTestStart (ITestResult result) {
    ITestListener.super.onTestStart (result);
    Reporter.log ("Test method is: " + result.getTestName ());
    System.out.println ("test case started");
  }

  @Override
  public void onTestSuccess (ITestResult result) {
    ITestListener.super.onTestSuccess (result);
    Reporter.log ("Test method is: " + result.getTestName () + ": Passed");
    System.out.println ("Test case passed");
  }

  @Override
  public void onTestFailure (ITestResult result) {
    ITestListener.super.onTestFailure (result);
    System.setProperty ("org.uncommons.reportng.escape-output", "false");
    Reporter.log ("Test method is: " + result.getTestName () + ": Failed");
    System.out.println ("Test case failed");
    String path;
    try {
      path = Util.takeScreenshot ();
    } catch (IOException e) {
      throw new RuntimeException (e);
    }
    String s = "<a href='" + path + "'>" + "Test Results" + "</a>";
    s.replaceAll ("\\\\", "//");
    Reporter.log (s);
    System.out.println ("Screenshot taken");
  }

  @Override
  public void onTestSkipped (ITestResult result) {
    ITestListener.super.onTestSkipped (result);
    System.out.println ("Test case skipped");
  }

  @Override
  public void onTestFailedButWithinSuccessPercentage (ITestResult result) {
    ITestListener.super.onTestFailedButWithinSuccessPercentage (result);
  }

  @Override
  public void onTestFailedWithTimeout (ITestResult result) {
    ITestListener.super.onTestFailedWithTimeout (result);
  }

  @Override
  public void onStart (ITestContext context) {
    ITestListener.super.onStart (context);
  }

  @Override
  public void onFinish (ITestContext context) {
    ITestListener.super.onFinish (context);
  }

  @Override
  public boolean isEnabled () {
    return ITestListener.super.isEnabled ();
  }
}
