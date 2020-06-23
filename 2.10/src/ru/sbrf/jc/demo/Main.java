package ru.sbrf.jc.demo;

import java.util.Scanner;

//Фибоначчи
public class Main {
    public static long fib(int n){
        if (n <= 2) return 1;
        return fib(n - 1) + fib (n - 2);
    }

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Первые " + n + " чисел Фибоначчи: ");
        for (int i = 1; i <= n; i++){
            System.out.print(fib(i) + " ");
        }
    }
}