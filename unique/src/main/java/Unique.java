import org.apache.commons.lang3.RandomStringUtils;

public class Unique {
  public String ascii() {
    return RandomStringUtils.randomAscii(8);
  }
  public String alphabetic() {
    return RandomStringUtils.randomAlphabetic(8);
  }
  public String alphanumeric() {
    return RandomStringUtils.randomAlphanumeric(8);
  }
}
