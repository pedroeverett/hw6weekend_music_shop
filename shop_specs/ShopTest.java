import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class ShopTest {

  Shop shop;
  DrumStick drumStick;
  Guitar guitar;
  GuitarString string;
  Piano piano;
  Saxophone saxophone;
  SheetMusic sheet;


  @Before
  public void before() {
    shop = new Shop("Music Shop");
    drumStick = new DrumStick("Drum Stick 1", "Wooden Drum Stick", 50, 10.00, 14.00);
    guitar = new Guitar("Guitar 1", "Wood", "Brown", InstrumentType.STRINGY, 350.00, 630.00, 5, 6, "Mahogany", "The best sound ever");
    // guitar markup 80
    // guitar total units profit 1400
    string = new GuitarString("Guitar Strings 1", "Classic Guitar Strings", 60, 2.50, 6.50);
    piano = new Piano("Piano 1", "Wood", "Black", InstrumentType.KEYBOARD, 2000.00, 4000.00, 10, 80, 3, "Fantastic string Piano");
    // piano markup 100
    // piano total units profit 20000
    saxophone = new Saxophone("Saxophone 1", "Tin", "Golden", InstrumentType.WIND, 150.00, 250.00, 15, 23, "Lovely Saxophone");
    sheet = new SheetMusic("Music Sheet 1", "Let It Be Music Sheet", 35, 3.00, 6.00);
    // sheet markup 100
  }

  @Test
  public void checkStockStartEmpty() {
    assertEquals(0, shop.itemCount());
  }

  @Test
  public void canAddToStock() {
    shop.addStock(guitar);
    shop.addStock(piano);
    assertEquals(2, shop.itemCount());
  }

  @Test
  public void canRemoveFromStock() {
    shop.addStock(guitar);
    shop.removeStock();
    assertEquals(0, shop.itemCount());
  }

  @Test
  public void canRemoveFromStockByName() {
    shop.addStock(guitar);
    shop.addStock(piano);
    shop.addStock(string);
    shop.removeStockByName(piano);
    assertEquals(2, shop.itemCount());
  }

  @Test
  public void checkTotalProfitMarkup() {
    shop.addStock(guitar);
    shop.addStock(piano);
    assertEquals(180.00, shop.totalMarkup(), 0.01);
  }

  @Test
  public void checkAverageMarkup() {
    shop.addStock(guitar);
    shop.addStock(piano);
    shop.addStock(sheet);
    assertEquals(93.33, shop.averageMarkup(), 0.01);
  }

  @Test
  public void checkTotalProfitMoney() {
    shop.addStock(guitar);
    shop.addStock(piano);
    assertEquals(21400.00, shop.totalProfit(), 0.01);
  }


}