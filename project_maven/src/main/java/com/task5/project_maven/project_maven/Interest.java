package com.task5.project_maven.project_maven;

import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Interest {

	private static final Logger LOGGER = LogManager.getLogger(InterestApp.class);
	
	public double SI(double p, double r, double t) {
		LOGGER.info("Control entered the SimpleInterest method");
		double si = (p*t*r)/100;
		LOGGER.info("Control exited the SimpleInterest method");
		return si;
	}
	
	public double CI(int p, int r, int t) {
		LOGGER.info("Control entered the CompoundInterest method");
		double amt = p*Math.pow((1.0+(r/100.0)),t);
		double ci = amt - p;
		LOGGER.info("Control exited the CompoundInterest method");
		return ci;
	}
	
}