import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class SaxophoneTest {

  Saxophone saxophone;

  @Before
  public void before() {
    saxophone = new Saxophone("Saxophone 1", "Bass", 23);
  }

  @Test
  public void checkType() {
    assertEquals("Bass", saxophone.getType());
  }
}