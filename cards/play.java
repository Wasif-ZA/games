package cards;



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class play {
    String team;
    int score;
    Set<card> hand;
    player player;

    public play(String team, int score, Set<card> hand, player player) {
        this.team = team;
        this.score = score;
        this.hand = hand;
        this.player = player;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Set<card> getHand() {
        return this.hand;
    }

    public void setHand(Set<card> hand) {
        this.hand = hand;
    }

    public player getPlayer() {
        return this.player;
    }

    public void setPlayer(player player) {
        this.player = player;
    }

    public String toString() {
        return "play [hand=" + hand + ", player=" + player + ", score=" + score + ", team=" + team + "]";
    }

  public static void main(String[] args) {

   
   
    TwentyOne();
     
  }


    public static void TwentyOne() {
     int CurrentPot = 0;
     int DealerPot = 0;
     Set<card> hand = new HashSet<>();
     hand = card.generated(1);
     Set<card> DealerHand = new HashSet<>();
        DealerHand = card.generated(1);

        try (Scanner scanner = new Scanner(System.in)) {
        while (CurrentPot < 21) {
           
            
            System.out.print("what would you like to do? stand or hit: ");
            System.out.println("your current hand" + hand.toString());
            String answer = scanner.nextLine();

            if (answer.equals("stand")) {
                System.out.println("you have chosen to stand");
                
                     System.out.println("current total is " + " "+ CurrentPot);
                        System.out.println("dealer total is " + " "+ DealerPot);
                        if (CurrentPot > DealerPot && CurrentPot < 21) {
                            System.out.println("you have won");
                        } else if (CurrentPot < DealerPot && DealerPot < 21) {
                            System.out.println("you have lost");
                        } else {
                            System.out.println("you have tied");
                        }
                        break;
            } else if (answer.equals("hit")) {

                System.out.println("you have chosen to hit");
                Set<card> hand2 = new HashSet<>();
                hand2 = card.generated(1);
                Set <card> dealerCards = new HashSet<>();
                dealerCards = card.generated(1);

                for (card card2 : hand2) {
                    hand.add(card2);
                }
                System.out.println( "your new card is " + " "+ hand2.toString());
                for (card hands: hand) {
                    CurrentPot += hands.getValue();
                     
                 }

                 for (card card : dealerCards) {
                    DealerHand.add(card);
                 }

                 for (card card : DealerHand) {
                    DealerPot += card.getValue();
                 }



                 System.out.println("current total is " + " "+ CurrentPot);
                 System.out.println("dealer total is " + " "+ DealerPot);

         if(CurrentPot > 21) {
            System.out.println("you have busted");
            break;
        }
            } else {
                System.out.println("you have chosen to do nothing");
            }
                
            }

           
        }

       
    }


    public static void TWOplayer() {
      int CurrentPot = 0;
        int DealerPot = 0;
        Set<card> hand = new HashSet<>();
        hand = card.generated(1);
        Set<card> DealerHand = new HashSet<>();
           DealerHand = card.generated(1);

           try (Scanner scanner = new Scanner(System.in)) {
           while (CurrentPot < 21) {
               System.out.println("player 1");
               System.out.print("what would you like to do? stand or hit: ");
               System.out.println("your current hand" + hand.toString());
               String answer = scanner.nextLine();

               if (answer.equals("stand")) {
                   System.out.println("you have chosen to stand");
                   
                        System.out.println("current total is " + " "+ CurrentPot);
                           System.out.println("dealer total is " + " "+ DealerPot);
                           if (CurrentPot > DealerPot && CurrentPot < 21) {
                               System.out.println("you have won");
                           } else if (CurrentPot < DealerPot && DealerPot < 21) {
                               System.out.println("you have lost");
                           } else {
                               System.out.println("you have tied");
                           }
                           break;
               } else if (answer.equals("hit")) {

                   System.out.println("you have chosen to hit");
                   Set<card> hand2 = new HashSet<>();
                   hand2 = card.generated(1);
                   Set <card> dealerCards = new HashSet<>();
                   dealerCards = card.generated(1);

                   for (card card2 : hand2) {
                       hand.add(card2);
                   }
                   System.out.println( "your new card is " + " "+ hand2.toString());
                   for (card hands: hand) {
                       CurrentPot += hands.getValue();
                        
                    }

                    for (card card : dealerCards) {
                       DealerHand.add(card);
                    }

                    for (card card : DealerHand) {
                       DealerPot += card.getValue();
                    }
}


           }

        }

    }
}

