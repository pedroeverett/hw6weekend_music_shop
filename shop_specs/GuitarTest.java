import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar("Guitar 1", "Wood", "Brown", "Accoustic", 350.00, 600.00, 5, 6, "Mahogany");
  }

  @Test
  public void checkWood() {
    assertEquals("Mahogany", guitar.getTypeWood());
  }
}