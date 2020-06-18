package ru.sbrf.jc.demo;

public class Main {

    public static void main(String[] args) {
	    int arr[] = new int[20];
	    System.out.print("Изначальный массив: ");
	    for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
        }

	    for (int i = 0; i < arr.length - 1; i++)
            for (int j = arr.length - 1; j > i; j--)
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

        System.out.print("\nИтоговый массив: ");
        for (int i = 0; i < 20; i++)
            System.out.print(arr[i] + " ");
    }
}
