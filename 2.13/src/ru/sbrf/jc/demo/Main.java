package ru.sbrf.jc.demo;

import java.util.Scanner;

public class Main {

    //программа с массивом
    public static void main(String[] args) {
	    System.out.print("Введите размер массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        float arr[] = new float [size];
        for (int i = 0; i < size; i++)
            arr[i] = (int) (Math.random() * 100);
        boolean exit = false;
        do {
            System.out.println("\nМеню:\n1.Вывести массив\n2.Увеличить элемент массива на 10%\n3.Выход");
            int input = in.nextInt();
            switch (input) {
                case 1:
                    for (int i = 0; i < size; i++)
                        System.out.print(arr[i] + " ");
                    break;
                case 2:
                    System.out.print("\nВведите индекс элемента: ");
                    int pos = in.nextInt();
                    arr[pos] = arr[pos] * 1.1f;
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Некоррекктный ввод");
                    break;
            }
        } while (!exit);
    }
}
