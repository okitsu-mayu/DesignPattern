package factoryMethod;

import templatemethod.Cuttable;
import templatemethod.Wood;

public abstract class CutPrint{ 
	  
    protected abstract void draw( Cuttable hanzai ); 
    protected abstract void cut( Cuttable hanzai ); 
    protected abstract void print( Cuttable hanzai ); 
    protected Cuttable createCuttable(){ 
        return new Wood(); 
    }
    public void createCutPrint(){ 
        Cuttable hanzai = createCuttable();
        draw( hanzai ); 
        cut( hanzai ); 
        print( hanzai ); 
    } 
}