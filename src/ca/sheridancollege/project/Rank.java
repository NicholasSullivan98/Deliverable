/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author nicho
 */
public enum Rank {

    ACE(1,"Ace","A"),
    TWO(2,"Two","2"),
    THREE(3,"Three","3"),
    FOUR(4,"Four","4"),
    FIVE(5,"Five","5"),
    SIX(6,"Six","6"),
    SEVEN(7,"Seven","7"),
    EIGHT(8,"Eight","8"),
    NINE(9,"Nine","9"),
    TEN(10,"Ten","T"),
    JACK(11,"Jack","J"),
    QUEEN(12,"Queen","Q"),
    KING(13,"King","K");
    
    private String displayName;
    private double value;
    private String shortName;
    
    public String getDisplayName(){
        return displayName;
    }
    public double getValue(){
        return value;
    }
    public String getShortName(){
        return shortName;
    }
    
    private Rank(double value, String displayName, String shortName){
        this.displayName = displayName;
        this.value = value;
        this.shortName = shortName;
    }
}
