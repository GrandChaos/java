package ru.sbrf.jc.demo;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.print("Массив: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = 100 - (int) (Math.random() * 200);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = arr[0], max = arr[0], sum = 0;
        for (int i = 0; i < 10; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
            sum += arr[i];
        }
        float avg = sum/10f;
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + avg);
    }
}
