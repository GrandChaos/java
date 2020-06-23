package ru.sbrf.jc.demo;

//вес на Луне
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    float mass_E, mass_M;
	    Scanner in = new Scanner(System.in);
	    System.out.print("Введите вес на Земле: ");
	    mass_E = in.nextFloat();
	    mass_M = mass_E * 0.17f;
	    System.out.println("Вес на Луне: " + mass_M);
    }
}
