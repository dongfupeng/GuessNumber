package com.dongfupeng.tests;

import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.*;
import org.junit.Test;

import com.dongfupeng.AnswerGenerator;

public class TestAnswerGenerator {

	@Test
	public void testRandomNumberLength(){
		AnswerGenerator answerGenerator = new AnswerGenerator();
		String randomNumber = answerGenerator.getRandomNumber();
		Set<Integer> lengthSet = new HashSet<Integer>();
		for(int i = 0;i<randomNumber.length();i++){
			lengthSet.add(Integer.parseInt(randomNumber.charAt(i)+""));
		}
		System.out.println(randomNumber);
		assertTrue(lengthSet.size()==4);
	}
}
