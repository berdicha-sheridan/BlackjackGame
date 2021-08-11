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
public abstract class Player
{
    private String playerID; //the unique ID for this player
    private int balance;
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     * 
     */
    public Player(String id)
    {
        this.playerID= id;
    }
    
    /**
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return this.playerID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) 
    {
        playerID = givenID;
    }
    
    //get user balance
    public int getBalance()
    {
       return this.balance; 
    }
    
    //setting user balance
    public void setBalance(int newBalance)
    {
        this.balance=newBalance;
    }
    
    //placing user bet
    public void placeBet(int bet)
    {
       //need coding
    }
    
    /**
     * The method to be instantiated when you subclass the Player class
     * with your specific type of Player and filled in with logic to play your game.
     */
    public abstract void play();
    
}
