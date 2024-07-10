package org.testngReports;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.util.Util;

public class TestNGReportsDemo {
	@Test
	public void test1() {
		System.out.println("Test1");
	}

	@Test
	public void test2() {
		Assert.assertTrue (true);
		System.out.println("Test2");
	}

	@Test
	public void test3() {
		WebDriver driver= Util.getDriverObject ("chrome");
		driver.get ("https://www.flipkart.com/");
		Assert.assertTrue (false);
		System.out.println("Test3");
	}

}
