package Construction;

import static org.junit.Assert.*;

import org.junit.Test;


public class ConstructionCostTest {

	private static final double PRECISION = 0.00001;
	
	@Test
	public void test() {
		ConstructionCost t = new ConstructionCost();
		
		double out = t.Cost("standardMaterials", 450, false);
		assertEquals(540000, out, PRECISION);
		
		out = t.Cost("highStandardsMaterials", 450, true);
		assertEquals(1125000, out, PRECISION);
		
	}

}
