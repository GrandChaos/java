package ru.sbrf.jc.demo;

import java.util.Scanner;

//Случайное число
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите начало отрезка: ");
        int a = in.nextInt();
        System.out.print("Введите конец отрезка: ");
        int b = in.nextInt();
        int res = (int) (Math.random() * (b - a) + a);
        System.out.print("\nСлучайное число: " + res);
    }
}
