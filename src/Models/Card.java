package Models;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jwright
 */
public class Card {
    private String faceName, suit;
    private int faceValue;
    
    private static List<String> validFaces = Arrays.asList("2","3","4","5","6","7",
                                        "8","9","10","Jack","Queen","King","Ace");
    
    private static List<String> validSuits = Arrays.asList("spades","clubs","hearts",
                                                            "diamonds");
    
    /**
     * This is a constructor.  It MUST have the exact same name as your class
     */
    public Card(String face, String suit)
    {
        setFaceName(face);
        setSuit(suit);
        setFaceValue();
    }
    
    /**
     * This method will validate the face name and then set the instance
     * variable
     */
    public void setFaceName(String face)
    {
        if (validFaces.contains(face))
            this.faceName=face;
        else
            throw new IllegalArgumentException("Only valid faces names are: "
                                        +validFaces);
    }
    
    public void setSuit(String suit)
    {
        if (validSuits.contains(suit))
            this.suit=suit;
        else
            throw new IllegalArgumentException("Only valid suits are: "+validSuits);
    }
    
    public void setFaceValue()
    {
        faceValue=validFaces.indexOf(this.faceName)+2;
    }
}
