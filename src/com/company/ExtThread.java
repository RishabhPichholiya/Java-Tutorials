package com.company;

class  Thread1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<400;i++){
            System.out.println("Thread1 is running");
        }
    }
}

class  Thread2 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<400;i++){
            System.out.println("Thread2 is running");
        }
    }
}
public class ExtThread {
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2 = new Thread2();
        t1.start(); // this will call run method
        t2.start(); // in Thread class it is implemented in this way.
    }
}
