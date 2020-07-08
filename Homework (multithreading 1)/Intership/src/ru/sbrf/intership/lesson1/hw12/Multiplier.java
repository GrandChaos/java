package ru.sbrf.intership.lesson1.hw12;

import java.math.BigInteger;

public class Multiplier extends Thread{

    private BigInteger res;
    private final BigInteger initialValue;
    private final BigInteger postLastValue;

    public Multiplier(BigInteger initialValue, BigInteger postLastValue) {
        res = BigInteger.ONE;
        this.initialValue = initialValue;
        this.postLastValue = postLastValue;
    }

    @Override
    public void run() {
        for (BigInteger i = initialValue; i.compareTo(postLastValue) <= 0; i = i.add(BigInteger.ONE))
        {
            res = res.multiply(i);
        }
    }

    public BigInteger getRes()
    {
        return res;
    }
}
