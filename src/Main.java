import cardUtils.Card;
import cardUtils.CardValue;

import java.util.*;

public class Main {
    private static final int amountGames = 1000000;

    public static void main(String[] args) {
        int amountWins = 0;
        int amountLose = 0;
        for (int k = 0; k < amountGames; k++) {
            Distribution distribution = new Distribution();
            LinkedList<Card> cardDeck = distribution.buildDeck();
            Map<Integer, List<Card>> wristwatchMap = fillWristwatchMap();
            Map<Integer, CardValue> correspondingMap = fillCorrespondingMap();
            Game game = new Game(wristwatchMap,
                    new HashSet<>(),
                    cardDeck,
                    13,
                    correspondingMap
            );
            if (game.play()) {
                amountWins++;
            } else {
                amountLose++;
            }
        }
        System.out.println("amount Total: " + amountGames);
        System.out.println("amount Wins: " + amountWins);
        System.out.println("amount Lose: " + amountLose);
        System.out.println("rtp: " + (double) amountWins / amountGames);
    }

    private static Map<Integer, CardValue> fillCorrespondingMap() {
        Map<Integer, CardValue> correspondingMap = new HashMap<>();
        correspondingMap.put(1, CardValue.ACE);
        correspondingMap.put(2, CardValue.TWO);
        correspondingMap.put(3, CardValue.THREE);
        correspondingMap.put(4, CardValue.FOUR);
        correspondingMap.put(5, CardValue.FIVE);
        correspondingMap.put(6, CardValue.SIX);
        correspondingMap.put(7, CardValue.SEVEN);
        correspondingMap.put(8, CardValue.EIGHT);
        correspondingMap.put(9, CardValue.NINE);
        correspondingMap.put(10, CardValue.TEN);
        correspondingMap.put(11, CardValue.JACK);
        correspondingMap.put(12, CardValue.QUEEN);
        correspondingMap.put(13, CardValue.KING);
        return correspondingMap;
    }

    private static Map<Integer, List<Card>> fillWristwatchMap() {
        Map<Integer, List<Card>> wristwatchMap = new HashMap<>();
        for (int i = 1; i < 14; i++) {
            wristwatchMap.put(i, new LinkedList<>());
        }
        return wristwatchMap;
    }
}