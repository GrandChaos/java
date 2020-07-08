package ru.sbrf.intership.lesson1.hw2;

import java.time.Duration;
import java.time.LocalTime;

public class Race extends Thread {

    private int rCount;
    private int cCount;
    private LocalTime startTime;
    private static int place = 0;
    int minT = 1;
    int maxT = 3;

    public Race(int cCount, int rCount){
        this.cCount = cCount;
        this.rCount = rCount;
    }

    private int getcCount(){
        return cCount;
    }

    public static synchronized int getPlace(){
        place++;
        return place;
    }

    @Override
    public void run(){
        startTime = LocalTime.now();
        for (int i = 0; i < rCount; i++) {
            double t = minT + (Math.random() * maxT);
            try {
                Thread.sleep((int) t * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LocalTime temp = LocalTime.now();
            System.out.println("Команда " + (getcCount() + 1) + " завершила " + (i + 1) + " этап. Время: " + Duration.between(startTime, temp).toMillis() + " мс");
        }
        LocalTime temp = LocalTime.now();
        System.out.println("Команда " + (getcCount() + 1) + " завершила эстафету. Время: " + Duration.between(startTime, temp).toMillis() + " мс. Место: " + getPlace());
    }
}
