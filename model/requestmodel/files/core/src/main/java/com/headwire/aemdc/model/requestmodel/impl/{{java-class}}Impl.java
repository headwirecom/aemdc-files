package {{ java-package }};

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Model;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import {{ java-interface-package }}.{{ java-class }};


@Model(adaptables = SlingHttpServletRequest.class, adapters = {{ java-class }}.class)
public class {{ java-class }}Impl implements {{ java-class }} {

  private final SlingHttpServletRequest request;
  private String text;

  public {{ java-class }}Impl(final SlingHttpServletRequest request) {
    this.request = request;
  }

  @PostConstruct
  private void postConstructMethod() {
    final Resource resource = request.getResource();
    final ResourceResolver resourceResolver = resource.getResourceResolver();
    final PageManager pageManager = resourceResolver.adaptTo(PageManager.class);
    final Page containingPage = pageManager.getContainingPage(resource);
    this.text = containingPage.getTitle();
  }

  @Override
  public String getText() {
    return this.text;
  }
}
