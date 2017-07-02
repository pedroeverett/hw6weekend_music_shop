import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class DrumStickTest {

  DrumStick drumStick;

  @Before
  public void before() {
    drumStick = new DrumStick("Drum Stick 1", "Wooden Drum Stick", 50, 10.00, 14.00);
  }

  @Test
  public void checkMarkup() {
    assertEquals(40.00, drumStick.calculateMarkup(), 0.01);
  }

}