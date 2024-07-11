/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecsa_interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author THPS
 */
public class Answer2 {
    public static int sumIntegersFromFile(String filename) {
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    sum += Integer.parseInt(line.trim());
                } catch (NumberFormatException e) {
                    System.err.println("Ignoring non-integer line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        String filename = "C:\\Users\\THPS\\Documents\\NetBeansProjects\\ECSA_Interview\\src\\main\\java\\com\\mycompany\\ecsa_interview\\numbers.txt"; // Ensure this file exists in the same directory as the script
        int result = sumIntegersFromFile(filename);
        System.out.println("The sum of integers in the file is: " + result);
    }
}
