package convert;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
/**
 * 
 * @author Ruba
 *
 */
public class TestConverting{

	@DataProvider(name = "test")
	public static String[][] upper() {
		return new String[][] {{"RUBA", "ruba"}, {"R@UBA", "r@uba"}, {"R(UB/#*_-)A", "r(ub/#*_-)a"}, {"R1UBa", "r1uba"},{"ruba", "ruba"}, {"R A", "r a"}};
	}

	/** 
	 * way1
	 */
	@Test(dataProvider = "test")
	public static void testway1(String inputstring, String expectedResult) {
		assertEquals(expectedResult, UpperToLower.way1(inputstring));
		System.out.println("hi");
	}

	/** 
	 * way2
	 */
	@Test(dataProvider = "test")
	public static void testway2(String inputstring, String expectedResult) {
		assertEquals(expectedResult, UpperToLower.way2(inputstring));
	}

	/** 
	 * compare way1 with way2
	 */
	@Test(dataProvider = "test")
	public static void testway3(String inputstring, String expectedResult) {
		assertEquals(UpperToLower.way1(inputstring), UpperToLower.way2(inputstring));
	}

}
