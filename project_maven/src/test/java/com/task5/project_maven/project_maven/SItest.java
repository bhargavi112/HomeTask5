package com.task5.project_maven.project_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class SItest {

	private static final double PRECISION = 0.00001;
	@Test
	public void test() {
		Interest t = new Interest();
		double out = t.SI(6000, 15, 7);
		assertEquals(6300.00,out,PRECISION);
	}

}
