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
    
    private String playerID; //the unique ID for this player
    private int balance;
    private int bet;
    
    public Player() {}
    
    /**
     * A constructor that allows you to set the player's unique ID
     * @param id - the unique ID assigned to this player.
     * @param currGame - current game player is participating in.
     */
    public Player(String id, Game currGame) {
        super(currGame);
        this.playerID = id;
    }
    
    // @return the playerID
    public String getPlayerID() {
        return this.playerID;
    }

    // Ensure that the playerID is unique -- TODO not the problem of the player class, handle it in main, when assigning IDs
    // @param givenID - the unique ID to be assigned to this player.
    public void setPlayerID(String givenID) {
        this.playerID = givenID;
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
