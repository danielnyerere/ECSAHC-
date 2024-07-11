/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecsa_interview;

/**
 *
 * @author THPS
 */
public class Question1 {
    public static String[] popSnap(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("n must be between 1 and 100 inclusive");
        }

        String[] result = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "PopSnap";
            } else if (i % 3 == 0) {
                result[i - 1] = "Pop";
            } else if (i % 5 == 0) {
                result[i - 1] = "Snap";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 15; // Example input
        String[] output = popSnap(n);
        for (String s : output) {
            System.out.println(s);
        }
    }
}
