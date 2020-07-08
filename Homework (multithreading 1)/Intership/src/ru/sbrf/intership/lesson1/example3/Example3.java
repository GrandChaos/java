package ru.sbrf.intership.lesson1.example3;

public class Example3
{
    public static void main(String[] args) throws InterruptedException
    {
        Producer producerThread = new Producer();
        Consumer consumerThread = new Consumer();

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();

        System.out.println(Buffer.getItemCount());
    }
}