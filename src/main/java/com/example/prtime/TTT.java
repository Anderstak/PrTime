package com.example.prtime;

import java.time.LocalDateTime;
import java.util.Scanner;

public class TTT {
    static int shift = 0;

    public static class MyThread extends Thread {
        @Override
        public void run() {
            int i = 1;
            while(true) {
                LocalDateTime now = LocalDateTime.now();
                int hour = now.getHour() + TTT.shift;
                int minute = now.getMinute();
                int second = now.getSecond();
                System.out.println(hour + ":" + minute + ":" + second);
                try {
                    Thread.sleep(1000); // делает интервал в одну секунду
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {

        // Программа, которая будет выводить в консольку
        // Числа подряд от 1 до бесконечности с интервалом 1 секунда

        System.out.println("Эта программа залипательна. Напишите exit, чтобы закончить всё.");

        Thread thread = new MyThread();
        thread.start();

        Scanner in = new Scanner(System.in);
        while (true) {
            int s = in.nextInt();
//            if () {
//                thread.stop();
//                break;
            TTT.shift += s;
//            }
        }





    }
}

