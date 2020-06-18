package ru.sbrf.jc.demo;

//Простые числа
public class Main {

    public static void main(String[] args) {
	    for (int num = 2; num <= 100; num++) {
            boolean simple = true;
            if ((num % 2 != 0) || (num == 2)) {
                for (int i = 3; i * 2 < num; i += 2)
                    if (num % i == 0) {
                        simple = false;
                        break;
                    }
            }
            else simple = false;
            if (simple == true)
                System.out.print(num + " ");
        }
    }
}
