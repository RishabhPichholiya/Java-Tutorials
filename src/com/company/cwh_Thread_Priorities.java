package com.company;

class MyTr extends Thread{
    public MyTr(String name){
        super(name);
    }
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("Thank You!!!!!!! "+ this.getName());
        }
    }
}
public class cwh_Thread_Priorities {
    public static void main(String[] args) {
        MyTr t1 =new MyTr("Rishabh");
        MyTr t2 =new MyTr("Shubh");
        MyTr t3 =new MyTr("Viti");
        MyTr t4 =new MyTr("Siddham");
        MyTr t5 =new MyTr("Siddhi");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
