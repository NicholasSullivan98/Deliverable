/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.Random;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Nicholas Sullivan, Satuday Febuary, 27, 2021
 */
public class GroupOfCards {

    Card[] cards = new Card [52];
    
    public GroupOfCards(){
        init();
    }
    
    private void init(){
        int i = 0;
        for (Suit s: Suit.values())
            for(Rank r: Rank.values())
                this.cards[i++] = new Card(r, s);
    }
    
    public Card pickCard(){
        Random random = new Random();
        int index = random.nextInt(52);
        System.out.println(index);
        System.out.println(this.cards[index]);
        return this.cards[index];
    }
    
    public String shortString(Card c){
        return c.shortString();
               
    }

}//end class
