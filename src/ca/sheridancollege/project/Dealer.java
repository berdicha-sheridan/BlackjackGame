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
    
    private ArrayList <Hand> hand;
    
    public ArrayList<Hand> showCards()
    {
        return hand;
    }
   
    //not sure if this is correct, please check 
    public void hit(ArrayList<Hand> newCard)
    {
        this.hand =newCard;
    }
    
}
