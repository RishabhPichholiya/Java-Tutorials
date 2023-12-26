package com.company;
import java.util.*;
public class Java_PS3 {
    public static void main(String[] args) {
        //Program1: Convert string to lowercase
        String str = "This is a new string";
        String str1=str.toLowerCase();
        System.out.println(str1);
        //Program2: Replace whitespaces with underscores
        String str2=str.replace(' ', '_');
        System.out.println(str2);
        //Program3:Replace <name> with Rishabh
        String strs ="Dear <name>, Thanks a lot!!";
        String str3=strs.replace("<name>", "Rishabh");
        System.out.println(str3);
        //Program4: Detect double and triple whitespaces
        String st= "This  is   a new code.   ";
        System.out.println("Does it contains double whitespace: "+ st.contains("  ")+ ", Does it contains triple whitespaces"+ st.contains("   "));
        //Program5:
        String str5 = "Dear Harry! "+'\n'+ "This is a" +"\tJava Course.";
        System.out.println(str5);
    }
}
