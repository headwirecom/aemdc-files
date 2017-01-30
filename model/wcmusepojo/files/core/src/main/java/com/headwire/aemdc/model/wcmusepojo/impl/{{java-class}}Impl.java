package {{ java-package }};

import com.adobe.cq.sightly.WCMUsePojo;
import {{ java-interface-package }}.{{ java-class }};


public class {{ java-class }}Impl extends WCMUsePojo implements {{ java-class }} {

  private String text;

  @Override
  public void activate() throws Exception {
    text = getProperties().get("text", "No text saved");
  }

  @Override
  public String getText() {
    return this.text;
  }

}
