package ru.sbrf.jc.demo;

//двумерный массив
public class Main {
    public static int arr[][] = new int [6][7];

    public static void setArr(){
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 7; j++)
                arr[i][j] = (int) (Math.random()*100);
    }

    public static void printArr(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void changeArr(){
        for (int i = 0; i < 6; i++) {
            int max = arr[i][0];
            int pos = 0;
            for (int j = 1; j < 7; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                    pos = j;
                }
            }
            int temp = arr[i][0];
            arr[i][0] = arr[i][pos];
            arr[i][pos] = temp;
        }
    }

    public static void main(String[] args) {
        setArr();
        System.out.println("Изначальный массив:");
        printArr();
        changeArr();
        System.out.println("\nИтоговый массив:");
        printArr();
    }
}
