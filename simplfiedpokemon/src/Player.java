package simplfiedpokemon.src;

import java.util.Random;
import java.util.Scanner;

public class Player {
int balance;
String name;

public int getBalance() {
    return balance;
}
public String getName() {
    return name;
}
public void setBalance(int balance) {
    if (balance > 1000) {
        balance = 1000;
    }
    else if (balance < 0) {
        balance = 0;
    }
    this.balance = balance;

}

public void setName(String name) {
    this.name = name;

}

public Player(String name, int balance) {
    this.name = name;
    this.balance = balance;

}

public String toString() {
    return "Player [name=" + name + ", balance=" + balance + "]";
}

public static void main(String[] args) {
    Player player = new Player(" ", 0);
    player = starterplayer(player,true);
    System.out.println(player);


    
}

public static Player starterplayer(Player player, boolean alt) {
    int[] starterBal = {200, 250, 300};
    Random random = new Random();
    int randomValueIndex = random.nextInt(starterBal.length);
    int startingBAL = starterBal[randomValueIndex];
    
if (alt == true) {
 
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("What is your name?");
        String name = input.nextLine();
   
        System.out.println("hi " + name +" Your starting balance is " + startingBAL);
        player.setName("name");
    }
}
 player.setBalance(startingBAL);
    

   return player;
}



}