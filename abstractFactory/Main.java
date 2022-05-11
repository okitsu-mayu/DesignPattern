package abstractFactory;

public class Main {
	public static void main(String args[]){ 
        HotPot hotPot = new HotPot(new Pot()); 
        Factory factory = createFactory(args[0]); 
        hotPot.addSoup(factory.getSoup()); 
        hotPot.addMain(factory.getMain()); 
        hotPot.addVegetables(factory.getVegetables()); 
        hotPot.addOtherIngredients(factory.getOtherIngredients());
        hotPot.eat();
    } 
    private static Factory createFactory(String str){ 
        if("キムチ鍋".equals(str)){ 
            return new KimuchiFactory(); 
        }else if("すき焼き".equals(str)){ 
            return new SukiyakiFactory(); 
        }else{ 
            return new MizutakiFactory(); 
        } 
    } 
}
