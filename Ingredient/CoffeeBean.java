package Ingredient;

public abstract class CoffeeBean extends Ingredient {
    protected int _price;
    public int price(){
        return _price;
    }
    public CoffeeBean(double ingredient_Amount){
        super("",ingredient_Amount,"g");
    }
   
}


