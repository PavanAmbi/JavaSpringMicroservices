package com.example.javapractice.coding;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PrintNumberThread{
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        PrintNumberThread printNumberThread = new PrintNumberThread();

        Thread evenThread = new Thread(() -> {
            try {
                printNumberThread.printEven(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread oddThread = new Thread(() -> {
            try {
                printNumberThread.printodd(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        evenThread.start();
        oddThread.start();
    }

    synchronized public void printEven(int n) throws InterruptedException {
        for(int i=1; i<=n; i++){
            lock.lock();
              if(i%2==0){
                  System.out.println("Even " + i);
                  notifyAll();
              }else{
                  wait();
              }
            }

        }

    synchronized public void printodd(int n) throws InterruptedException {
            for(int i=1; i<=n; i++){
                if(i%2!=0){
                    System.out.println("Odd " + i);
                    notifyAll();
                }else{
                    wait();
                }
            }

        }
}
