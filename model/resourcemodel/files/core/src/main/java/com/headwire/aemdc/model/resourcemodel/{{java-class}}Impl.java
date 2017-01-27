package {{ java-package }};

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;


@Model(adaptables = Resource.class)
public class {{ java-class }}Impl implements {{ java-class }} {

  @Inject
  private String text;

  /**
   * This is called after all the injection has occurred
   */
  @PostConstruct
  private void postConstructMethod() {
  }

  @Override
  public String getText() {
    return this.text;
  }

}
