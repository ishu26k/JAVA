/*
Q1-2: Write a program in java to copy the content of a given file to another file
using :-
    Q1. Character stream
    Q2. Byte stream
 */


import java.io.*;  
import java.util.*;


public class l11q1 {  
    public static void main(String arg[]) throws Exception {  
        Scanner sc = new Scanner(System.in);  
        FileReader fin = new FileReader("f1.txt");  
        FileWriter fout = new FileWriter("f2.txt", true);
        
        int c;  
        while ((c = fin.read()) != -1) {
            fout.write(c);
        }
        
        System.out.println("Copy finish...");  
        fin.close();  
        fout.close();
        sc.close();  
    }  
}