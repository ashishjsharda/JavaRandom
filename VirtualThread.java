package org.example;

public class VirtualThread {
    public static void main(String[] args) {
        Runnable task=()->{
            System.out.println("Hello");
        };
        Thread.startVirtualThread(task);
        //TODO
    }
}
