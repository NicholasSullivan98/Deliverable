/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Nicholas Sullivan, Satuday Febuary, 27, 2021
 */
public enum Suit {
    
    CLUBS(1,"Clubs", '\u2663'),
    DIAMONDS(2, "Diamonds", '\u2662'),
    HEARTS(3, "Hearts", '\u2661'),
    SPADES(4, "Spades", '\u2660');
    
    private String displayName;
    private int value;
    private char unicodeValue;
    //we can have a getter but there is no setter for enum
    public String getDisplayName(){
        return displayName;
    }
    public int getValue(){
        return value;
    }
    public char getUnicodeValue(){
        return unicodeValue;
    }
    
    private Suit(int value, String displayName, char unicodeValue){
        this.displayName = displayName;
        this.value = value;
        this.unicodeValue = unicodeValue;
    }
}