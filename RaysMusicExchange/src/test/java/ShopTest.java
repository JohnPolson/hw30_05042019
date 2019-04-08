import RaysMusicEx.Accessories.SheetMusic;
import RaysMusicEx.ISell;
import RaysMusicEx.InstrumentName;
import RaysMusicEx.InstrumentType;
import RaysMusicEx.Instruments.Saxaphone;
import RaysMusicEx.Shop;
import RaysMusicEx.StockItem;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;


public class ShopTest {

    Saxaphone saxaphone;
    SheetMusic sheetMusic;
    ArrayList<ISell> stock;
    Shop shop;

    @Before

    public void before(){
        saxaphone = new Saxaphone("SAX001", 25, 45, InstrumentName.Saxaphone, InstrumentType.BRASS);
        sheetMusic = new SheetMusic("SM003", 5, 15, "Paint it Black - The Stones");
        stock = new ArrayList<ISell>();
        shop = new Shop();
    }


    @Test
    shop.addItemToStock(saxaphone);
    shop.addItemToStock(sheetMusic);
    assertEquals(2, shop.getStockCount());


}
