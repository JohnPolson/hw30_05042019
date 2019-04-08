package RaysMusicEx;
import java.util.ArrayList;
import RaysMusicEx.ISell;


public class Shop {

    protected ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        int itemIndex = stock.indexOf(item);
        this.stock.remove(itemIndex);
    }

}
