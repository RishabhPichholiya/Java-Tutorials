package com.company;
import java.util.*;
public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        int total = 0;
        int percentage;
        System.out.println("Please enter the marks of the students: ");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        percentage = total / 5;
        System.out.println("The Percentage of students: "+ percentage);
    }
}
