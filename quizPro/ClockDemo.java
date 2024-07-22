package quizPro;

import java.util.Scanner;

public class ClockDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter seconds since midnight for firstClock: ");
        int secondsSinceMidnight = scanner.nextInt();
        Clock firstClock = new Clock(secondsSinceMidnight);

        System.out.println("First Clock:");
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println(firstClock);
        }

        System.out.print("Enter hours, minutes, and seconds for secondClock: ");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();
        Clock secondClock = new Clock(hours, minutes, seconds);

        System.out.println("Second Clock:");
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.println(secondClock);
        }

        firstClock.addClock(secondClock);

        System.out.println("After adding secondClock to firstClock:");
        System.out.println("First Clock: " + firstClock);
        System.out.println("Second Clock: " + secondClock);

        Clock thirdClock = firstClock.subtractClock(secondClock);

        System.out.println("Difference between firstClock and secondClock (thirdClock): " + thirdClock);
        
        scanner.close();
    }
}

