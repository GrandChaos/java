package ru.sbrf.jc.demo;

import java.util.Scanner;

//удаление символа
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = in.nextLine();
        String str[] = line.split(" ");
        int pos = 0;
        try {
            pos = Integer.valueOf(str[1]);
        } catch (NumberFormatException e){
            System.err.println("Неправильный формат строки!");
        }
        String res = str[0].substring(0, pos) + str[0].substring(pos + 1);
        System.out.println("Итоговая строка: \n" + res);
    }
}
