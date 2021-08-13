/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author senalidesilva
 */
public class gamePlay // TODO camel case name
{
    public static void main(String[] args)
    { // Inconsistent { positioning, see line 28?
       final int FIXED = 100; // TODO rename to starting capital or starting money?
       int bet = 0;
       int hitOrStay;
        System.out.println("Please enter number of players");
        Scanner num = new Scanner(System.in);
        int numOfPlayers = num.nextInt(); // TODO sanitize the newline?
        Player[] players = new Player[numOfPlayers];
        
        System.out.println("Each player's initial total is: " + FIXED);
        //creating player objects and placing inital amount
        for (int c=0; c < numOfPlayers; c++) {
            String playerID = "player" + c;
            players[c].setPlayerID(playerID); 
            players[c].setBalance(FIXED); // TODO attach a game instance to each player as well
           
            //need to assign cards for each user
            
        }
        
        //placing user bets and checking if player has an Ace card, if yes, need to choose between 1 or 11
        for (int c=0; c < numOfPlayers; c++) {
            System.out.println("Place bet player " + c + ": ");
            
            players[c].placeBet(bet);
            //check if user has Ace--> Request user to choose from 1 or 1
        
            System.out.println("Enter 1 for hit, 2 for stay");
        
            //hit or stay for each user
            System.out.print("Player " + c + " choice: ");
            Scanner input = new Scanner (System.in);
            hitOrStay = input.nextInt();
            if (hitOrStay == 1) {
              players[c].hit();  //methods not made yet
            } else if (hitOrStay == 2) {
                players[c].stay(); //methods not made yet
            }
            //show dealer's second card and total >16, check if dealer hits/stays
            
            if (players[c].calcScore() > 21) { //calc Score method not made
                players[c].setBalance(players[c].getBalance()-bet);
            } else if (players[c].calcScore()<= 21) {
                //compare with dealer total
            }
        
        }
        
    }
    
}
