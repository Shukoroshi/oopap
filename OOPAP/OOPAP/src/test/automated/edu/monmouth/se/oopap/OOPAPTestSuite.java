package test.automated.edu.monmouth.se.oopap;

import test.automated.edu.monmouth.se.oopap.analyzer.*;
import test.automated.edu.monmouth.se.oopap.sourceanalyzer.*;
import test.automated.edu.monmouth.se.oopap.io.*;

import junit.framework.Test;
import junit.framework.TestSuite;

public class OOPAPTestSuite
{

  public static Test suite()
  {
    TestSuite suite = new TestSuite("Test for edu.monmouth.se.oopap");
    // $JUnit-BEGIN$

    suite.addTestSuite(LineAnalyzerUnitTest.class);
    suite.addTestSuite(SourceAnalyzerFactoryUnitTest.class);
    suite.addTestSuite(FileUtilUnitTest.class);

    // $JUnit-END$
    return suite;
  }

}
