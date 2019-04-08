package RaysMusicEx.Instruments;
import RaysMusicEx.InstrumentName;
import RaysMusicEx.InstrumentType;

public class ClassicalPiano extends Instrument {

    public ClassicalPiano(String stockID, double buyPrice, double sellPrice, InstrumentName name, InstrumentType type){
        super(stockID, buyPrice, sellPrice, InstrumentName.ClassicalPiano, InstrumentType.PERCUSION);

    }

    public String play(){
        return "Plink, Plonk, Plink.";
    }

}
