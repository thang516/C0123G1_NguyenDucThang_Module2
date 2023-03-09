package ss4;

import java.time.LocalTime;
import java.util.Currency;
import java.util.Scanner;

public class StopWatch {
    long startTime;
    long endTime;

    public long getStartTime(long startTime) {
        return startTime;
    }

    public long getEndTime(long endTime) {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        getStartTime(startTime);
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
        getEndTime(endTime);
    }

    public void getElapsedTime() {
        long elaspedTime = (endTime - startTime);
        System.out.println("Số giây đếm đc" + elaspedTime);
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" bấm 1 để bắt đầu đếm ");
        int a = scanner.nextInt();
        if (a == 1) {
            stopWatch.start();
        }
        System.out.println("Bấm 2 để dừng ");
        int b = scanner.nextInt();
        if (b == 2) {
            stopWatch.end();
        }
        stopWatch.getElapsedTime();
    }
}

