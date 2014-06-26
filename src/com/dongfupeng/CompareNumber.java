package com.dongfupeng;

public class CompareNumber {

	private int _sameNumberCounts;
	private int _wrongPositionCounts;
	private String _systemNumber, _guessNumber;

	public String compare(String systemNumber, String guessNumber) {

		initCompareInfo(systemNumber, guessNumber);

		compareTwoNumbers();

		return getCompareResult();
	}

	private String getCompareResult() {
		return _sameNumberCounts + "A" + _wrongPositionCounts + "B";
	}

	private void compareTwoNumbers() {
		for (int i = 0; i < _guessNumber.length(); i++) {
			if (isExistSameNumbers(i)) {
				calculateSameNumberCounts();
				calculateWrongPositonCounts(i);
			}
		}
	}

	private boolean isExistSameNumbers(int i) {
		return _systemNumber.contains(_guessNumber.charAt(i) + "");
	}

	private void calculateSameNumberCounts() {
		_sameNumberCounts++;
	}

	private void calculateWrongPositonCounts(int i) {
		if (sameNumbersIsNotInTheSamePosition(i)) {
			_wrongPositionCounts++;
		}
	}

	private boolean sameNumbersIsNotInTheSamePosition(int i) {
		return !(_systemNumber.charAt(i) == _guessNumber.charAt(i));
	}

	private void initCompareInfo(String systemNumber, String guessNumber) {
		_sameNumberCounts = 0;
		_wrongPositionCounts = 0;
		_systemNumber = systemNumber;
		_guessNumber = guessNumber;
	}

}
