package Coffee;
import Ingredient.*;

public class BacXiu extends Coffee {
    public BacXiu(){
        super();
        name="Bac Xiu";
        this.addDefault();
        cPrice = 18000;
        this.Calprice();

    }
    @Override
    protected void addDefault(){
        this.addIngredients(new Robusta(20));
        this.addIngredients(new Milk(20));
    }
    public BacXiu(CoffeeBean...arg){
        super(arg);
        name="Bac Xiu";
        cPrice = 18000;
        this.addIngredients(new Milk(40));
        this.Calprice();

    }
    @Override
    public void coffee_Info(){
        System.out.println("Name: "+ name);
        super.coffee_Info();
    }
    @Override
    public void recipe(){
        super.recipe();
    }
}
