package com.epam.log4j_house;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class House 
{
	private static final Logger Logger = LogManager.getLogger(House.class);
	public double FullyHomeCost(String MaterialStandard,double areaofhouseinFeets)
	{
		Logger.info("House cost is: ");
		double cost=0;
		if(MaterialStandard.equals("StandardMaterials"))
		{
			cost=1200*(areaofhouseinFeets);
			Logger.debug(cost);
		}
		else if(MaterialStandard.equals("above StandardMaterials "))
			
		{
			cost=1500*(areaofhouseinFeets);
			Logger.debug(cost);
		}
		else if(MaterialStandard.equals("HighStandardMaterials"))
		{
			cost=1800*(areaofhouseinFeets);
			Logger.debug(cost);
		}
		else if(MaterialStandard.equals("HighStandardMaterialAndFullyAutomatedHome"))
		{
			cost=2500*(areaofhouseinFeets);
			Logger.debug(cost);
		}
		return cost;
	}
}