package ru.sbrf.intership.lesson1.hw11;

import java.math.BigInteger;

public class Multiplier {

    private BigInteger res;
    private final BigInteger initialValue;
    private final BigInteger postLastValue;

    public Multiplier(BigInteger initialValue, BigInteger postLastValue) {
        res = BigInteger.ONE;
        this.initialValue = initialValue;
        this.postLastValue = postLastValue;
    }

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
