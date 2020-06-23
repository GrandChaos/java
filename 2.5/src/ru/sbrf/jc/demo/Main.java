package ru.sbrf.jc.demo;

import java.util.Scanner;

//сумма цифр числа
public class Main {

    public static int sum (int N, int res){
        res += N%10;
        if (N < 10)
            return res;
        else
            return sum(N/10, res);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n  = in.nextInt();
        System.out.println("Сумма чисел: " + sum(n, 0));
    }
}
