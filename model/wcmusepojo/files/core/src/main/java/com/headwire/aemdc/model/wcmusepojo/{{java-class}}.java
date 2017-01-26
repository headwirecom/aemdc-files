package {{ java-package }};

import com.adobe.cq.sightly.WCMUsePojo;


public class {{ java-class }} extends WCMUsePojo {

  private String text;

  @Override
  public void activate() throws Exception {
    hero = getProperties().get("text", "No text saved");
  }

  /**
   * Get text
   *
   * @return text
   */
  public String getText() {
    return this.text;
  }

}
