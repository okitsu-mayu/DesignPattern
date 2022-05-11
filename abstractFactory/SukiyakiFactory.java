package abstractFactory;

import java.util.ArrayList;
import java.util.List;

public class SukiyakiFactory extends Factory {

    public Soup getSoup(){ 
        return new SoysourceSoup(); 
    } 
    public Protein getMain(){ 
        return new Beef(); 
    } 
    public List<Vegetable> getVegetables(){ 
        List<Vegetable> vegetables = new ArrayList<Vegetable>(); 
        vegetables.add(new Leek()); 
        vegetables.add(new Chrysanthemum()); 
        return vegetables; 
    } 
    public List<Ingredients> getOtherIngredients(){ 
        List<Ingredients> otherIngredients = new ArrayList<Ingredients>(); 
        otherIngredients.add(new Tofu()); 
        otherIngredients.add(new Egg()); 
        return otherIngredients; 
    } 

}
