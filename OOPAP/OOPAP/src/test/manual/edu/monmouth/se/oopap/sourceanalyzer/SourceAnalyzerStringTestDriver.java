package test.manual.edu.monmouth.se.oopap.sourceanalyzer;

public class SourceAnalyzerStringTestDriver
{

  public static void main(String[] args)
  {

    String sourceFilePath = "/Users/Andy/Desktop/OOPAPSVN/OOPAP/src/edu/monmouth/se/oopap/sourceanalyzer/"
        + "LineCountSourceAnalyzer.java";

    LineCountSourceAnalzyerStringTest.runStringTest(sourceFilePath);
    DepthOfInheritanceTreeSourceAnalyzerStringTest
        .runStringTest(sourceFilePath);
    LackOfCohesionInMethodsSourceAnalyzerStringTest
        .runStringTest(sourceFilePath);

  }
  
}
