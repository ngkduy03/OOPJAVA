package Coffee;
import Ingredient.*;

public class CaPheSua extends Coffee {
    public CaPheSua(){
        super();
        name="Nau Da";
        this.addDefault();
        cPrice = 15000;
        this.Calprice();

    }
    @Override
    protected void addDefault(){
        this.addIngredients(new Robusta(20));
        this.addIngredients(new Milk(20));
    }
    public CaPheSua(CoffeeBean...arg){
        super(arg);
        name="Nau Da";
        cPrice = 15000;
        this.addIngredients(new Milk(30));
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
