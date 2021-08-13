/**
 * SYST 17796 Project 2021
 * File: Main.java
 * 
 * Main class to handle initialization of the game and setting up players.
 * 
 * @author dancye, 2018
 * @author Esteban Rodas Lopez, 2021
 * @author Agampodi De Silva, 2021
 * @author Alexander Berdichevskiy, 2021
 * @author Kyle Strong, 2021
 */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

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
            Game newGame = new Game("Blackjack", players);  
            
            for (int i = 0; i < players.size(); i++) {
                players.get(i).setCurrGame(newGame);
            }
            dealer.setCurrGame(newGame);
            
            newGame.play(players, dealer);

            System.out.println("Do you want to play another round?");
            System.out.println("Enter 1 for yes, 0 for no.");
            continueOrNo = sc.nextInt();
            sc.nextLine(); // Sanitize newline
        } while( continueOrNo == 1);
    }
}
