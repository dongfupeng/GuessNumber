package com.dongfupeng;

import java.util.Scanner;

public class Game {

	/**
	 * @param args
	 */
	private static int times = 6;
	static boolean isPlaying;
	static Guess guess;

	public static void main(String[] args) {
		printeStartGame();
		initGame();
		startGame(guess);
	}

	private static void initGame() {
		guess = new Guess(new AnswerGenerator());
		isPlaying = true;
	}

	//start ��һ�鲻֪��Ҫ��ô�㡣��������
	private static void startGame(Guess guess) {
		String result;
		while (isPlaying) {
			result = guess.guessNumber(getInputMessage());
			if ("4A0B".equals(result) || (times == 0)) {
				isPlaying = false;
				printeGameFinalResult();
			} else {
				times--;
				printeGameCurrentResult(result);
			}

		}
	}
	//end
	
	private static void printeStartGame() {
		System.out.println("Welcome!");
		System.out.println("Please input your number(" + times + ")");
	}

	private static String getInputMessage() {
		Scanner san = new Scanner(System.in);
		return san.nextLine();
	}

	private static void printeGameCurrentResult(String result) {
		System.out.println(result);
		System.out.println("Please input your number(" + times + ")");
	}

	private static void printeGameFinalResult() {
		if (times == 0) {
			System.out.println("Game Over");
			System.out.println("The real Number is : "+guess.getSystemNumber());
		} else {
			System.out.println("Congratulations!");
		}
	}

}
