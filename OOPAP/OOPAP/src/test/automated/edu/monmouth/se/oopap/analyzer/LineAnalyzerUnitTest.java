package test.automated.edu.monmouth.se.oopap.analyzer;

import junit.framework.TestCase;
import edu.monmouth.se.oopap.enumerator.LineType;
import edu.monmouth.se.oopap.analyzer.LineAnalyzer;

/**
 * @author Andy
 * 
 */
public class LineAnalyzerUnitTest extends TestCase
{

  public void testGetLineType_BlankLine()
  {

    String testLine1 = "";
    String testLine2 = "    ";
    String testLine3 = "\t";

    assertEquals(LineType.Blank, LineAnalyzer.getLineType(testLine1));
    assertEquals(LineType.Blank, LineAnalyzer.getLineType(testLine2));
    assertEquals(LineType.Blank, LineAnalyzer.getLineType(testLine3));

  }

  public void testGetLineType_CommentLine()
  {

    String testLine1 = "//This is a test comment";
    String testLine2 = "System.out.println(Awesome!); //Test Comment";

    assertEquals(LineType.Comment, LineAnalyzer.getLineType(testLine1));
    assertEquals(LineType.Comment, LineAnalyzer.getLineType(testLine2));

  }

  public void testGetLineType_OpenCommentLine()
  {

    String testLine1 = "/*This is a test comment";
    String testLine2 = "System.out.println(Awesome!); /*Test Comment";
    String testLine3 = "/** This is a Javadoc Comment";

    assertEquals(LineType.OpenComment, LineAnalyzer.getLineType(testLine1));
    assertEquals(LineType.OpenComment, LineAnalyzer.getLineType(testLine2));
    assertEquals(LineType.OpenComment, LineAnalyzer.getLineType(testLine3));

  }

  public void testGetLineType_CloseCommentLine()
  {

    String testLine1 = "This is a test comment*/";

    assertEquals(LineType.CloseComment, LineAnalyzer.getLineType(testLine1));

  }

  public void testGetLineType_OpenBraceLine()
  {

    String testLine1 = "  {";

    assertEquals(LineType.OpeningBrace, LineAnalyzer.getLineType(testLine1));

  }

  public void testGetLineType_CloseBraceLine()
  {

    String testLine1 = "  }";

    assertEquals(LineType.ClosingBrace, LineAnalyzer.getLineType(testLine1));

  }

  public void testGetLineType_ImportStatementLine()
  {

    String testLine1 = "import a.random.java.package;";
    String testLine2 = "import a.random.java.package.*;";

    assertEquals(LineType.ImportStatement, LineAnalyzer.getLineType(testLine1));
    assertEquals(LineType.ImportStatement, LineAnalyzer.getLineType(testLine2));

  }

  public void testGetLineType_PackageDeclarationLine()
  {

    String testLine1 = "package a.random.java.package;";

    assertEquals(LineType.PackageDeclaration, LineAnalyzer
        .getLineType(testLine1));

  }

  public void testGetLineType_ClassDeclarationLine()
  {

    String testLine1 = "public class AJavaClass";
    String testLine2 = "private class AJavaClass";
    String testLine3 = "public abstract class AJavaClass extends AnotherClass";
    String testLine4 = "public enum AJavaEnum";

    assertEquals(LineType.ClassDeclaration, LineAnalyzer.getLineType(testLine1));
    assertEquals(LineType.ClassDeclaration, LineAnalyzer.getLineType(testLine2));
    assertEquals(LineType.ClassDeclaration, LineAnalyzer.getLineType(testLine3));
    assertEquals(LineType.ClassDeclaration, LineAnalyzer.getLineType(testLine4));

  }

  public void testGetLineType_MethodDeclarationLine()
  {

    String testLine1 = "public void testGetLineType_MethodDeclarationLine()";
    String testLine2 = "public static void testGetLineType_MethodDeclarationLine()";
    String testLine3 = "private Object testGetLineType_MethodDeclarationLine(String anArg)";
    String testLine4 = "protected Object testGetLineType_MethodDeclarationLine("
        + "String anArg, String anotherArg)";

    assertEquals(LineType.MethodDeclaration, LineAnalyzer
        .getLineType(testLine1));
    assertEquals(LineType.MethodDeclaration, LineAnalyzer
        .getLineType(testLine2));
    assertEquals(LineType.MethodDeclaration, LineAnalyzer
        .getLineType(testLine3));
    assertEquals(LineType.MethodDeclaration, LineAnalyzer
        .getLineType(testLine4));

  }

  public void testGetLineType_SingleLineLogicalLine()
  {

    String testLine1 = "FileUtil.doStuff();";
    String testLine2 = "case aCase:";
    String testLine3 = "i++;";
    String testLine4 = "Object o = new Object();";

    assertEquals(LineType.SingleLineLogical, LineAnalyzer
        .getLineType(testLine1));
    assertEquals(LineType.SingleLineLogical, LineAnalyzer
        .getLineType(testLine2));
    assertEquals(LineType.SingleLineLogical, LineAnalyzer
        .getLineType(testLine3));
    assertEquals(LineType.SingleLineLogical, LineAnalyzer
        .getLineType(testLine4));

  }

  public void testGetLineType_MultiLineLogicalLine()
  {

    String testLine1 = "System.out.println(\"A really long string\" + ";
    String testLine2 = "x = x + y + z +";
    String testLine3 = "if((i > 0) ||";
    String testLine4 = "Object o = ";

    assertEquals(LineType.MultiLineLogical, LineAnalyzer.getLineType(testLine1));
    assertEquals(LineType.MultiLineLogical, LineAnalyzer.getLineType(testLine2));
    assertEquals(LineType.MultiLineLogical, LineAnalyzer.getLineType(testLine3));
    assertEquals(LineType.MultiLineLogical, LineAnalyzer.getLineType(testLine4));

  }

}
