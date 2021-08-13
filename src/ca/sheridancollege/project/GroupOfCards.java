/**
 * SYST 17796 Project 2021
 * File: Dealer.java
 * 
 * A concrete class that represents any grouping of cards for a Game.
 * 
 * @author dancye, 2018
 * @author Esteban Rodas Lopez, 2021
 * @author Agampodi De Silva, 2021
 * @author Alexander Berdichevskiy, 2021
 * @author Kyle Strong, 2021
 */

package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <Card> cards;
    Card card;
    private int size;
 
    //the size of the grouping
    
    public GroupOfCards(int givenSize)
    {
        cards = new ArrayList<Card>(size);
        size = givenSize;
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
    public void addCardsToDeck(ArrayList<Card> cards)
    {
        for (Card card : cards) {
            this.cards.add(card);
        }
    } 
}
