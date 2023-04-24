package simplfiedpokemon.src;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class shop {
    String name;
    int price;
    int quantity;
    Set<shop> shop;
   

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Set<shop> getShop() {
        return shop;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        if (price < 0) {
            price = 0;
        } else if (price > 100) {
            price = 100;
        } else if (price == 0) {
            System.out.println("You have no more " + name + " left");

        }
        this.price = price;
    }

    public void setshop(Set<shop> shop) {
        this.shop = shop;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            quantity = 0;
        } else if (quantity > 100) {
            quantity = 100;
        } else if (quantity == 0) {
            System.out.println("You have no more " + name + " left");

        }
        this.quantity = quantity;
    }



    public shop(String name, int price, int quantity ) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
      
    }

 

    public String tostring() {
        return "Name: " + name + " Price: " + price + " Quantity: " + quantity ;
    }

    public static String toshop(Set<shop> shop) {
       Player player = new Player("wasif", 100);
        player = starterplayer(player, false);
       int currentbalance = player.getBalance();

        String shoplist = "";
        for (shop s : shop) {
            shoplist += "["+ s.tostring() +"]"+ " " ;
        }
        return shoplist + "current money: " + currentbalance ;

        
    }


    public static void main(String[] args) {
      Set<shop> shops = new HashSet<>();

      shops = generated();
      System.out.println(toshop(shops));


        
    }

   
    public static Set<shop> generated() {
       
        Set<shop> shop = new HashSet<>();
       


        shop.add(new shop("Pokeball", 10, 10 ));
        shop.add(new shop("Potion", 10, 10 ));
        shop.add(new shop("Super Potion", 20, 10));
        shop.add(new shop("Hyper Potion", 30, 10));
        shop.add(new shop("Max Potion", 40, 10));
        shop.add(new shop("Revive", 50, 10));
        shop.add(new shop("Max Revive", 60, 10));
        shop.add(new shop("Ether", 70, 10 ));
        shop.add(new shop("Max Ether", 80, 10));
        shop.add(new shop("Elixir", 90, 10));
        shop.add(new shop("Full Restore", 100, 10));
        shop.add(new shop("Antidote", 10, 10));
        shop.add(new shop("Awakening", 20, 10));
        shop.add(new shop("Burn Heal", 30, 10));
        shop.add(new shop("Ice Heal", 40, 10));
        shop.add(new shop("Paralyze Heal", 50, 10));
        shop.add(new shop("Full Heal", 60, 10));
        shop.add(new shop("Lava Cookie", 70, 10));
        shop.add(new shop("Berry Juice", 80, 10));
        shop.add(new shop("Sacred Ash", 90, 10));  
        
        return shop;
    }

    
    

}


