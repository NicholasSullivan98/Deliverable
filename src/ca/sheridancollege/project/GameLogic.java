/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Nicholas Sullivan, Saturday Febuary, 27, 2021
 */
public class GameLogic {
    
    GroupOfCards group1 = new GroupOfCards();
    ArrayList <Card> DealersCards = new ArrayList<Card>();
    ArrayList <Card> PlayerCards = new ArrayList<Card>();
    
    public void newPlayerCard(){
        Card playerCard = group1.pickCard();
        PlayerCards.add(playerCard);
    }
    
    public void newDealerCard(){
        Card dealerCard = group1.pickCard();
        DealersCards.add(dealerCard);
    }
        
    public void printCards(){
        System.out.println("Dealers Cards: ");
        for(int i = 0; i < DealersCards.size(); i++){
            System.out.println(DealersCards.get(i).shortString());
        }
        System.out.println("Players Cards: ");
        for(int i = 0; i < PlayerCards.size(); i++){
            System.out.println(PlayerCards.get(i).shortString());
        }
    }
    
    public void winCheck(){
        if(PlayerCardValue() == 21){
            GameOver("Player Wins");
        }
        else if(PlayerCardValue() > 21){
            GameOver("Dealer Wins");
        }
        if(DealerCardValue() == 21){
            GameOver("Dealer Wins");
        }
        else if(DealerCardValue() > 21){
            GameOver("Player Wins");
        }
        else if (DealerCardValue() == 17)
            GameOver("Player Wins");
        else if (DealerCardValue() == PlayerCardValue()){
            GameOver("It's a tie");
        }
    }
    public boolean ShouldDealerHit(){
        if(DealerCardValue() < 17){
            return true;
        }
        else
            return false;
    }
    
    public void standWinCheck(){
        if(DealerCardValue() > PlayerCardValue() && DealerCardValue() < 22){
            GameOver("Dealer Wins");
        }
        else
            GameOver("Player Wins");
    }
    
    public int DealerCardValue(){
        int temp= 0;
        for(int i = 0; i < DealersCards.size(); i++){
            temp += DealersCards.get(i).getRank().getValue();
        }
        return(temp);
    }
    
    public int PlayerCardValue(){
        int temp2= 0;
        for(int i = 0; i < PlayerCards.size(); i++){
            temp2 += PlayerCards.get(i).getRank().getValue();
        }
        return temp2;
    }
    
    public void GameOver(String winner){
        System.out.println(winner);
        System.out.println("Game Over. Run again to play again.");
        System.exit(1);
    }
    
    public static void delay (int millisecs)  // Delay Method
    {
	try
	{
	    Thread.currentThread ().sleep (millisecs);
	}

	catch (InterruptedException e)
	{
	}
    }
}
