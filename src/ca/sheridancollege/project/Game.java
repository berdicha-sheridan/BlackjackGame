/**
 * SYST 17796 Project 2021
 * File: Game.java
 * 
 * The class that models your game. Simulates game with corresponding objects.
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

public class Game 
{
    // Instance variables
    private final String gameName;  //the title of the game
    private ArrayList<Player> players;  // the players of the game
    private Deck gameDeck;
    private Scanner input = new Scanner(System.in);

    public Game(String gameName, ArrayList<Player> players) {
        this.gameName = gameName;
        this.players = players;
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
    /**
     * @return deck of cards in the current game
     */
    public Deck getDeck()
    {
        return gameDeck;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) 
    {
        this.players = players;
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public void play(ArrayList<Player> players, Dealer dealer) {
        for (Player player : players) {
            player.resetHand();
        }

        System.out.println("Initiating " + this.gameName + "...\n\n\n");

        // Generates deck of cards and shuffles
        this.gameDeck = new Deck(52);
        ArrayList<Card> cards = new ArrayList<Card>();
        for (int i = 0; i < Card.Suit.values().length; i++) { //4 suits
            for (int j = 0; j < 13; j++) { // 13 card values
                cards.add(new Card(Card.CardValue.values()[j], Card.Suit.values()[i])); 
            }
        }
        gameDeck.addCardsToDeck(cards);
        gameDeck.shuffle();

        // Prompts player bets
        System.out.println("Please place bets.");
        for (Player player : players) {
            System.out.print("\n" + player.getPlayerName() + " bet: ");
            player.placeBet(input.nextInt());
        }
        System.out.println("Bets received...\n");

        // Deals cards to players and one to dealer
        System.out.println("Dealing cards to players...");
        for (Player player : players) {
            for (int i = 0; i < 2; i++) {
                player.addCard(gameDeck.dealCard());
            }
        }
        dealer.addCard(gameDeck.dealCard());

        // Iterates through players asking to hit or stay
        for (Player player : players) {
            boolean continuePlay = true;
            while (continuePlay) {
                System.out.println(player.getPlayerName() + "'s cards: " + player.getHand().toString());
                System.out.println(player.getPlayerName() + ", would you like to hit(1) or stay(2)?: ");
                int playerInput = input.nextInt();
                if (playerInput == 1) {
                    player.hit();
                    int playerScore = player.getHand().calcScore();

                    // Breaks out of loop if player score is 21
                    if (playerScore >= 21) {
                        System.out.println(player.getPlayerName() + "'s cards: " + player.getHand().toString());
                        continuePlay = false;
                    }
                } else if (playerInput == 2) {
                   continuePlay = false;
                }
            }
        }

        // Deals cards to dealer while dealer's score is less 17
        dealer.addCard(gameDeck.dealCard());
        while (dealer.getHand().calcScore() < 17) {
            dealer.addCard(gameDeck.dealCard());
        }

        // Determines win or lose + bet payouts for each player
        for (Player player : players) {
            int playerScore = player.getHand().calcScore();
            int dealerScore = dealer.getHand().calcScore();
            if ((playerScore > dealerScore) && (playerScore <= 21)) {
                declareWinner(player, playerScore, dealer, dealerScore);
                payout(player, playerScore, dealerScore);
            } else {
                System.out.println("Player " + player.getPlayerName() +
                        " lost!\nPlayer's hand: " + player.getHand().toString() 
                        + " with a score of " + playerScore + 
                        "\nDealer's hand: " + dealer.getHand().toString() + 
                        " with a score of " + dealerScore);
                payout(player, playerScore, dealerScore);
            }
        }
    };

    public void payout(Player player, int playerScore, int dealerScore) {
        int playerBal = player.getBalance();

        if (player.getHand().getCards().size() == 2 && playerScore == 21) {
            playerBal += (int)(player.getBet() * 0.5);
            player.setBalance(playerBal);
            System.out.println("Balance: $" + playerBal);
        } 
        else if (dealerScore < 21 && playerScore == 21) {
            playerBal += (player.getBet() * 2);
            player.setBalance(playerBal);
            System.out.println("Balance: $" + playerBal);
        } 
        else if (dealerScore < 21 && playerScore > dealerScore && playerScore <= 21) {
            playerBal += player.getBet();
            player.setBalance(playerBal);
            System.out.println("Balance: $" + playerBal);
        } 
        else if (dealerScore == 21 && playerScore == 21) {
            System.out.println("Balance: $" + playerBal);
        } 
        else if (dealerScore == 21 && playerScore != 21) {
            playerBal -= player.getBet();
            player.setBalance(playerBal);
            System.out.println("Balance: $" + playerBal);
        } 
        else if (dealerScore > 21 && playerScore <= 21) {
            playerBal += player.getBet();
            player.setBalance(playerBal);
            System.out.println("Balance: $" + playerBal);
        }
    }
    
    /**
     * Declares winner using the Player's name, hand, score + Dealer's hand, and score
     */
    public void declareWinner(Player player, int playerScore, Dealer dealer, int dealerScore) {
        System.out.println("\nThe player " + player.getPlayerName() + " has won!\nPlayer's hand: "
             + player.getHand().toString() + " with a score of " + playerScore 
             + "\nDealer's hand: " + dealer.getHand().toString() + " with a score of " + dealerScore);
    };
    
}
