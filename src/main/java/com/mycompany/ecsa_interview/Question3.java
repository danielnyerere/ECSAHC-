/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecsa_interview;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THPS
 */
public class Question3 {
    public static List<Integer> flatten(Object[] array) {
        List<Integer> result = new ArrayList<>();
        flattenHelper(array, result);
        return result;
    }

    private static void flattenHelper(Object[] array, List<Integer> result) {
        for (Object element : array) {
            if (element instanceof Object[]) {
                flattenHelper((Object[]) element, result);
            } else if (element instanceof Integer) {
                result.add((Integer) element);
            }
        }
    }

    
    public static void main(String[] args) {
        Object[] array = {1, new Object[]{2, 3}, new Object[]{new Object[]{4}, new Object[]{5}}};
        List<Integer> flatArray = flatten(array);
        System.out.println(flatArray);  // Output: [1, 2, 3, 4, 5]
    }
}
