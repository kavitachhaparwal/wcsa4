package TestNGParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG4 {
  @Test
  public void today() {
	long threadID = Thread.currentThread().getId();
	  Reporter.log("today method"+threadID+"is the thread", true);
	  
  }
  @Test
  public void tomorrow()
  {
	  long threadID = Thread.currentThread().getId();
	  Reporter.log("tomorrow method"+threadID+"is the thread", true);
	   
  }
}
