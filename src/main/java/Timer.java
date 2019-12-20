package main;

import java.sql.Time;

public class Timer {
    int time;

    public Timer(int time) {
        this.time = time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void StartTimeCount() throws InterruptedException {
        for (int i = time; i > 0; i--) {
            System.out.println("осталось " + i + "секунд");
            Thread.sleep(1000);
        }

    }
}