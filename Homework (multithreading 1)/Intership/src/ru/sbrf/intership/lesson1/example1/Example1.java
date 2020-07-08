package ru.sbrf.intership.lesson1.example1;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;

public class Example1
{
    public static void main(String[] args)
    {
        BigInteger maxI = BigInteger.valueOf(100_000_000L);

        Counter counter = new Counter(BigInteger.ONE, maxI);

        LocalDateTime startDateTime = LocalDateTime.now();

        counter.run();

        LocalDateTime endDateTime = LocalDateTime.now();

        BigInteger sum = counter.getSum();

        System.out.println(String.format("sum: %d", sum));
        System.out.println(String.format("time: %d ms", Duration.between(startDateTime, endDateTime).toMillis()));
    }
}
