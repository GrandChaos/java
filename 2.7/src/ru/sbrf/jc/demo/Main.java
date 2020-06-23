package ru.sbrf.jc.demo;

import java.util.Scanner;

//Делители
public class Main {

    public static void main(String[] args) {
	    System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Делители: ");
        for (int i = 1; i * 2 <= num; i++)
            if (num % i == 0)
                System.out.print(i + " ");
        System.out.print(num);
    }
}
