package ru.sbrf.jc.demo;

import java.util.Scanner;

//определение типа треугольника
public class Main {

    public static boolean poss(double a, double b, double c){
        if (a + b > c && a + c > b && b + c > a) return true;
        else return false;
    }

    public static int type(double a, double b, double c){
        if (b > a){
            double temp = a;
            a = b;
            b = temp;
        }
        if (c > a){
            double temp = a;
            a = c;
            c = temp;
        }

        double Hyp = Math.pow(a, 2);
        double Cat = Math.pow(b, 2) + Math.pow(c, 2);
        if (Hyp == Cat) return 1;//прямоугольный
        else if (Hyp > Cat) return 2;//тупоугольный
        else return 3;//остроугольный
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Определение типа треугольника со сторонами abc");
        System.out.print("Введите a: ");
        double a = in.nextDouble();
        System.out.print("Введите b: ");
        double b = in.nextDouble();
        System.out.print("Введите c: ");
        double c = in.nextDouble();
        if (poss(a, b, c)){
            switch (type(a, b, c)){
                case 1:
                    System.out.println("Треугольник прямоугольный");
                    break;
                case 2:
                    System.out.println("Треугольник тупоугольный");
                    break;
                case 3:
                    System.out.println("Треугольник остроугольный");
                    break;
                default:
                    break;
            }
        }
        else System.out.println("Треугольник не может существовать");
    }
}
