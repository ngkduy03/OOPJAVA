package Coffee;
import Ingredient.*;

public class CaPheDen extends Coffee {
    public CaPheDen(){
        super();
        name="Den Da";
        this.addDefault();
        cPrice = 12000;
        this.Calprice();

    }
    @Override
    protected void addDefault(){
        this.addIngredients(new Robusta(20));
    }
    public CaPheDen(CoffeeBean...arg){
        super(arg);
        name="Den Da";
        cPrice = 12000;
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
