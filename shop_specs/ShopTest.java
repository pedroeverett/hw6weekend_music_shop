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
    guitar = new Guitar("Guitar 1", "Wood", "Brown", "Accoustic", 350.00, 600.00, 5, 6, "Mahogany", "The best sound ever");
    string = new GuitarString("Guitar Strings 1", "Classic Guitar Strings", 60, 2.50, 6.50);
    piano = new Piano("Piano 1", "Wood", "Black", "Classic", 3000.00, 4000.00, 10, 80, 3, "Fantastic string Piano");
    saxophone = new Saxophone("Saxophone 1", "Tin", "Golden", "Bass", 150.00, 250.00, 15, 23, "Lovely Saxophone");
    sheet = new SheetMusic("Music Sheet 1", "Let It Be Music Sheet", 35, 3.00, 6.00);
  }

  @Test
  public void checkStockStartEmpty() {
    assertEquals(0, shop.itemCount());
  }
}