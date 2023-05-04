package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    
    public static void main(String[] args) {
        
        final int CARD_MAXNUMBER = 13;
        final String[] SUITS = {"SPADES", "HEARTS", "CLUBS", "DIAMONDS"};

        List<String> cards = new ArrayList<>();

        for (int i = 0; i < CARD_MAXNUMBER; i++) {
            for (int j = 0; i < SUITS.length; j++) {
                switch (i) {
                    case 11:
                        cards.add("JACK OF " + SUITS[j]);
                        break;
                    case 12:
                        cards.add("QUEEN OF " + SUITS[j]);
                        break;
                    case 13:
                        cards.add("KING OF " + SUITS[j]);
                        break;
                    case 1:
                        cards.add("ACE OF " + SUITS[j]);
                        break;
                    default:
                        cards.add(i + " OF " + SUITS[j]);
                        break;
                }
            }
        }
    }
}
