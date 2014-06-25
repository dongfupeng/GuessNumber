package com.dongfupeng;

public class CompareNumber {

	private int _ACount;
	private int _BCount;

	public String compare(String systemNumber, String guessNumber) {
		_ACount = 0;
		_BCount = 0;
		for (int i = 0; i < guessNumber.length(); i++) {
			if (systemNumber.contains(guessNumber.charAt(i) + "")) {
				_ACount++;
				if (!(systemNumber.charAt(i) == guessNumber.charAt(i))) {
					_BCount++;
				} 
			} 
		}
		String result = _ACount + "A" + _BCount + "B";
		return result;
	}

}
