package builder;

public class SugerWaterBuilder implements Builder{
    private SugerWater SugerWater; 
    public SugerWaterBuilder(){ 
        this.SugerWater = new SugerWater(0,0); 
    } 
    public void addSolute(double SugerAmount){ 
        SugerWater.suger += SugerAmount; 
    } 
    public void addSolvent(double waterAmount){ 
        SugerWater.water += waterAmount; 
    } 
    public void abandonSolution(double SugerWaterAmount){ 
        double SugerDelta = SugerWaterAmount * 
                      (SugerWater.suger / (SugerWater.suger + SugerWater.water));
        double waterDelta = SugerWaterAmount *
                      (SugerWater.water / (SugerWater.suger + SugerWater.water));
        SugerWater.suger -= SugerDelta;
        SugerWater.water -= waterDelta;
    } 
    public Object getResult(){ 
        return this.SugerWater; 
    } 
}
