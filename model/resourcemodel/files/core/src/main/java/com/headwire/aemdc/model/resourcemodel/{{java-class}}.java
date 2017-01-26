package {{ java-package }};

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;


@Model(adaptables = Resource.class)
public class {{ java-class }} {

  @Inject
  private String title;

  /**
   * This is called after all the injection has occurred
   */
  @PostConstruct
  private void postConstructMethod() {
  }

  /**
   * This getter exposes data Injected into the Model
   *
   * @return title
   */
  public String getTitle() {
    return this.title;
  }

}
