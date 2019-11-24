import java.util.ArrayList;
import java.util.Arrays;

public class MasterDeck {
    private ArrayList<Integer> masterDeck = new ArrayList <Integer>(Arrays.asList(1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8)); //This is the custom deck
    int deckLength = masterDeck.size();
    //Core functions to randomly generate numbers and deal the cards to the players
    int random(){
        return (int)(Math.random()*masterDeck.size());
    }
    void remove(){
        int random = random();
        masterDeck.remove(random);
    }
    void remove(int in){
        masterDeck.remove(in);
    }
    int deal(){
        int idx = random();
        int val = masterDeck.get(idx);
        remove(idx);
        return val;
    }

    //Finds the current amount of cards remaining in the deck
    int remaining(){
        int i = masterDeck.size();
        return i;
    }
    void clear(){ //Clears the entire deck
        masterDeck.clear();
    }
} //End of MasterDeck class
