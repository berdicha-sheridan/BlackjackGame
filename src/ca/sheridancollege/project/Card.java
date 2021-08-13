/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 * @author rlesteban, 2021
 */
public class Card {

    public enum Suit {
        HEARTS,
        DIAMONDS,
        CLUBS,
        SPADES
    };

    public enum CardValue {
        ACE (11),
        TWO (2),
        THREE (3),
        FOUR (4),
        FIVE (5),
        SIX (6),
        SEVEN (7),
        EIGHT (8),
        NINE (9),
        TEN (10),
        JACK (10),
        QUEEN (10),
        KING (10);

        private int cardValue;

        private CardValue (int cardValue) {
            this.cardValue = cardValue;
        }

        public int getCardValue() {
            return cardValue;
        }
    };
    
    private CardValue value;
    private Suit suit;

    public Card(CardValue value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public CardValue getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override 
    public String toString() {
        return this.value + " of " + this.suit;
    };
    
}
