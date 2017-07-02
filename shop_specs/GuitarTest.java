import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar("Guitar 1", "Wood", "Brown", InstrumentType.STRINGY, 350.00, 630.00, 5, 6, "Mahogany", "The best sound ever");
  }

  @Test
  public void checkWood() {
    assertEquals("Mahogany", guitar.getTypeWood());
  }
}