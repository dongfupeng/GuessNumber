package com.dongfupeng;

import java.util.Scanner;

public class Game {

	/**
	 * @param args
	 */
	private static int times = 6;
	
	public static void main(String[] args) {
		System.out.println("Welcome!");
		System.out.println("Please input your number("+times+")");
        Guess guess = new Guess(new AnswerGenerator());
        boolean endGame = true;
        while(endGame){
        	Scanner san = new Scanner(System.in);
    		String input = san.nextLine();
    		String result = guess.guessNumber(input);
    		if("4A0B".equals(result) || (times == 0)){
    			endGame = false;
    			printeGameFinalResult();
    		}else{
    			times--;
    			System.out.println(result);
    			System.out.println("Please input your number("+times+")");
    		}
    		
        }
        
	}

	private static void printeGameFinalResult() {
		if(times == 0){
			System.out.println("Game Over");
		}else{
			System.out.println("Congratulations!");
		}
	}

}
