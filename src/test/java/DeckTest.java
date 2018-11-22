import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card1;
    Card card2;


    @Before
    public void before() {
        card1 = new Card(SuitType.CLUBS, ValueType.QUEEN);
        card2 = new Card(SuitType.DIAMONDS, ValueType.TEN);
        deck = new Deck();
    }


//pop - 52 cards, 4 types

    @Test
    public void check52Cards() {
        deck.fill();
        assertEquals(52, deck.cards.size());
    }
}


//deck get number of cards
    @Test
    public void hasRemainingNumberOfCards(Card card){
//after deal, check size for 1 less card in arrayList
    deck.fill();
    deck.dealCard(card);
    assertEquals(51, deck.cards.size());
    }



//suffle the 52 cards

// Create an array
//Integer[] array = new Integer[]{1, 2, 3, 4};
//
////int[] array = new int[]{1, 2, 3, 4}; //does not work
//
//    // Shuffle the elements in the array
//    List<Integer> l = Arrays.asList(array);
//System.out.println(l);
//
//        Collections.shuffle(l);
//
//        System.out.println(l);



//deal cards method

//compare/count totals method

//player 1 wins

//plahyer 2 wins
