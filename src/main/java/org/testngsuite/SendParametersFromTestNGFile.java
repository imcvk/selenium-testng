package org.testngsuite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SendParametersFromTestNGFile {

  @Parameters({"browser"})
  @Test
  public void send_Parameters_from_testng_file (String browser) {
    System.out.println ("received parameter from testng " + browser);

  }
}
