package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jwright
 */
public class DeckOfCards {
    private ArrayList<Card> deck;
    
    public DeckOfCards()
    {
        deck = new ArrayList<>();
        //loop over the valid face names and suits to create Card
        //objects
        List<String> validFaces = Card.getValidFaces();
        List<String> validSuits = Card.getValidSuits();
        
        for (String suit : validSuits){
            for (String faceName : validFaces)
            {
                Card newCard = new Card(faceName, suit);
                deck.add(newCard);
            }
        }
    }
    
    public String toString()
    {
        StringBuilder deckString = new StringBuilder();
        for (Card card:deck)
        {
            deckString.append(card + "\n");
        }
        
        return deckString.toString();
    }
}
