package com.excelreport.qa;

import org.apache.poi.ss.formula.eval.NotImplementedException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestClassTwo {

	@Test
	public void testMethodPass() {
		Assert.assertTrue(true);
	}

	@Test
	public void testMethodFail() {
		//Assert.assertTrue(false);
		throw new NotImplementedException("failed internationally");
	}

	@Test
	public void testMethodSkip() {
		throw new SkipException("Skipped Intentionally");
	}
}
