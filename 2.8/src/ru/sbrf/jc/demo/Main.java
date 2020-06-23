package ru.sbrf.jc.demo;

import java.util.Scanner;

//проверка на простое число
public class Main {

    public static String check(int N, int t){
        if (N % 2 == 0 && N != 2) return "Число не является простым";
        if (N < t * 2) return "Число является простым";
        return N%t != 0  ? check(N, t+=2): "Число не является простым";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        System.out.println(check(num, 3));
    }
}
