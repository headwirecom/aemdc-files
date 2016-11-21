package {{ java-package }};

import com.adobe.cq.sightly.WCMUsePojo;


public class {{ java-class }} extends WCMUsePojo {

  private String hero;

  @Override
  public void activate() throws Exception {
    hero = getProperties().get("hero", "No text saved");
  }

  /**
   * Get hero text
   *
   * @return hero
   */
  public String getHero() {
    return this.hero;
  }

}
