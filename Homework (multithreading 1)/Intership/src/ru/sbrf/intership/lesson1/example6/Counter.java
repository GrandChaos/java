package ru.sbrf.intership.lesson1.example6;

public class Counter extends Thread
{
    private final int maxValue;

    public Counter(int maxValue)
    {
        this.maxValue = maxValue;
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= maxValue && !Thread.interrupted(); i++)
        {
            System.out.println(i);
        }
    }
}
