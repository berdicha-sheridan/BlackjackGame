/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author senalidesilva
 */
public class Dealer {
    
    private Hand hand;
    private Game currentGame;
    
    public Dealer() {}
    
    public Dealer(Game currGame) {
        this.currentGame = currGame;
    }
    
    public void setCurrGame(Game currGame) {
        this.currentGame = currGame;
    }
    
    // @return cards that the dealer currently holds
    public ArrayList<Card> showCards() {
        return hand.getCards();
    }
   
    // Draws a random card from the game deck and adds it to the current hand
    public void hit() {
        hand.addCard(currentGame.getDeck().dealCard());
    }
    
}
