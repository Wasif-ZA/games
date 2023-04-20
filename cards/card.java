package games.cards;



import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class card {
    int value;
    String suit;
    

    public card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return this.suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String toString() {
        return "card [suit=" + suit + ", value=" + value + "]";
    }

    public static void main(String[] args) {

        // Select 5 random attributes from the array
        // card target = new card(10, "Hearts");
        // System.out.println(TargetedCard(target));
        // generated(5);

        fight();

    }

    public static void generatedv1(int count) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        String[] suits = { "Hearts", "Diamonds", "Spades", "Clubs" };

        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(suits.length);
            String SelectedSuits = suits[randomIndex];
            int Random = random.nextInt(values.length);
            int Selectedvalues = values[Random];
            card card = new card(Selectedvalues, SelectedSuits);
            System.out.println(card.toString());
        }

    }

    public static Set<card> generated(int count) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        String[] suits = { "Hearts", "Diamonds", "Spades", "Clubs", "Joker", "king", "Queen" };
        Random random = new Random();
        Set<card> uniqueCards = new HashSet<>();

        while (uniqueCards.size() < count) {
            int randomSuitIndex = random.nextInt(suits.length);
            String selectedSuit = suits[randomSuitIndex];
            int randomValueIndex = random.nextInt(values.length);
            int selectedValue = values[randomValueIndex];
            card card = new card(selectedValue, selectedSuit);
            uniqueCards.add(card);
        }

        // for (card card : uniqueCards) {
        //     System.out.println(card.toString());
        // }

        return uniqueCards;
    }

    public static String TargetedCard(card target) {
        Set<card> cards = new HashSet<>();
      
        cards = generated(5);
        String result = "Not Found";
        for (card card : cards) {
            if (card.getValue() == target.getValue() && card.getSuit() == target.getSuit()) {
                result = "Found" ;
              
            }
        }
        return result;
    }

   public static void fight() {
    Set<card> team1 = new HashSet<>();
    team1 = generated(5);
    Set<card> team2 = new HashSet<>();
    team2 = generated(5);

    int Spades = 10;
    int Hearts = 15;
    int Diamonds = 20;
    int Clubs = 25;
    int Joker = 30;
    int Queen = 35;
    int king = 40;
   
    int team1Score = 0;
    int team2Score = 0;
    for (card card : team1) {
        if (card.getSuit() == "Spades") {
            team1Score += Spades;
        } else if (card.getSuit() == "Hearts") {
            team1Score += Hearts;
        } else if (card.getSuit() == "Diamonds") {
            team1Score += Diamonds;
        } else if (card.getSuit() == "Clubs") {
            team1Score += Clubs;
        } else if (card.getSuit() == "Joker") {
            team1Score += Joker;
        } else if (card.getSuit() == "Queen") {
            team1Score += Queen;
        } else if (card.getSuit() == "king") {
            team1Score += king;
        }
    }

    for (card card : team2) {
        if (card.getSuit() == "Spades") {
            team2Score += Spades;
        } else if (card.getSuit() == "Hearts") {
            team2Score += Hearts;
        } else if (card.getSuit() == "Diamonds") {
            team2Score += Diamonds;
        } else if (card.getSuit() == "Clubs") {
            team2Score += Clubs;
        } else if (card.getSuit() == "Joker") {
            team2Score += Joker;
        } else if (card.getSuit() == "Queen") {
            team2Score += Queen;
        } else if (card.getSuit() == "king") {
            team2Score += king;
        }
    }

    if (team1Score > team2Score) {
        System.out.println("Team 1 Wins");
    } else if (team1Score < team2Score) {
        System.out.println("Team 2 Wins");
    } else {
        System.out.println("Tie");
    }

   }


   

}
