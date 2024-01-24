package com.company;
class Phone{
    public void greet(){
        System.out.println("I am NOKIA 1100");
    }

    public void keypad(){
        System.out.println("I had a very nice keypad");
    }
}

class SmartPhone extends Phone{
    @Override
    public void greet() {
        System.out.println("I am I PHONE 15 PRO MAX");
    }


}
public class cwh_49_DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj =new SmartPhone();
        obj.greet();//Greet karega Smartphone class se
        obj.keypad(); // execute hoga
       // obj.playmusic(); // throws error
    }
}
