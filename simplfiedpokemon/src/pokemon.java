package simplfiedpokemon.src;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class pokemon {
    int health;
    String name;
    String type;
    Set<moveset> moveset;
    int level;
    Player player;

    public int getHealth() {
        return health;
    }
    public int getLevel() {
        return level;
    }

    public Set<moveset> getMoveset() {
        return moveset;
    }

    public String getName() {
        return name;
    }

    public Player getPlayer() {
        return player;
    }

    public String getType() {
        return type;
    }


    public void setHealth(int health) {
    if (health > 100) {
        health = 100;
    } else if (health < 0) {
        health = 0;
    } else if (health == 0) {
        System.out.println("Your pokemon has fainted");
        
    }
        this.health = health;
    }

    public void setLevel(int level) {
        if (level > 100) {
            level = 100;
        } else if (level < 0) {
            level = 0;
        }
        this.level = level;
    }

    public void setMoveset(Set<moveset> moveset) {
        this.moveset = moveset;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPlayer(Player player) {
        this.player = player;
    }


    public void setType(String type) {
        this.type = type;
    }


    public pokemon(int health, String name, String type, Set<moveset> moveset, int level, Player player) {
        this.health = health;
        this.name = name;
        this.type = type;
        this.moveset = moveset;
        this.level = level;
        this.player = player;
    }


    public String toString() {
        return "pokemon [health=" + health + ", level=" + level + ", moveset=" + moveset + ", name=" + name + ", player="
                + player + ", type=" + type + "]";
    }


    public static void main(String[] args) {
     

    }
    

}
