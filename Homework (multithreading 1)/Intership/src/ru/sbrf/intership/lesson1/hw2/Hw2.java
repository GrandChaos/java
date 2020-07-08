package ru.sbrf.intership.lesson1.hw2;

public class Hw2 {

    public static void main(String args[]) throws InterruptedException {
        int commandCount = 2;
        int runnersCount = 3;
        Race[] races = new Race[commandCount];
        Thread[] threads = new Thread[commandCount];
        for (int i = 0; i < commandCount; i++){
            races[i] = new Race(i, runnersCount);
            threads[i] = new Thread(races[i]);
        }
        for (Thread thread : threads)
        {
            thread.start();
        }

        for (Thread thread : threads)
        {
            thread.join();
        }
    }
}
