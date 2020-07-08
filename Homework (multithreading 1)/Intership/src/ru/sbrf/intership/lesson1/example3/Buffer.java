package ru.sbrf.intership.lesson1.example3;

public class Buffer
{
    private static int itemCount = 0;

    public static void increment()
    {
        itemCount++;
    }

    public static void decrement()
    {
        itemCount--;
    }

    public static int getItemCount()
    {
        return itemCount;
    }
}
