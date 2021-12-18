package Bill;

import java.util.*;
import Coffee.*;


public class Bill {
    private double total =0;
    private List<Coffee> cList = new ArrayList<Coffee>();
    public double totalPrice () {
        return this.total;
    }
    public void add(Coffee...arg){
        for(Coffee Coffee : arg){
            this.cList.add(Coffee);
        }
    }
    public void billInfo(){
        System.out.println("BILL INFO");
        System.out.println("******************");
        for(Coffee Coffee : cList){
            Coffee.coffee_Info();
            this.total += Coffee.coffeePrice();
            System.out.println("_____________\n");
        }
        System.out.println("Total price: "+this.total+"VND");
        System.out.flush();
    }
}

