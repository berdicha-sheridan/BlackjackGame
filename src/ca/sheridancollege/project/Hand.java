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
public class Hand extends GroupOfCards{
    
    private ArrayList <Card> cards;
    
    
    public Hand(int givenSize) {
        super(givenSize);
    }
    
    //get hand cards
    public ArrayList <Card> getCards()
    {
        return super.showCards();
       
    }

    
    
    
}