import java.util.ArrayList;

public class Player {
    //Every player has the following properties: name (String), hand of cards (ArrayList), a status of targetability (boolean), and a real/AI player status (boolean)
    private String nameP;
    private ArrayList<Integer> handP;
    private boolean targetable = true;
    private boolean isPlayer;

    //Player enters their name - from buffered reader, and also get a new hand or AI get their name randomly generated and also get a new hand, and also get assigned a real/AI player status
    Player(String Name, boolean player){
        nameP = Name;
        handP = new ArrayList <Integer>();
        isPlayer = player;
    }

    //Returns the string value instead of the address of the object.
    public String toString(){
        return nameP;
    }

    //Adds the randomly gen'd card to player's hand
    void dealTo(int add){
        handP.add(add);
    }

    //Finds the amount of cards in the player's hand
    int numCards(){
        int siz = handP.size();
        return siz;
    }

    //Returns the value of the card that the player has at a certain index
    int cardDisplay(int n){
        int nTh = handP.get(n);
        return nTh;
    }

    //Uses up the player's card by discarding it
    void useCard(int i){
        handP.remove(i);
    }

    //Makes the player targetable once again (on start of their turn)
    void targetable(){
        targetable = true;
    }

    //Returns the player's targetability status
    boolean target(){
        return targetable;
    }

    //Makes the player not targetable
    void handmaid(){
        targetable = false;
    }

    //Returns player's real/AI player status
    boolean isPlayer(){
        return isPlayer;
    }
} //End of Player class