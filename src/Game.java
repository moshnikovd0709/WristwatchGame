import cardUtils.Card;
import cardUtils.CardValue;

import java.util.*;

public class Game {
    private final Map<Integer, List<Card>> wristwatchMap;
    private final Set<Integer> correspondingPositions;
    private final LinkedList<Card> cardDeck;

    private final Map<Integer, CardValue> correspondingMap;

    private final int wristwatchSize;

    public Game(Map<Integer, List<Card>> wristwatchMap,
                Set<Integer> correspondingPositions,
                LinkedList<Card> cardDeck,
                int wristwatchSize,
                Map<Integer, CardValue> correspondingMap) {
        this.wristwatchMap = wristwatchMap;
        this.correspondingPositions = correspondingPositions;
        this.cardDeck = cardDeck;
        this.wristwatchSize = wristwatchSize;
        this.correspondingMap = correspondingMap;
    }

    public boolean play() {
        while (!isEnd()) {
            for (int i = 1; i <= wristwatchSize; i++) {
                if (!correspondingPositions.contains(i)) {
                    if (isEnd()) {
                        break;
                    }
                    Card card = cardDeck.poll();
                    assert card != null;
                    if (correspondingMap.get(i).equals(card.cardValue())) {
                        correspondingPositions.add(i);
                        for (int k = wristwatchMap.get(i).size() - 1; k >= 0; k--) {
                            cardDeck.add(wristwatchMap.get(i).get(k));
                        }
                        wristwatchMap.put(i, new LinkedList<>());
                    }
                    wristwatchMap.get(i).add(card);
                }
            }
        }
        return isWin();
    }

    private boolean isEnd() {
        return cardDeck.isEmpty() || isWin();
    }

    private boolean isWin() {
        return correspondingPositions.size() == wristwatchSize;
    }


}
