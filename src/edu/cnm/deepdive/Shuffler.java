package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Shuffler {


  public static void main(String[] args) {

    Integer[] deck = new Integer[52];

    for (int i = 0; i < deck.length; i++){
      deck[i] = i +1;
    }
System.out.println(Arrays.toString(deck));
    shuffle(deck);
    System.out.println(Arrays.toString(deck));
  }

  private static void shuffle(Integer[] deck) {
    Random rng = new Random();
    Integer [] newDeck = new Integer[52];
    ArrayList <Integer> deckList = new ArrayList<Integer>(Arrays.asList(deck));
    for (int i = 0; i < deck.length; i++) {
      newDeck[i] = deckList.remove(rng.nextInt(deckList.size()));
    }

    System.arraycopy(newDeck, 0, deck, 0, deck.length);
  }


}
