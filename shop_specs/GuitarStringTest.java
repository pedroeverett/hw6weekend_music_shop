import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class GuitarStringTest {

  GuitarString string;

  @Before
  public void before() {
    string = new GuitarString("Guitar Strings 1", "Classic Guitar Strings", 60, 2.50, 6.50);
  }

  @Test
  public void checkMarkup() {
    assertEquals(160.00, string.calculateMarkup(), 0.01);
  }

  @Test
  public void checkSingleItemProfit() {
    assertEquals(4.00, string.calculateSingleItemProfit(), 0.01);
  }

  @Test
  public void checkItemsInStockProfit() {
    assertEquals(240.00, string.calculateItemsInStockProfit(), 0.01);
  }
}