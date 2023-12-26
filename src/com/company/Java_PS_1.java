package com.company;
import java.util.*;
public class Java_PS_1 {
    public static void main(String[] args) {
        //Program1: Sum of three numbers
        int a,b,c;
        a=23;
        b=47;
        c=98;
        int sum =a+b+c;
        System.out.println("The sum of three numbers a,b,c :" + sum);

        //Program2: Calculate GPA
        int sub1,sub2,sub3;
        sub1=23;
        sub2=47;
        sub3=98;
        int total =sub1+sub2+sub3;
        int GPA =total/30;
        System.out.println("The GPA of three subjects sub1,sub2,sub3 :" + GPA);

        //Program3: Ask user his name and greet him
        System.out.println("Hey User What's your name: ");
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Helo "+ name + ", have a great day!!!");

        //Program 4: Convert kms into miles
        int distance =sc.nextInt();
        float distance_f = (float) (distance*(0.6));
        System.out.println("The distance in miles is : "+ distance_f);

        //Program5 : Detect the number entered by the user is integer or not
        if(sc.hasNextInt()){
            System.out.println("The number entered by the user is an integer");
        }
        else{
            System.out.println("The number entered by the user is not a integer");
        }
    }
}
