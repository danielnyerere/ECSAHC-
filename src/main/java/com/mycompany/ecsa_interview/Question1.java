/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecsa_interview;

import java.util.Arrays;

/**
 *
 * @author THPS
 */
public class Question1 {
   public static String[] popSnap(int n) {
        // Validate the input to be within the constraints 1 <= n <= 100
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
        // Test with n = 3
        int n1 = 3;
        String[] output1 = popSnap(n1);
        System.out.println("Input: n = " + n1);
        System.out.println("Output: " + Arrays.toString(output1));

        // Test with n = 5
        int n2 = 5;
        String[] output2 = popSnap(n2);
        System.out.println("Input: n = " + n2);
        System.out.println("Output: " + Arrays.toString(output2));

        // Test with n = 15
        int n3 = 15;
        String[] output3 = popSnap(n3);
        System.out.println("Input: n = " + n3);
        System.out.println("Output: " + Arrays.toString(output3));
    }
}
