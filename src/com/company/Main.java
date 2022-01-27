package com.company;

public class Main {

    public static int DISTANCE = 100;

    public static int STEP = 3;

    public static void main(String[] args) {
//        Car carA = new Car("A");
//        Car carB = new Car("B");
//        Car carC = new Car("C");

        Thread thread1 = new Thread(new Car("A"));
        Thread thread2 = new Thread(new Car("B"));
        Thread thread3 = new Thread(new Car("C"));

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
