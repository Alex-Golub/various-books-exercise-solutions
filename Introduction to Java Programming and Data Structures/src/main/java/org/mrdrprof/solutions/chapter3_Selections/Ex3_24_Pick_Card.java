package org.mrdrprof.solutions.chapter3_Selections;

/**
 * **3.24 (Game: pick a card)
 * Write a program that simulates picking a card from a deck of 52 cards.
 * <p>
 * Created by ag on 28-Oct-20 11:55 AM
 */
class Ex3_24_Pick_Card {
  public static void main (String[] args) {
    for (int i = 0; i <= 20; i++) { // Pick random card 20 times
      int rnd  = 100 + (int) (Math.random() * 900); // [100, 999]
      int rank = 1 + rnd / 10 % 13;                 // 1 + [0, 12] => [1, 13]
      int suit = 1 + rnd % 10 % 4;                  // 1 + [0, 3] => [1, 4]

      System.out.print(rnd + " : rank: " + rank + " : suit: " + suit + " =>\t");

      String card = "";
      switch (rank) {
        case 1:  card = "Ace of ";   break;
        case 11: card = "Jack of ";  break;
        case 12: card = "Queen of "; break;
        case 13: card = "King of ";  break;
        default:
          card = rank + " of ";
      }

      switch (suit) {
        case 1: card += "Clubs"; break;
        case 2: card += "Diamonds"; break;
        case 3: card += "Hearts"; break;
        case 4: card += "Spades"; break;
      }

      System.out.println("The card you picked is " + card);
    }
  }
}
