package com.epam.Simple_Compound;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class Simple 
{
	private static final Logger Logger=LogManager.getLogger(Simple.class);
	double simpleInterest(double principle,double rate,int time)
	{		
		Logger.info("this is simple interest");
		double simpleinterest=((principle*rate*time)/100);
		Logger.debug("Simpleinterest:"+simpleinterest);
		return simpleinterest;
		
	}
	double compoundInterest(double pr,double rate,int time)
	{
		Logger.info("this is compound interest");
	    double  com=pr * Math.pow(1.0+rate/100.0,time) - pr;
	    Logger.debug("compoundinterest is:"+com);
	    return com;
	}
}
