package Ingredient;

public class Milk extends Ingredient{

    public Milk(double ingredient_Amount){
        super("Vinamilk", ingredient_Amount, "ml");
    }
    @Override
    public void ingredient_Info(){
        super.ingredient_Info();
    }
    @Override
    protected String type() {
        return "Milk";
    }
    
}
