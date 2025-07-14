package org.example.MultiThreading;

class Test extends Thread {
    @Override
    public void run() {
        System.out.println("Threading is Running");
    }
}

public class ByThreadClass {
    public static void main(String[] args) {
        Test test = new Test();
        test.start(); //start the thread
    }
}
