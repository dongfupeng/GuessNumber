package com.dongfupeng;

import java.util.Scanner;

public class Game {

	/**
	 * @param args
	 */
	private static int _remainingTimes = 6;
	static boolean isPlaying;
	static Guess guess;
	private static final String _WIN_GAME = "4A0B";

	public static void main(String[] args) {
		printeStartGame();
		initGame();
		playGame(guess);
	}

	private static void initGame() {
		guess = new Guess(new AnswerGenerator());
		isPlaying = true;
	}

	//感觉这个方法的重构还是有点不足 不知道下一步该怎么做
	private static void playGame(Guess guess) {
		String itsCurrentResult;
		while (isPlaying) {
			itsCurrentResult = guess.guessNumber(getInputMessage());
			if (isFinishGame(itsCurrentResult)) {
				finishGame();
				printeGameFinalResult();
			} else {
				continueGame();
				printeGameCurrentResult(itsCurrentResult);
			}

		}
	}

	private static void continueGame() {
		_remainingTimes--;
	}

	private static void finishGame() {
		isPlaying = false;
	}

	private static boolean isFinishGame(String result) {
		return _WIN_GAME.equals(result) || (_remainingTimes == 0);
	}

	private static void printeStartGame() {
		System.out.println("Welcome!");
		printeRemainingTimes();
	}

	private static void printeRemainingTimes() {
		System.out.println("Please input your number(" + _remainingTimes + ")");
	}

	private static String getInputMessage() {
		Scanner san = new Scanner(System.in);
		return san.nextLine();
	}

	private static void printeGameCurrentResult(String result) {
		System.out.println(result);
		printeRemainingTimes();
	}

	private static void printeGameFinalResult() {
		if (_remainingTimes == 0) {
			System.out.println("Game Over");
			System.out.println("The real Number is : "
					+ guess.getSystemNumber());
		} else {
			System.out.println("Congratulations!");
		}
	}

}
