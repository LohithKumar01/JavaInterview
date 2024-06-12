package org.example.threads;

public class ThreadBasic {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
