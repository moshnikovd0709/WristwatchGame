import cardUtils.Card;
import cardUtils.CardSuit;
import cardUtils.CardValue;

import java.util.*;

public class Distribution {
    private final List<Card> cardsDistribution;


    public Distribution() {
        this.cardsDistribution = fillCardDistribution();
    }

    public LinkedList<Card> buildDeck() {
        LinkedList<Card> deck = new LinkedList<>();
        while (!cardsDistribution.isEmpty()) {
            int rnd = (int) (Math.random() * cardsDistribution.size());
            deck.add(cardsDistribution.get(rnd));
            cardsDistribution.remove(rnd);
        }
        return deck;
    }

    public List<Card> fillCardDistribution() {
        List<Card> cardsDistribution = new ArrayList<>();
        cardsDistribution.add(new Card(CardValue.TWO, CardSuit.DIAMONDS));
        cardsDistribution.add(new Card(CardValue.TWO, CardSuit.HEARTS));
        cardsDistribution.add(new Card(CardValue.TWO, CardSuit.CLUBS));
        cardsDistribution.add(new Card(CardValue.TWO, CardSuit.SPADES));
        cardsDistribution.add(new Card(CardValue.THREE, CardSuit.DIAMONDS));
        cardsDistribution.add(new Card(CardValue.THREE, CardSuit.HEARTS));
        cardsDistribution.add(new Card(CardValue.THREE, CardSuit.CLUBS));
        cardsDistribution.add(new Card(CardValue.THREE, CardSuit.SPADES));
        cardsDistribution.add(new Card(CardValue.FOUR, CardSuit.DIAMONDS));
        cardsDistribution.add(new Card(CardValue.FOUR, CardSuit.HEARTS));
        cardsDistribution.add(new Card(CardValue.FOUR, CardSuit.CLUBS));
        cardsDistribution.add(new Card(CardValue.FOUR, CardSuit.SPADES));
        cardsDistribution.add(new Card(CardValue.FIVE, CardSuit.DIAMONDS));
        cardsDistribution.add(new Card(CardValue.FIVE, CardSuit.HEARTS));
        cardsDistribution.add(new Card(CardValue.FIVE, CardSuit.CLUBS));
        cardsDistribution.add(new Card(CardValue.FIVE, CardSuit.SPADES));
        cardsDistribution.add(new Card(CardValue.SIX, CardSuit.DIAMONDS));
        cardsDistribution.add(new Card(CardValue.SIX, CardSuit.HEARTS));
        cardsDistribution.add(new Card(CardValue.SIX, CardSuit.CLUBS));
        cardsDistribution.add(new Card(CardValue.SIX, CardSuit.SPADES));
        cardsDistribution.add(new Card(CardValue.SEVEN, CardSuit.DIAMONDS));
        cardsDistribution.add(new Card(CardValue.SEVEN, CardSuit.HEARTS));
        cardsDistribution.add(new Card(CardValue.SEVEN, CardSuit.CLUBS));
        cardsDistribution.add(new Card(CardValue.SEVEN, CardSuit.SPADES));
        cardsDistribution.add(new Card(CardValue.EIGHT, CardSuit.DIAMONDS));
        cardsDistribution.add(new Card(CardValue.EIGHT, CardSuit.HEARTS));
        cardsDistribution.add(new Card(CardValue.EIGHT, CardSuit.CLUBS));
        cardsDistribution.add(new Card(CardValue.EIGHT, CardSuit.SPADES));
        cardsDistribution.add(new Card(CardValue.NINE, CardSuit.DIAMONDS));
        cardsDistribution.add(new Card(CardValue.NINE, CardSuit.HEARTS));
        cardsDistribution.add(new Card(CardValue.NINE, CardSuit.CLUBS));
        cardsDistribution.add(new Card(CardValue.NINE, CardSuit.SPADES));
        cardsDistribution.add(new Card(CardValue.TEN, CardSuit.DIAMONDS));
        cardsDistribution.add(new Card(CardValue.TEN, CardSuit.HEARTS));
        cardsDistribution.add(new Card(CardValue.TEN, CardSuit.CLUBS));
        cardsDistribution.add(new Card(CardValue.TEN, CardSuit.SPADES));
        cardsDistribution.add(new Card(CardValue.JACK, CardSuit.DIAMONDS));
        cardsDistribution.add(new Card(CardValue.JACK, CardSuit.HEARTS));
        cardsDistribution.add(new Card(CardValue.JACK, CardSuit.CLUBS));
        cardsDistribution.add(new Card(CardValue.JACK, CardSuit.SPADES));
        cardsDistribution.add(new Card(CardValue.QUEEN, CardSuit.DIAMONDS));
        cardsDistribution.add(new Card(CardValue.QUEEN, CardSuit.HEARTS));
        cardsDistribution.add(new Card(CardValue.QUEEN, CardSuit.CLUBS));
        cardsDistribution.add(new Card(CardValue.QUEEN, CardSuit.SPADES));
        cardsDistribution.add(new Card(CardValue.KING, CardSuit.DIAMONDS));
        cardsDistribution.add(new Card(CardValue.KING, CardSuit.HEARTS));
        cardsDistribution.add(new Card(CardValue.KING, CardSuit.CLUBS));
        cardsDistribution.add(new Card(CardValue.KING, CardSuit.SPADES));
        cardsDistribution.add(new Card(CardValue.ACE, CardSuit.DIAMONDS));
        cardsDistribution.add(new Card(CardValue.ACE, CardSuit.HEARTS));
        cardsDistribution.add(new Card(CardValue.ACE, CardSuit.CLUBS));
        cardsDistribution.add(new Card(CardValue.ACE, CardSuit.SPADES));
        return cardsDistribution;
    }
}
