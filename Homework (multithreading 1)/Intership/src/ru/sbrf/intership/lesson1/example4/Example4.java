package ru.sbrf.intership.lesson1.example4;

public class Example4
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread producerThread = new Producer();
        Thread consumerThread = new Consumer();

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();

        System.out.println(Buffer.getItemCount());
    }
}