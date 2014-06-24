package com.dongfupeng.tests;

import org.junit.Before;
import org.junit.Test;

import com.dongfupeng.CompareNumber;

import static org.junit.Assert.*;

public class TestCompareNumber {

	String systemNumber;
	CompareNumber compareNumber;
	String guessNumber;

	@Before
	public void setup() {
		systemNumber = "1234";
	}

	@Test
	public void testCompareInput1234Return4A0B() {
		guessNumber = "1234";
		compareNumber = new CompareNumber();
		String result = compareNumber.compare(systemNumber, guessNumber);
		System.out.println(result);
		assertTrue("4A0B".equals(result));
	}

	@Test
	public void testCompareInput6789Return0A4B() {
		guessNumber = "6789";
		compareNumber = new CompareNumber();
		String result = compareNumber.compare(systemNumber, guessNumber);
		System.out.println(result);
		assertTrue("0A0B".equals(result));
	}

	@Test
	public void testCompareInput4123Return4A4B() {
		guessNumber = "4123";
		compareNumber = new CompareNumber();
		String result = compareNumber.compare(systemNumber, guessNumber);
		System.out.println(result);
		assertTrue("4A4B".equals(result));
	}

	@Test
	public void testCompareInput1256Return2A0B() {
		guessNumber = "1256";
		compareNumber = new CompareNumber();
		String result = compareNumber.compare(systemNumber, guessNumber);
		System.out.println(result);
		assertTrue("2A0B".equals(result));
	}
}
