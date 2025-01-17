package test.automated.edu.monmouth.se.oopap.io;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

import edu.monmouth.se.oopap.io.FileUtil;
import junit.framework.TestCase;

public class FileUtilUnitTest extends TestCase
{

  public void testGetSourceFileList()
  {

    File test1 = new File("test1.java");
    File test2 = new File("test2.java");
    File test3 = new File("test3.java");

    try
    {

      // Create a bunch of files
      test1.createNewFile();
      test2.createNewFile();
      test3.createNewFile();

      // set the path and extension variables
      String path = System.getProperty("user.dir");
      String extension = ".java";

      // get the list of files from the location
      List<File> fileList = FileUtil.getSourceFileList(path, extension);

      // list to hold the string equivalent of each file path
      List<String> fileNameList = new ArrayList<String>();

      // get all of the file paths
      for (File f : fileList)
      {

        fileNameList.add(f.toString());

      }

      // test to see if the files exist
      assertTrue(fileNameList
          .contains(path + File.separatorChar + "test1.java"));
      assertTrue(fileNameList
          .contains(path + File.separatorChar + "test2.java"));

    } catch (IOException e)
    {

    } finally
    {

      // delete the files when we are done with them
      test1.delete();
      test2.delete();
      test3.delete();

    }

  }

}
