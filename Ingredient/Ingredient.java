package Ingredient;

public abstract class Ingredient {
    protected String name;

    protected String unit;

    protected double amount;

    public String ingredient_BrandName(){
        return this.name;
    }
    public void ingredient_BrandName(String value)
    {
        this.name=value;
    }
    public Ingredient( String ingredient_Brandname , double ingredient_Amount, String ingredient_Unit){
        this.name = ingredient_Brandname;
        this.amount = ingredient_Amount;
        this.unit = ingredient_Unit;

    }
    public void ingredient_Info(){
        System.out.println("Name"+this.name);
    }
    public void adding()
    {
        System.out.println(this.type() + ":"+this.amount+this.unit);
    }
    protected abstract String type(); 
   
}
