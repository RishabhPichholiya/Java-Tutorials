package com.company;

class MyNewThr1 extends Thread{
    public void run(){
        int i=1;
        while(i<400){
            System.out.println("Thank You!!!!!");
            try {
                Thread.sleep(45);//45 ms k liye ruk k execute krega
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{
    public void run(){
        int i1=0;
        while(i1<400){
            System.out.println("Thank You Again!!!!!");
            i1++;
        }
    }
}
public class cwh_Thread_Methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        //t1 jab tak khtm na ho t2 start hi na ho toh join method ka use hota h
        try {
            t1.join();//Java isko try krne ki koshish krega, jab yeh chal nhi skta to catch chalega
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}
