package com.dongfupeng.tests;

import org.junit.Before;
import org.junit.Test;
import com.dongfupeng.AnswerGenerator;
import com.dongfupeng.CompareNumber;
import com.dongfupeng.Guess;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

public class TestGuess {

	AnswerGenerator answerGenerator;
	Guess guess;
	
	@Before
	public void setup(){
		answerGenerator = mock(AnswerGenerator.class);
		when(answerGenerator.getRandomNumber()).thenReturn("1234");
		guess = new Guess(answerGenerator);
	}
	
	@Test
	public void testGuessNumberInput1234Return4A0B() {
		
		String input = "1234";
		String result = guess.guessNumber(input);
		assertTrue("4A0B".equals(result));
	}
	
	@Test
	public void testGuessNumberInput4312Return4A4B() {

		String input = "4312";
		String result = guess.guessNumber(input);
		assertTrue("4A4B".equals(result));

	}
}
