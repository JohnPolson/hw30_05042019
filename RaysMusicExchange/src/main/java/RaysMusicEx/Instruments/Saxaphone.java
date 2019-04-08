package RaysMusicEx.Instruments;
import RaysMusicEx.InstrumentName;
import RaysMusicEx.InstrumentType;

public class Saxaphone extends Instrument {

    public Saxaphone(String stockID, double buyPrice, double sellPrice, InstrumentName name, InstrumentType type){
        super(stockID, buyPrice, sellPrice, InstrumentName.Saxaphone, InstrumentType.BRASS);
    }

    public String play(){
        return "Toot, Toot, Toot";
    }

}
