package org.example.MultiThreading;

class Testing implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is Running");
    }
}
public class ByRunnableInterface {
    public static void main(String[] args) {
        Thread thread = new Thread(new Testing());
        thread.start();
    }
}
