/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Nicholas Sullivan, Saturday Febuary, 27, 2021
 * @author Nicholas Sullivan, Tuedsay April, 20, 2021
 */
public class BlackJack {
    
    public static void main (String agrs[]){
        
        Game game1 = new Game("BlackJack");
        System.out.println("Enter your name: ");
        Scanner in = new Scanner (System.in);
        String player = in.nextLine();
        Player player1 = new Player(player);
        System.out.println("\nWelcome "+player1.getName() +"\nLet's get started.\n");
        System.out.println("Rules: Dealer always stands on 17. Aces are only worth 1.");
        System.out.println("Game will start in 5 seconds.");
        game1.gamelogic.delay(5000);
        
        game1.gamelogic.newDealerCard();
        game1.gamelogic.newPlayerCard();
        game1.gamelogic.newPlayerCard();
        game1.gamelogic.printCards();
        game1.gamelogic.winCheck();
        String temp = "h";
        while(game1.gamelogic.PlayerCardValue() < 22 && temp.equals("h")){
            System.out.println("Would you like to hit or stand? (hit = h, stand = s)");
            in = new Scanner (System.in);
            temp = in.nextLine();
            if (temp.equals("h")){
                game1.gamelogic.newPlayerCard();
                game1.gamelogic.printCards();
                game1.gamelogic.winCheck();
            }
            else if(temp.equals("s")){
                while(game1.gamelogic.DealerCardValue() < 17){
                    game1.gamelogic.newDealerCard();
                    game1.gamelogic.printCards();
                }
                game1.gamelogic.winCheck();
                game1.gamelogic.standWinCheck();
            }
        }
        game1.gamelogic.newDealerCard();
        game1.gamelogic.printCards();
        game1.gamelogic.winCheck();
        if(game1.gamelogic.ShouldDealerHit() == true){
            game1.gamelogic.newDealerCard();
            game1.gamelogic.printCards();
            game1.gamelogic.winCheck();
        }
        game1.gamelogic.standWinCheck();
    }
    
    public static boolean checkDealerCardCreation(int CreateCardCall){
        
        Game gameTest = new Game("BlackJack");
        boolean DealerCardCreated = false;
        int tempSize = gameTest.gamelogic.DealersCards.size();
        if (CreateCardCall == 1){
            gameTest.gamelogic.newDealerCard();
        }
        if(tempSize < gameTest.gamelogic.DealersCards.size()){
            DealerCardCreated = true;
        }         
        return DealerCardCreated;
    }
    
    public static boolean checkPlayerCardCreation(int CreateCardCall){
        
        Game gameTest = new Game("BlackJack");
        boolean PlayerCardCreated = false;
        int tempSize = gameTest.gamelogic.PlayerCards.size();
        if (CreateCardCall == 1){
            gameTest.gamelogic.newPlayerCard();
        }
        if(tempSize < gameTest.gamelogic.PlayerCards.size()){
            PlayerCardCreated = true;
        }         
        return PlayerCardCreated;
    }
}
