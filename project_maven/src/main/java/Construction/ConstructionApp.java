package Construction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionApp {

	private static final Logger LOGGER = LogManager.getLogger(ConstructionApp.class);
	
	public static void main(String[] args) {
		
		ConstructionCost h1 = new ConstructionCost();
		double out = h1.Cost("standardMaterials", 450, false);
		LOGGER.info("Cost for construction of first house is "+out);
		
		ConstructionCost h2 = new ConstructionCost();
		out = h2.Cost("highStandardsMaterials", 450, true);
		LOGGER.info("Cost for construction of second house is "+out);

	}

}