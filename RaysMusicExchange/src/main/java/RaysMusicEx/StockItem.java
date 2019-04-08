package RaysMusicEx;

public abstract class StockItem implements ISell{

    private String stockID;
    private double buyPrice;
    private double sellPrice;

    public StockItem(String stockID, double buyPrice, double sellPrice){
        this.stockID = stockID;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return stockID;
    }

    public void setDescription(String stockID) {
        this.stockID = stockID;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }

}
