package ru.sbrf.intership.lesson1.example2;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;

public class Example2
{
    public static void main(String[] args) throws InterruptedException
    {
        int threadCount = 12;
        BigInteger maxI = BigInteger.valueOf(100_000_000L);

        Counter[] counters = new Counter[threadCount];
        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++)
        {
            counters[i] = new Counter(
                    maxI.multiply(BigInteger.valueOf(i)).divide(BigInteger.valueOf(threadCount)).add(BigInteger.ONE),
                    maxI.multiply(BigInteger.valueOf(i + 1)).divide(BigInteger.valueOf(threadCount)));
            threads[i] = new Thread(counters[i]);
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

        BigInteger sum = BigInteger.ZERO;
        for (Counter counter : counters)
        {
            sum = sum.add(counter.getSum());
        }

        System.out.println(String.format("sum: %d", sum));
        System.out.println(String.format("time: %d ms", Duration.between(startDateTime, endDateTime).toMillis()));
    }
}