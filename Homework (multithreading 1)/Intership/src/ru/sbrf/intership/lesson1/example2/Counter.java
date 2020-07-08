package ru.sbrf.intership.lesson1.example2;

import java.math.BigInteger;

public class Counter implements Runnable
{
    private BigInteger sum;
    private final BigInteger initialValue;
    private final BigInteger postLastValue;

    public Counter(BigInteger initialValue, BigInteger postLastValue)
    {
        sum = BigInteger.ZERO;
        this.initialValue = initialValue;
        this.postLastValue = postLastValue;
    }

    @Override
    public void run()
    {
        for (BigInteger i = initialValue; i.compareTo(postLastValue) <= 0; i = i.add(BigInteger.ONE))
        {
            sum = sum.add(i);
        }
    }

    public BigInteger getSum()
    {
        return sum;
    }
}
