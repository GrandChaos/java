package ru.sbrf.jc.demo;

import java.util.Scanner;

public class Main {

    //игра с угадыванием букв
    public static void main(String[] args) {
	    char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	    int num = (int) (Math.random() * (letters.length - 1));
	    boolean win = false;
	    do {
	        System.out.println("Input letter: ");
		    Scanner in = new Scanner(System.in);
		    String answer = in.nextLine();
		    char ch = answer.charAt(0);
		    for (int i = 0; i < letters.length; i++){
				if (ch == letters[i]){
					if (i == num) {
						System.out.println("Right");
						win = true;
						break;
					}
					else if (i < num) {
						System.out.println("You’re too low");
						break;
					}
					else {
						System.out.println("You’re too high");
						break;
					}
				}
		    }
        } while(!win);
    }
}
