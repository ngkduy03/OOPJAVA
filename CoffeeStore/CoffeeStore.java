package CoffeeStore;

import java.util.*;
import Coffee.*;
import Bill.*;


public class CoffeeStore {
    private static double total;
    private static List<Bill> bList = new ArrayList<Bill>();
    private static List<Coffee> cList = new ArrayList<Coffee>();

    public static void add_Bill(Bill...arg){
        for(Bill Bill : arg){
            bList.add(Bill);
        }
    }
    private static void add_Drinks (Coffee...arg){
        for(Coffee Coffee : arg){
            cList.add(Coffee);
        }
    }
    public static void info(){
        System.out.println("\nCoffee Store INFO");
        System.out.println("************************");
        for(int i =0;i<bList.size();i++ ){
            System.out.println("Bill #" + (i+1) + ":\n");
            bList.get(i).billInfo();
            total += bList.get(i).totalPrice();
            System.out.println("_____________________\n");
      }
      System.out.println("Total Income: " + total + "VND");
    }

    public static void drinksRecipe(){
        System.out.println("DRINKS RECIPES: ");
        System.out.println("**************");
        add_Drinks(new CaPheDen(), new CaPheSua(), new BacXiu());
        for(Coffee Coffee : cList){
            Coffee.recipe();
            System.out.println("_____________");
        }
    }


    
}
