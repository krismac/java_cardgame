import java.util.ArrayList;

public class Deck {

    public ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

//    public newDeck(){
//    cards = new Deck[52];
//}//
//card.getSuit
    //card.getValue


    public void fill() {
        for (SuitType s : SuitType.values()) {
            for (ValueType v : ValueType.values()) {
                Card card = new Card(s, v);
                this.cards.add(card);
            }
        }
    }

    public void dealCard(Card card) {
        this.cards.remove(card);
    }

}