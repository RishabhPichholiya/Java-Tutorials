package com.company;
import java.util.*;
public class Java_PS4 {
    public static void main(String[] args) {
        //Problem1: Output of the Program
        int a=10;
        if(a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }
        //Problem2: Find whether the student is pass or not
        Scanner sc= new Scanner(System.in);
        int marks1=sc.nextInt();
        int marks2=sc.nextInt();
        int marks3=sc.nextInt();
        float total =(float) (marks1+marks2+marks3)/3;
        if(total>=40 && marks1>33 && marks2>33 && marks3>33){
            System.out.println("Congratulations!!!!! You are Passed "+ total);
        }
        else{
            System.out.println("Better Luck Next Time"+ total);
        }
        //Problem3: Income Tax paid by the Employee
        float Income =sc.nextFloat();
        if(Income>=2.5f && Income<5.0f){
            System.out.println("Income Tax is 5%");
        }
        else if(Income>=5.0f && Income<10.0f){
            System.out.println("Income Tax is 20%");
        }
        else{
            System.out.println("Income Tax is 30%");
        }
        //Problem4: Find the Day of the Week
        int Day =sc.nextInt();
        if(Day==1){
            System.out.println("Monday");
        } else if (Day==2) {
            System.out.println("Tuesday");
        } else if (Day==3) {
            System.out.println("Wednesday");
        }
        else if (Day==4) {
            System.out.println("Thursday");
        }
        else if (Day==5) {
            System.out.println("Friday");
        }
        else if (Day==6) {
            System.out.println("Saturday");
        }
        else if (Day==7) {
            System.out.println("Sunday");
        }
        //Problem5: Leap Year
        //Problem6: Type of Website from URL
    }
}
