package com.company;
class MyGeneric<T1,T2>{
    private int val =10;
    private T1 t1;
    private T2 t2;

    public MyGeneric( T1 t1, T2 t2){
        this.t1=t1;
        this.t2=t2;
    }

    public T2 getT2() {
        return t2;
    }

    public T1 getT1() {
        return t1;
    }

    public int getVal() {
        return val;
    }
}
public class cwh_110_generics {
    public static void main(String[] args) {
        MyGeneric <String, Integer> myGeneric =new MyGeneric("This is My String you know",69);
    }
}
