package com.company;

class MyThr extends Thread{
    public MyThr(String name){
      super(name); // calling parent class constructor inside the constructor
    }
    @Override
    public void run(){
        System.out.println("I am a Thread");
    }
}
public class cwh_ConstructorThreadClass {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Rishabh");
        t1.start();
        System.out.println(t1.getId() + "  " + t1.getName());
    }
}
