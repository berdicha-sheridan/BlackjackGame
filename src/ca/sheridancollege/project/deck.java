/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package del3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author kyle
 */
public class deck extends groupsOfCards{

    
    private ArrayList<String> cards = new ArrayList<String>();
    
    public deck(int size) {
        super(size);
    }
    
    public static void shuffle(int card[])
    {
          
        Random rand = new Random();
          
        for (int i = 0; i < size; i++)
        {
           
            int r = i + rand.nextInt(52 - i);
             
             int temp = card[r];
             card[r] = card[i];
             card[i] = temp;
               
        }
    }
    
 
    public void dealCard()
        {
               
        }
            
}
    }
    
    
    
    
}
