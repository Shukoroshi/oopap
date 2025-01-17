package test.automated.edu.monmouth.se.oopap.sourceanalyzer;

import edu.monmouth.se.oopap.sourceanalyzer.*;
import edu.monmouth.se.oopap.enumerator.ReportType;
import edu.monmouth.se.oopap.exception.UnhandledReportTypeException;
import junit.framework.TestCase;

public class SourceAnalyzerFactoryUnitTest extends TestCase
{

  public void testGetConcreteSourceAnalyzer_LineCountByPCO()
  {

    SourceAnalyzer analyzer;

    try
    {

      analyzer = SourceAnalyzerFactory
          .getConcreteSourceAnalyzer(ReportType.LineCountByPCO);

      assertTrue(analyzer instanceof LineCountSourceAnalyzer);

    } catch (UnhandledReportTypeException e)
    {

      e.printStackTrace();
      fail(e.getMessage());

    }

  }

  public void testGetConcreteSourceAnalyzer_PSPPhysicalLOCByPCO()
  {

    SourceAnalyzer analyzer;

    try
    {

      analyzer = SourceAnalyzerFactory
          .getConcreteSourceAnalyzer(ReportType.PSPPhysicalLOCByPCO);

      assertTrue(analyzer instanceof PSPPhysicalLOCSourceAnalyzer);

    } catch (UnhandledReportTypeException e)
    {

      e.printStackTrace();
      fail(e.getMessage());

    }

  }

  public void testGetConcreteSourceAnalyzer_PSPLogicalLOCByPCO()
  {

    SourceAnalyzer analyzer;

    try
    {

      analyzer = SourceAnalyzerFactory
          .getConcreteSourceAnalyzer(ReportType.PSPLogicalLOCByPCO);

      assertTrue(analyzer instanceof PSPLogicalLOCSourceAnalyzer);

    } catch (UnhandledReportTypeException e)
    {

      e.printStackTrace();
      fail(e.getMessage());

    }

  }

  public void testGetConcreteSourceAnalyzer_DepthOfInheritanceTree()
  {

    SourceAnalyzer analyzer;

    try
    {

      analyzer = SourceAnalyzerFactory
          .getConcreteSourceAnalyzer(ReportType.DepthOfInheritanceTree);

      assertTrue(analyzer instanceof DepthOfInheritanceTreeSourceAnalyzer);

    } catch (UnhandledReportTypeException e)
    {

      e.printStackTrace();
      fail(e.getMessage());

    }

  }

  public void testGetConcreteSourceAnalyzer_LackOfCohesionInMethods()
  {

    SourceAnalyzer analyzer;

    try
    {

      analyzer = SourceAnalyzerFactory
          .getConcreteSourceAnalyzer(ReportType.LackOfCohesionInMethods);

      assertTrue(analyzer instanceof LackOfCohesionInMethodsSourceAnalyzer);

    } catch (UnhandledReportTypeException e)
    {

      e.printStackTrace();
      fail(e.getMessage());

    }

  }

  public void testGetConcreteSourceAnalyzer_NumberOfChildren()
  {

    SourceAnalyzer analyzer;

    try
    {

      analyzer = SourceAnalyzerFactory
          .getConcreteSourceAnalyzer(ReportType.NumberOfChildren);

      assertTrue(analyzer instanceof PSPLogicalLOCSourceAnalyzer);

    } catch (UnhandledReportTypeException e)
    {

      e.printStackTrace();
      fail(e.getMessage());

    }

  }

  public void testGetConcreteSourceAnalyzer_UnhandledReportType()
  {

    SourceAnalyzer analyzer;

    try
    {

      analyzer = SourceAnalyzerFactory
          .getConcreteSourceAnalyzer(ReportType.GlobalVarCountByPC);

      // If the exception isn't thrown, fail the test
      fail("UnhandledReportTypeException not thrown");

    } catch (UnhandledReportTypeException e)
    {

    }

  }

}
