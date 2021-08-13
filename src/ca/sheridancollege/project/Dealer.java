/**
 * SYST 17796 Project 2021
 * File: Dealer.java
 * 
 * A class to simulate Dealer interactions with the rest of the game.
 * Also serves as the base class for Player as they share most of its functionality.
 * 
 * @author dancye, 2018
 * @author Esteban Rodas Lopez, 2021
 * @author Agampodi De Silva, 2021
 * @author Alexander Berdichevskiy, 2021
 * @author Kyle Strong, 2021
 */

package ca.sheridancollege.project;

import java.util.ArrayList;

public class Dealer {
    
    private Hand hand = new Hand();
    private Game currentGame;
    
    public Dealer() {}
    
    public Dealer(Game currGame) {
        this.currentGame = currGame;
    }

    public Hand getHand() {
        return this.hand;
    }
    
    public void setCurrGame(Game currGame) {
        this.currentGame = currGame;
    }

    // @return cards that the dealer currently holds
    public ArrayList<Card> showCards() {
        return hand.getCards();
    }
   
    public void addCard(Card newCard) {
        this.hand.addCard(newCard);
    }

    public void resetHand() {
        this.hand.setCards(new ArrayList<Card>());
    }

    // Draws a random card from the game deck and adds it to the current hand
    public void hit() {
        hand.addCard(this.currentGame.getDeck().dealCard());
    }
    
}
