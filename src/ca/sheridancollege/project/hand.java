/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package del3;

import java.util.ArrayList;

/**
 *
 * @author kyle
 */
public class hand extends groupsOfCards{
    
     
     int score;

    public hand(int size) {
        super(size);
    }
    
    
    public int calcScore(ArrayList<String>cards)
    {
        for(int i=0; i<cards.size(); i++)
        {
            
        }
        
    
    
    
    }
    
    public void setCards()
    {
        
        this.cards = cards;
    }
    
    public ArrayList<String> getCards (ArrayList<String>cards)
    {
       return cards;
    }
    
    public void showCards(ArrayList<String>cards)
    {
        for(int i=0; i<cards.size(); i++)
        System.out.println(cards.indexOf(i));
    }
    
    public void returnCards(ArrayList<String>cards, ArrayList<String>card)
    {
        // remove players cards
        // reset array list 
        

        cards.clear(); // remove players cards
        card.clear();
        
        
    }
    
}
