package com.dongfupeng;

public class CompareNumber {

	private int ACount;
	private int BCount;

	public String compare(String systemNumber, String guessNumber) {
		ACount = 0;
		BCount = 0;
		for (int i = 0; i < guessNumber.length(); i++) {
			if (systemNumber.contains(guessNumber.charAt(i) + "")) {
				ACount++;
				if (!(systemNumber.charAt(i) == guessNumber.charAt(i))) {
					BCount++;
				}
			}
		}
		String result = ACount + "A" + BCount + "B";
		return result;
	}

}
