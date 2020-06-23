package ru.sbrf.jc.demo;

import java.util.Scanner;

//квадратное уравнение
public class Main {

    public static void main(String[] args) {
        System.out.println("Решение уравнения вида ax²+bx+c=0");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = in.nextDouble();
        System.out.print("Введите b: ");
        double b = in.nextDouble();
        System.out.print("Введите c: ");
        double c = in.nextDouble();
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D > 0 && a != 0){
            double X1 = (-b + Math.sqrt(D))/(2 * a);
            double X2 = (-b - Math.sqrt(D))/(2 * a);
            System.out.println("Решения уравнения:\nX1 = " + X1 + "\nX2 = " + X2);
        }
        else if (D == 0 && a != 0){
            double X = -b/(2 * a);
            System.out.println("Решение уравнения:\nX = " + X);
        }
        else if (a == 0 && b != 0){
            double X = c / b;
            System.out.println("Решение уравнения:\nX = " + X);
        }
        else
            System.out.println("Решений нет");
    }
}
