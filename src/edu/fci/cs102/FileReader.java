package edu.fci.cs102;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {
        File file = new File("c:\\Files\\nums.txt");
        int sum = 0;
        Scanner input  = null;
        try {
            input = new Scanner(file);
            while (input.hasNextInt()) {
                int s = input.nextInt();
                System.out.println(s);
                sum+=s;
            }
            input.close();
            System.out.println("Sum = "+sum);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

       String s = input.nextLine();
        PrintWriter output  = null;
        try {
            FileWriter file1 = new FileWriter("c:\\Files\\myflie.txt",true);
            output = new PrintWriter(file1);
            output.println(s);
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("I/O Error");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println(s);

    }
}
