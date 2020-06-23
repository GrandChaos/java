package ru.sbrf.jc.demo;

import java.util.Scanner;

//число в римскую запись
public class Main {

    public static String convert(int n){
        if (n == 100) return "C";
        String res = "";
        if (n/50 == 1) {
            if (n%50 >= 40) {
                res += "XC";
                n -= 90;
                //90
            }
            else {
                res += "L";
                n -= 50;
                //50
            }
        }
        else {
            if (n%50 >= 40) {
                res += "XL";
                n -= 40;
                //40
            }
        }
        while (n >= 10) {
            res += "X";
            n -= 10;
            //10
        }
        if (n/5 == 1) {
            if (n%5 == 4){
                res += "IX";
                return  res;
                //9
            }
            else {
                res += "V";
                n -= 5;
                //5
            }
        }
        else {
            if (n%5 == 4){
                res += "IV";
                return res;
                //4
            }
        }
        while (n > 0){
            res += "I";
            n--;
            //1
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.print("Введите натуральное число до 100: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 0 && num <= 100){
            String res = convert(num);
            System.out.println("В римской записи: " + res);
        }
        else {
            System.out.println("Число не соответствует условиям");
        }
    }
}
