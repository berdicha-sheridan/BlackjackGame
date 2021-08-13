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
 * @author senalidesilva
 */
public class Main {
    
    public static void main(String[] args) {
       
        final int INITIAL_BALANCE = 100; 
        int continueOrNo;
        Scanner sc = new Scanner (System.in);
          
        System.out.print("Please enter number of players: ");
        int numOfPlayers = sc.nextInt();
        sc.nextLine(); // Sanitize newline
        ArrayList<Player> players = new ArrayList<Player>(numOfPlayers);
        Dealer dealer = new Dealer();

        System.out.println("Each player's initial balance is: " + INITIAL_BALANCE);
        //creating player objects and placing inital amount
        for (int i = 0; i < numOfPlayers; i++){
            System.out.print("Player " + (i+1) + " name: ");
            String playerName = sc.nextLine();
            Player player = new Player(playerName);
            player.setBalance(INITIAL_BALANCE);
            players.add(player);
        }

        do {
            Game newGame = new Game();  
            newGame.setPlayers(players);
            newGame.setDealer(dealer);
            
            for (int i = 0; i < players.size(); i++) {
                players.get(0).setCurrGame(newGame);
            }
            dealer.setCurrGame(newGame);

            System.out.println("Do you want to play another round?");
            System.out.println("Enter 1 for yes, 0 for no.");
            continueOrNo = sc.nextInt();
            sc.nextLine(); // Sanitize newline
        } while( continueOrNo == 1);
        
    }
    
}
