package ru.sbrf.intership.lesson1.example5;

public class Example5
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread thread = new Thread(new Counter(10_000));
        thread.setDaemon(true);
        thread.start();

        Thread.sleep(10L);
    }
}
