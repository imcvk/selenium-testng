package org.testngReports;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgDenoReports {
	@Test
	public void Report_test1() {
		Reporter.log("Logging from test method Report_test1");
		System.out.println("Test 1");
	}
	@Test
	public void Report_test2() {
		Reporter.log("Logging from test method Report_test2");
		System.out.println("Test 1");
	}
	@Test
	public void Report_test3() {
		Reporter.log("Logging from test method Report_test3");
		System.out.println("Test 1");
	}

}
