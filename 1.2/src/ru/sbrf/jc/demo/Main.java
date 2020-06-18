package ru.sbrf.jc.demo;

//Быстрая сортировка
public class Main {
    public static int arrLen = 20;
    public static int arr[] = new int[arrLen];

    public static void setArr() {
        for (int i = 0; i < arrLen; i++)
            arr[i] = (int) (Math.random() * 10);
    }

    public static void printArr() {
        for (int i = 0; i < arrLen; i++)
            System.out.print(arr[i] + " ");
    }

    public static void sort(int begin, int end) {
        if (begin >= end) return;
        int i = begin;
        int j = end;
        int avg = (i + j) / 2;
        while (i < j) {
            while ((arr[i] <= arr[avg]) && i < avg) i++;
            while (arr[j] >= arr[avg] && j > avg) j--;
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (i == avg)
                    avg = j;
                else if (j == avg)
                    avg = i;
            }
        }
        sort(begin, avg);
        sort(avg + 1, end);
    }

    public static void main(String[] args) {
        setArr();
        System.out.print("Изначальный массив: ");
        printArr();
        sort(0, arrLen - 1);
        System.out.print("\nИтоговый массив: ");
        printArr();
    }
}
