package Ingredient;

public class Columbia extends CoffeeBean {
    private String _type ="Colombia Bean";
    public Columbia(double ingredient_Amount){
        super(ingredient_Amount);
        this._price = 5000;
        this.name=type();
    }
    @Override
    protected String type(){
        return _type;
    }
    
}
