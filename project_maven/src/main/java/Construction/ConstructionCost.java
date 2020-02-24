package Construction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost {

	private static final Logger LOGGER = LogManager.getLogger(ConstructionApp.class);
	
	public double Cost(String std_type, double area, boolean automated) {
		
		LOGGER.info("Control entered the Cost method");
		
		double cost = area;
		if(std_type=="standardMaterials" && automated==false)
			cost*=1200;
		else if(std_type=="aboveStandardMaterials" && automated==false)
			cost*=1500;
		else if(std_type=="highStandartMaterials" && automated==false)
			cost*=1800;
		else if(std_type=="highStandardsMaterials" && automated==true)
			cost*=2500;
		
		LOGGER.info("Control exited the Cost method");
		
		return cost;
	}
	
}
