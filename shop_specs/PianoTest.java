import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano("Piano 1", "Wood", "Black", InstrumentType.KEYBOARD, 2000.00, 4000.00, 10, 80, 3, "Fantastic string Piano");
  }

  @Test
  public void checkName() {
    assertEquals("Piano 1", piano.getName());
    //assertNull(piano.getName());
  }

}