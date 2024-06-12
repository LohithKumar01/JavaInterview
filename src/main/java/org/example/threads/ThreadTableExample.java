package org.example.threads;

class Table extends Thread{
    void table(int num){
        try {
            for (int i = 1; i <= 10; i++) {
                
                Thread.sleep(1000);
                System.out.printf("%d x %d = %d\n", num, i, (num*i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadTableExample {
    public static void main(String[] args) {
        Table t = new Table();
        t.table(5);
    }
}
