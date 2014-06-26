package com.dongfupeng;

import java.util.Random;

public class AnswerGenerator {

	private Random _random = new Random();
	private StringBuilder _randomNumber = new StringBuilder();
	private static final int _MAX_LENGTH = 4;
	private static final int _NUMBER_RANGE = 9;
	private int _newNumber = 0;

	public String getRandomNumber() {

		while (isRandomNumberLengthLessThanMaxLength()) {
			getNewNumber();
			addNewNumberToRandomNumber();
		}
		return _randomNumber.toString();
	}

	private void addNewNumberToRandomNumber() {
		if (RandomNumberCanNotContainNewNumber(_newNumber)) {
			_randomNumber.append(_newNumber);
		}
	}

	private void getNewNumber() {
		_newNumber = _random.nextInt(_NUMBER_RANGE) + 1;
	}

	private boolean RandomNumberCanNotContainNewNumber(int currentNumber) {
		return !_randomNumber.toString().contains(currentNumber + "");
	}

	private boolean isRandomNumberLengthLessThanMaxLength() {
		return _randomNumber.length() < _MAX_LENGTH;
	}

}
