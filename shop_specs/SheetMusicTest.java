import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class SheetMusicTest {

  SheetMusic sheet;

  @Before
  public void before() {
    sheet = new SheetMusic("Music Sheet 1", "Let It Be Music Sheet", 35, 3.00, 6.00);
  }

  @Test
  public void checkMarkup() {
    assertEquals(100.00, sheet.calculateMarkup(), 0.01);
  }
}