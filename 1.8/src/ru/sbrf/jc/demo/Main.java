package ru.sbrf.jc.demo;

import java.util.Scanner;

//Загадка
public class Main {

    public static void main(String[] args) {
	    System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
	    for (int i = 0; i < 3; i++){
            Scanner in = new Scanner(System.in);
	        String answer = in.nextLine();
	        switch (answer){
                case "Троллейбус":
                    System.out.println("Правильно!");
                    i = 3;
                    break;
                case "Сдаюсь":
                    System.out.println("Правильный ответ: Троллейбус");
                    i = 3;
                    break;
                default:
                    System.out.println("Подумай ещё");
                    break;
            }
        }
    }
}
