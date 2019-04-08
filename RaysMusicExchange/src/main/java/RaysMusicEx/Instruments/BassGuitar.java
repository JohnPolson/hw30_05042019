package RaysMusicEx.Instruments;
import RaysMusicEx.InstrumentType;
import RaysMusicEx.InstrumentName;

public class BassGuitar extends Instrument {

    protected int stringCount;

    public BassGuitar(String stockID, double buyPrice, double sellPrice, InstrumentName name, InstrumentType type){
        super(stockID, buyPrice, sellPrice, InstrumentName.BassGuitar, InstrumentType.STRINGED);
        this.stringCount = 5;
    }

    public String play(){
        return "Strum, Strum, Strum";
    }

    public int getStringCount() {
        return stringCount;
    }

}
