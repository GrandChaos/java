package ru.sbrf.intership.lesson1.example6;

public class Example6
{
    public static void main(String[] args) throws InterruptedException
    {
        Counter counter = new Counter(10_000);
        counter.start();

        Thread.sleep(10L);
        counter.interrupt();
    }
}
