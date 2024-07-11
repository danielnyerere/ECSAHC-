/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecsa_interview;

/**
 *
 * @author THPS
 */
public class Card {
    private String suit;
    private String rank;

    // Constructor
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getters
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
