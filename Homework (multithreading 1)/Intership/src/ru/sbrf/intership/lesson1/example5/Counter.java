package ru.sbrf.intership.lesson1.example5;

public class Counter implements Runnable
{
    private final int maxValue;

    public Counter(int maxValue)
    {
        this.maxValue = maxValue;
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= maxValue; i++)
        {
            System.out.println(i);
        }
    }
}
