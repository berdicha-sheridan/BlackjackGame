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
public class groupsOfCards {
    
    public ArrayList<String> cards = new ArrayList<>();
    public static int size;
    Card card = new Card();
    
    public groupsOfCards(int size)
    {
        size = 52;
    }
    
    public void addCardsToDeck()
    {
        for(int i = 0; i<=52; i++)
        {
            cards.add(card);
        }
    }
    
    
    
}
