package ru.sbrf.intership.lesson1.example0;

public class SynchronizedExample
{
    public synchronized void method1()
    {
        // do something
    }

    public void method2()
    {
        synchronized (this)
        {
            // do something
        }
    }

    public static synchronized void method3()
    {
        // do something
    }

    public static void method4()
    {
        synchronized (SynchronizedExample.class)
        {
            // do something
        }
    }

    final Object monitor = new Object();
    final static Object staticMonitor = new Object();

    public void method5()
    {
        synchronized (monitor)
        {
            // do something
        }
    }

    public void method6()
    {
        synchronized (staticMonitor)
        {
            // do something
        }
    }
}
