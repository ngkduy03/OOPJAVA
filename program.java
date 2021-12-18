import java.util.List;
import Bill.*;
import Coffee.*;
import CoffeeStore.*;
import Ingredient.*;


public class program{
    public static void  main(String[] args) {
        
        CaPheSua a = new CaPheSua(new Columbia(50));
        // a.coffee_Info();
        // a.recipe();
        CaPheDen b = new CaPheDen();
        BacXiu x = new BacXiu();


        // Bill bill1 = new Bill();
        // bill1.billInput();
        // bill1.billInfo();
        Bill bill2 = new Bill();
        CaPheSua c = new CaPheSua();
        CaPheDen d = new CaPheDen(new Columbia(30));
        BacXiu e = new BacXiu();
        bill2.add(c, d, e);

        CoffeeStore.add_Bill(bill2);
        CoffeeStore.drinksRecipe();
        CoffeeStore.info();
        // CoffeeStore.info();

        // CoffeeStore.info();

        // CoffeeStore.drinksRecipe();

    }
}