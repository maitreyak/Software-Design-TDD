
import junit.framework.Test;
import junit.framework.TestSuite;

public class SuiteOfTests extends TestSuite {
  
	public static Test suite() {        
    TestSuite theSuite = new TestSuite();
    theSuite.addTestSuite(writers.TestStringWriter.class);
    theSuite.addTestSuite(writers.TestFileWriter.class);
    theSuite.addTestSuite(formatter.TestToUpper.class);
    theSuite.addTestSuite(formatter.TestToLower.class);
    theSuite.addTestSuite(formatter.TestReplaceStupid.class);
    theSuite.addTestSuite(formatter.TestDuplicateRemover.class);
    theSuite.addTestSuite(formatter.TestTargetWriter.class);
    return theSuite;
  }
}
