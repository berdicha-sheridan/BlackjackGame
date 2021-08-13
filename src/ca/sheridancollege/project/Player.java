/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
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
