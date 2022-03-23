package edu.fci.cs102;

import javax.swing.*;
import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1, num2;
        boolean go = true;
        while (go) {
            while (true) {
                String s1 = JOptionPane.showInputDialog(null, "Enter Num 1:");
                try {
                    num1 = Integer.parseInt(s1);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a number");
                }
            }
            while (true) {
                String s1 = JOptionPane.showInputDialog(null, "Enter Num 2:");
                try {
                    num2 = Integer.parseInt(s1);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a number");
                }
            }
            int sum = num1 +num2;
            JOptionPane.showMessageDialog(null, "Sum = "+sum);

        }

    }
}

