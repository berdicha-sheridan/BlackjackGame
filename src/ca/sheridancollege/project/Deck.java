/**
 * SYST 17796 Project 2021
 * File: Deck.java
 * 
 * A class to represent the card Deck. A child class of GroupOfCards.
 * 
 * @author dancye, 2018
 * @author Esteban Rodas Lopez, 2021
 * @author Agampodi De Silva, 2021
 * @author Alexander Berdichevskiy, 2021
 * @author Kyle Strong, 2021
 */

package ca.sheridancollege.project;

class Deck extends GroupOfCards {
    
    public Deck(int givenSize) {
        super(givenSize);
    }
    
    public void shuffle(){
        super.shuffle();
    }
    
    public Card dealCard() {
        return showCards().remove((int) (Math.random() * showCards().size()));
    }
    
}
