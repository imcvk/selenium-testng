package org.DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
  @Test(dataProvider = "dataProvider")
  public void test (String username, String password) {
    System.out.println (username + "-" + password);
  }

  @DataProvider
  public Object dataProvider () {
    Object[][] dateset = new Object[4][2];
    dateset[0][0] = "User1";
    dateset[0][1] = "Pass1";

    dateset[1][0] = "User1";
    dateset[1][1] = "Pass1";

    dateset[2][0] = "User1";
    dateset[2][1] = "Pass1";

    dateset[3][0] = "User1";
    dateset[3][1] = "Pass1";
    return dateset;
  }
}
