/**
 * SYST 17796 Project 2021
 * File: Hand.java
 * 
 * The class that models a hand of cards.
 * 
 * @author dancye, 2018
 * @author Esteban Rodas Lopez, 2021
 * @author Agampodi De Silva, 2021
 * @author Alexander Berdichevskiy, 2021
 * @author Kyle Strong, 2021
 */

package ca.sheridancollege.project;

import java.util.ArrayList;

public class Hand {

    final int scoreGoal = 21;   // Constant for score goal
    private ArrayList<Card> cards = new ArrayList<Card>();

    /**
     * 
     * @return list of cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * 
     * @param cards
     */
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    
    /**
     * 
     * @param newCard
     */
    public void addCard(Card newCard) {
        this.cards.add(newCard);
    }
    
    /**
     * 
     * @return
     */
    public int calcScore() {
        int score = 0;
        boolean hasAce = false;
        int aceCount = 0;

        // Loops through Cards to calc score accounting for player-chosen ace value
        for (Card card : cards) {
            switch (card.getValue()) {
                case ACE:
                    hasAce = true;
                    aceCount++;
                    break;
                case TWO:
                    score += 2;
                    break;
                case THREE:
                    score += 3;
                    break;
                case FOUR:
                    score += 4;
                    break;
                case FIVE:
                    score += 5;
                    break;
                case SIX:
                    score += 6;
                    break;
                case SEVEN:
                    score += 7;
                    break;
                case EIGHT:
                    score += 8;
                    break;
                case NINE:
                    score += 9;
                    break;
                case TEN:
                    score += 10;
                    break;
                case JACK:
                    score += 10;
                    break;
                case QUEEN:
                    score += 10;
                    break;
                case KING:
                    score += 10;
                    break;
                default:
                    break;
            }
        }

        if (score > scoreGoal && hasAce) {
            for (int i = 0; i < aceCount; i++) {
                score += 1;
            }
        } else {
            for (int i = 0; i < aceCount; i++) {
                score += 11;
            }
        }

        return score;
    }
    
    @Override
    public String toString() {
        String handString = "";
        for (Card card : this.cards) {
            handString += card.toString() + " ";
        }
        return handString;
    }
}
