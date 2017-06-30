import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar("Guitar 1", 6, "Mahogany");
  }

  @Test
  public void checkWood() {
    assertEquals("Mahogany", guitar.getWood());
  }
}