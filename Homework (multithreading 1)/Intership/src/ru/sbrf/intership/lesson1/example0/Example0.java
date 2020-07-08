package ru.sbrf.intership.lesson1.example0;

public class Example0
{
    public static void main(String[] args)
    {
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();

        MyThread thread2 = new MyThread();
        thread2.start();

        thread1.interrupt();
        boolean isInterrupted = thread1.isInterrupted();
        Thread.interrupted();

        try
        {
            Thread.sleep(1000L);
            Thread.sleep(1000L, 150_000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        Thread.yield();

        try
        {
            thread1.join();
            thread1.join(1000L);
            thread1.join(1000L, 150_000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread1.setPriority(3);
        thread1.setPriority(Thread.MIN_PRIORITY);
        int priority = thread1.getPriority();

        boolean alive = thread1.isAlive();

        thread1.setName("Поток 1");
        String name = thread1.getName();

        Thread currentThread = Thread.currentThread();

        long id = thread1.getId();

        thread1.setDaemon(true);
        boolean daemon = thread1.isDaemon();
    }
}