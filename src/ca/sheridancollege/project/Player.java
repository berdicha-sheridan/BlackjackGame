/**
 * SYST 17796 Project 2021
 * File: Player.java
 * 
 * The class that represents players of the game. Child of Dealer class as the
 * dealers functionality is used as a base functionality here.
 * 
 * @author dancye, 2018
 * @author Esteban Rodas Lopez, 2021
 * @author Agampodi De Silva, 2021
 * @author Alexander Berdichevskiy, 2021
 * @author Kyle Strong, 2021
 */

package ca.sheridancollege.project;

public class Player extends Dealer {
    
    private String playerName; //the unique ID for this player
    private int balance;
    private int bet;
    
    public Player() {}
    
    /**
     * A constructor that allows you to set the player's name and the curr game
     * @param name - the player name assigned to this player.
     * @param currGame - current game player is participating in.
     */
    public Player(String name, Game currGame) {
        super(currGame);
        this.playerName = name;
    }
    
    /**
     * A constructor that allows you to set the player's name
     * @param name - the player name assigned to this player.
     */
    public Player(String name) {
        this.playerName = name;
    }
    
    // @return the playerName
    public String getPlayerName() {
        return this.playerName;
    }

    // @param givenName - the player name to be assigned to this player.
    public void setPlayerName(String givenName) {
        this.playerName = givenName;
    }

    public int getBalance() {
       return this.balance; 
    }
    
    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }
    
    public int getBet() {
        return this.bet;
    }
    
    // Reserve the amount from player's balance and record it as a bet
    public void placeBet(int bet) {
       if (bet > getBalance()) {
           this.bet = getBalance();
       } else {
           this.bet = bet;
       }
    }
}
