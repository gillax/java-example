import org.junit.Test;
import static org.junit.Assert.*;

public class UniqueTest {
  @Test public void testAscii() {
    Unique instance = new Unique();
    String val = instance.ascii();
    System.out.println(val);
    assertEquals(8, val.length());
  }
  @Test public void testAlphabetic() {
    Unique instance = new Unique();
    String val = instance.alphabetic();
    System.out.println(val);
    assertEquals(8, val.length());
  }
  @Test public void testAlphanumeric() {
    Unique instance = new Unique();
    String val = instance.alphanumeric();
    System.out.println(val);
    assertEquals(8, val.length());
  }
}

