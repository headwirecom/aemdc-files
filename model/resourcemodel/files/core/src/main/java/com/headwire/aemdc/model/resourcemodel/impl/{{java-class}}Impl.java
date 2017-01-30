package {{ java-package }};

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import com.headwire.myaem.core.model.content.section.Headings;
import {{ java-interface-package }}.{{ java-class }};

@Model(adaptables = Resource.class, adapters = {{ java-class }}.class)
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
