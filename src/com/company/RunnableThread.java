package com.company;

class RTI1 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<40; i++){
            System.out.println("Hey!!!! I am thread 1");
        }
    }
}

class RTI2 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<40; i++){
            System.out.println("I am thread 2, Hey!!!!!!!!!!!!!");
        }
    }
}
public class RunnableThread {
    public static void main(String[] args) {
        RTI1 t1= new RTI1();
        Thread th1 =new Thread(t1);

        RTI2 t2= new RTI2();
        Thread th2 =new Thread(t2);

        th1.start();// it will trigger the run method
        th2.start();// in thread class it is implemented like this
    }
}
