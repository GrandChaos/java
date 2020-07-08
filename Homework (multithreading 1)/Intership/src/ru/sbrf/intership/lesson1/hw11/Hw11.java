package ru.sbrf.intership.lesson1.hw11;

import java.math.BigInteger;
import java.time.Duration;
import java.time.LocalDateTime;

public class Hw11 {

    public static void main(String[] args)
    {
        BigInteger maxI = BigInteger.valueOf(100_000L);

        Multiplier multiplier = new Multiplier(BigInteger.ONE, maxI);

        LocalDateTime startDateTime = LocalDateTime.now();

        multiplier.run();

        LocalDateTime endDateTime = LocalDateTime.now();

        BigInteger res = multiplier.getRes();

        System.out.println(String.format("mult: %d", res));
        System.out.println(String.format("time: %d ms", Duration.between(startDateTime, endDateTime).toMillis()));
    }
}
