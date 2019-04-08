package RaysMusicEx.Accessories;

import RaysMusicEx.ISell;
import RaysMusicEx.StockItem;

public abstract class Accessory extends StockItem {

    protected String description;

    public Accessory(String stockID, double buyPrice, double sellPrice, String description){
        super(stockID, buyPrice, sellPrice);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

}
