import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class RentalAnalysisTest {

	private RentalAnalysis ra = new RentalAnalysis();
	private ArrayList<RentalRecord> rList = ra.createRecords();	
		
	@Test
	public void testAveMonthlyRentalDurationHonda() {
		assertEquals("Ave Monthly Rental Dur for Honda", ra.aveMonthlyRentalDur("Honda Fit", rList), 28.0, 0.0);
	}

	@Test
	public void testtotalRevHonda() {
		assertEquals("Total rev for Honda", ra.totalRev("Honda Fit", rList), 10497.5, 0.0);
	}
	
	//complete the remaining two test cases for Toyota
	//...
}
