package com.dongfupeng;

public class Guess {

	private CompareNumber compareNumber;
	private String systemNumber;
	
	public Guess(AnswerGenerator answerGenerator) {
		systemNumber = answerGenerator.getRandomNumber();
		compareNumber =new CompareNumber();
	}

	public String guessNumber(String input) {
		
		return compareNumber.compare(systemNumber, input);
	
	}

}
