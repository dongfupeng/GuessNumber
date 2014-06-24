package com.dongfupeng;

import java.util.Random;

public class AnswerGenerator {

	public String getRandomNumber() {

		Random random = new Random();
		StringBuilder result = new StringBuilder();
		int currentNumber = 0;
		while (result.length() < 4) {
			currentNumber = random.nextInt(9) + 1;
			if (!result.toString().contains(currentNumber + "")) {
				result.append(currentNumber);
			}
		}
		return result.toString();
	}

}
