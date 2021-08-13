/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author senalidesilva
 */
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
