package convert;

import java.util.logging.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * 
 * @author Ruba
 *
 */

public class BaseTest {
	 private static final Logger log = Logger.getLogger(BaseTest.class.getName()); 
		
	 @BeforeClass
	 public void beforeClass() {
	     log.info("Before Class");
	 }

	 @BeforeMethod
	 public void before() {
	     log.info("Before Test");
	 }

	 @AfterMethod
	 public void after() {
	     log.info("After Test");
	 }

	 @AfterClass
	 public void afterClass() {
	     log.info("After Class");
	 }

}
