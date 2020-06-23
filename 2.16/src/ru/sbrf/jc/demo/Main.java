package ru.sbrf.jc.demo;

//бракованные таблички
public class Main {

    public static boolean check (int n){
        while (n > 0){
            if (n % 10 == 2) return true;
            else n /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        int res = 0;
	for (int i = 1; i <= 50000; i++){
            if (check(i)){
                res++;
//                System.out.print(i + " ");
            }
        }
	    System.out.println("Бракованных табличек: " + res);
    }
}
