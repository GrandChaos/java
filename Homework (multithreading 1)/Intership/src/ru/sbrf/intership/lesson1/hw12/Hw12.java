package ru.sbrf.intership.lesson1.hw12;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;

public class Hw12 {

    public static void main(String[] args) throws InterruptedException
    {
        int threadCount = 16;
        BigInteger maxI = BigInteger.valueOf(100_000L);

        Multiplier[] multipliers = new Multiplier[threadCount];
        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++)
        {
            multipliers[i] = new Multiplier(
                    maxI.multiply(BigInteger.valueOf(i)).divide(BigInteger.valueOf(threadCount)).add(BigInteger.ONE),
                    maxI.multiply(BigInteger.valueOf(i + 1)).divide(BigInteger.valueOf(threadCount)));
            threads[i] = new Thread(multipliers[i]);
            threads[i].setPriority(Thread.MAX_PRIORITY);
        }

        LocalDateTime startDateTime = LocalDateTime.now();

        for (Thread thread : threads)
        {
            thread.start();
        }

        for (Thread thread : threads)
        {
            thread.join();
        }

        LocalDateTime endDateTime = LocalDateTime.now();

        BigInteger res = BigInteger.ONE;
        for (Multiplier multiplier : multipliers)
        {
            res = res.multiply(multiplier.getRes());
        }

        System.out.println(String.format("mult: %d", res));
        System.out.println(String.format("time: %d ms", Duration.between(startDateTime, endDateTime).toMillis()));
    }
}
