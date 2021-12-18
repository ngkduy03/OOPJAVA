package Ingredient;

public class Robusta extends CoffeeBean{
    private String _type ="Robusta Bean";
    public Robusta(double ingredient_Amount){
        super(ingredient_Amount);
        this._price=0;
        this.name = type();
    }
    @Override
    protected String type() {
        
        return _type;
    }
}
