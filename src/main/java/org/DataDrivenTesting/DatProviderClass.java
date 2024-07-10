package org.DataDrivenTesting;

import org.testng.annotations.DataProvider;

public class DatProviderClass {
  @DataProvider
  public Object[][] dataProvider1 () {
    return new Object[][]{{"standard_user", "secret_sauce"}, {"locked_out_user", "secret_sauce"}, {"problem_user", "secret_sauce"}, {"performance_glitch_user", "secret_sauce"}};
  }
}
