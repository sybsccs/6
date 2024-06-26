/*
 Write a java program to display name of currently executing Thread in multithreading
 */
package com.mycompany.javaslip;

public class slip28_2
{
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Name of the thread: " + Thread.currentThread().getName());
        });

        t.start();
    }
}
