package games.cards;



import java.util.HashSet;
import java.util.Set;

public class player {
    int score;
    String name;
    Set<card> hand;

    public Set<card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    public void setHand(Set<card> hand) {
        this.hand = hand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public player(String name, Set<card> hand2, int score) {
        this.name = name;
        this.hand = hand2;
        this.score = score;
    }

    public String toString() {
        return "Player: " + this.name + " Score: " + this.score + " Hand: " + this.hand;
    }

    public static void main(String[] args) {
        Set<card> hand = new HashSet<>();
        hand = card.generated(5);
        player player1 = new player("jac", hand, 5);
        System.out.println(player1.toString());
    }
}
