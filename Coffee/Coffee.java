package Coffee;
import java.util.*;
import Ingredient.*;

public abstract class Coffee {
    protected double cPrice;

    protected String name;

    public double coffeePrice()
    {
        return this.cPrice;
    }

    protected List<Ingredient> iList = new ArrayList<Ingredient>();
    public Coffee(){}
    public Coffee(CoffeeBean...arg){
        for (CoffeeBean coffeeBean : arg) {
            this.addIngredients(coffeeBean);
            
        }
    }

    public void coffee_Info(){
        System.out.println("Price is: " + java.text.NumberFormat.getInstance().format(this.cPrice));
    }
    protected void addIngredients(Ingredient ing){
        iList.add(ing);
    }
    protected abstract void addDefault();
    protected void Calprice()
    {
        for (Ingredient ing : iList) {
            if(ing instanceof CoffeeBean){
                CoffeeBean bean = (CoffeeBean)ing;
                cPrice += bean.price();
            }
        }
    }
    public void recipe(){
        System.out.println("The Recipe of" + name + ":" );
        for (Ingredient ing : iList){
            ing.adding();
        }

    }



}
