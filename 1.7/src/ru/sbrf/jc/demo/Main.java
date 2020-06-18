package ru.sbrf.jc.demo;

public class Main {
    public static int fib(int n){
        if (n <= 2) return 1;
        return fib(n - 1) + fib (n - 2);
    }

    public static void main(String[] args) {
	    for (int i = 1; i <= 11; i++){
	        System.out.print(fib(i) + " ");
        }
    }
}
