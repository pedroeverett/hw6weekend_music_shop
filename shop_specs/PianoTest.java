import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano("Piano 1", 88, "Black");
  }

  @Test
  public void checkName() {
    assertEquals("Piano 1", piano.getName());
    //assertNull(piano.getName());
  }

}