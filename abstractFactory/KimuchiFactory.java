package abstractFactory;

import java.util.ArrayList;
import java.util.List;

public class KimuchiFactory extends Factory {

    public Soup getSoup(){ 
        return new HotSoup(); 
    } 
    public Protein getMain(){ 
        return new Chicken(); 
    } 
    public List<Vegetable> getVegetables(){ 
        List<Vegetable> vegetables = new ArrayList<Vegetable>(); 
        vegetables.add(new ChineseCabbage()); 
        vegetables.add(new Leek()); 
        return vegetables; 
    } 
    public List<Ingredients> getOtherIngredients(){ 
        List<Ingredients> otherIngredients = new ArrayList<Ingredients>(); 
        otherIngredients.add(new Tofu()); 
        otherIngredients.add(new Harusame()); 
        return otherIngredients; 
    } 

}
