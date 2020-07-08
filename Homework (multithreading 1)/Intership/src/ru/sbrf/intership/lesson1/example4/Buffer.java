package ru.sbrf.intership.lesson1.example4;

public class Buffer
{
    private static int itemCount = 0;

    public static synchronized void increment()
    {
        itemCount++;
    }

    public static synchronized void decrement()
    {
        itemCount--;
    }

    public static int getItemCount()
    {
        return itemCount;
    }
}
