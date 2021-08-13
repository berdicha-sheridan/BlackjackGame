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
 * @author rlesteban, 2021
 */
public class Hand {

    final int scoreGoal = 21;
    private ArrayList<Card> cards;

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    
    public void addCard(Card newCard) {
        this.cards.add(newCard);
    }
    
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
}
