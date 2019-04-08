package RaysMusicEx.Instruments;
import RaysMusicEx.*;

public abstract class Instrument extends StockItem implements IPlay {

    protected InstrumentName name;
    protected InstrumentType type;


    public Instrument(String stockID, double buyPrice, double sellPrice, InstrumentName name, InstrumentType type){
        super(stockID, buyPrice, sellPrice);
        this.name = name;
        this.type = type;
    }

    public InstrumentName getName() {
        return name;
    }

    public void setName(InstrumentName name) {
        this.name = name;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public String play(){
        return "Let's play a tune.";
    }

}
