package edu.monmouth.se.oopap.io;

import java.util.List;

/**
 * Class responsible for interacting with the console.
 * 
 * @author Andrew Tasso
 * @version %I% %G%
 */
public class ConsoleUtil
{

  /**
   * Method responsible for displaying a report in the console
   * 
   * @param theReport
   *          The report to be displayed
   */
  public static void displayReport(List<String> theReport)
  {

    // add an initial carriage return
    System.out.println();

    // iterate over the entire collection of lines of the report displaying
    // each one.
    for (String s : theReport)
    {

      System.out.println(s);

    }

    // add an extra carriage return to separate the reports
    System.out.println();

  }

}
