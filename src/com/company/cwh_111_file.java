package com.company;

import java.io.*;
import java.util.Scanner;

public class cwh_111_file {
    public static void main(String[] args) {
        //Creating a New Java file

        File f =new File("cwh_11_file.txt");
        try {
            f.createNewFile();
            System.out.println("File is Created!!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Writing into a File
        try{
        FileWriter f1= new FileWriter("cwh_11_file.txt");
        f1.write("Hi, This is the first line of New Java File.\nThank You Very Much!!!");
        f1.close();
        }
        catch(IOException e){
            System.out.println("We encountered the Error");
            e.printStackTrace();
        }

        //Delete a file
        File f11= new File("cwh11_file.txt");
        if(f11.delete()){
            System.out.println("The File is deleted successfully");
        }
        else{
            System.out.println("We encountered some error while deleting the file.");
        }

        //Reading a New File
        File f12 = new File("cwh_11_file.txt");
        try {
            Scanner sc =new Scanner(f12);
            while(sc.hasNextLine()){
                String x = sc.nextLine();
                System.out.println((x));
            }
        } catch (FileNotFoundException e) {
            System.out.println("I am unable to read file");

        }
    }
}
