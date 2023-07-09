package org.mrdrprof.solutions.chapter7_SD_Arrays;

class DeckOfCards {
  public static void main(String[] args) {
    int[]    deck  = new int[52];
    String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                      "10", "Jack", "Queen", "King"};

    // Initialize cards
    // 0–12  13 Spades
    // 13-25 13 Hearts
    // 26-38 13 Clubs
    // 39-51 13 Diamonds
    for (int i = 0; i < deck.length; i++)
      deck[i] = i;

    // Shuffle the cards
    for (int i = 0; i < deck.length; i++) {
      // Generate an index randomly
      int index = (int) (Math.random() * deck.length);
      int temp  = deck[i];
      deck[i] = deck[index];
      deck[index] = temp;
    }

    // Display the first four cards
    for (int i = 0; i < 4; i++) {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];
      System.out.println("Card number " + deck[i] + ": "
                         + rank + " of " + suit);
    }
  }
}
