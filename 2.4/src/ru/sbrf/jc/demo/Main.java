package ru.sbrf.jc.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String num = in.nextLine();
        char[] chArr = num.toCharArray();
        boolean p = true;
        for (int i = 0; i < num.length()/2; i++){
            if (chArr[i] != chArr[num.length() - i - 1]) {
                p = false;
                break;
            }
        }
        if (p == true)
            System.out.println("Число является палиндромом");
        else
            System.out.println("Число не является палиндромом");
    }
}
