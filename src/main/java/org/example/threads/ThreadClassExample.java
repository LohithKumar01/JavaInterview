package org.example.threads;

class ThreadSleep extends Thread{
    public void run(){
        try {
            for (int i = 1; i <= 10; i++) {
                sleep(10000);
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


public class ThreadClassExample {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        threadSleep.start();
    }
}
