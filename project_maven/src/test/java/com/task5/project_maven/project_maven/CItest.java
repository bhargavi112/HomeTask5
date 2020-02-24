package com.task5.project_maven.project_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class CItest {

	private static final double PRECISION = 0.00001;
	@Test
	public void test() {
		Interest t = new Interest();
		double out = t.CI(6000, 5, 2);
		assertEquals(615,out,PRECISION);
	}
}

