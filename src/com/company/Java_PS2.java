package com.company;
import java.util.*;
public class Java_PS2 {
    public static void main(String[] args) {
        // Program1 : Result of the expression
        float a =(7.0f/4.0f);
        float b=(9.0f/2.0f);
        float c =a*b;
        System.out.println(c);
        // Program2 :
        // Program3 : Which number is greater
        int x =10;
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if(num>x){
            System.out.println("User entered the number is greater");
        }
        else if(num==x){
            System.out.println("Both the numbers are equal");
        }
        else{
            System.out.println("User entered number is smaller");
        }
        // Program4 : Result of the expression
        float exp1 = ((3.0f*3.0f)-(2.0f*2.0f))/(2.0f*3.0f*1.0f);
        System.out.println("The value of the expression: "+ exp1);
        // Program5 : Result of the expression
        float exp2 = 7.0f+(49.0f/7.0f)+(35.0f/7.0f);
        System.out.println("The value of the expression: "+ exp2);
    }
}
