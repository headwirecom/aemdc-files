package {{ java-package }};

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Properties({
        @Property( name = HttpWhiteboardConstants.HTTP_WHITEBOARD_SERVLET_PATTERN,
                value = "/bin/sample/felix/servlet"
        ),
        @Property( name = HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT,
                value = (HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME + "=org.osgi.service.http")
        )
})
@Service(value = Servlet.class)
public class {{ java-class }} extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle HTTP GET requests
        response.getWriter().write("HTTP GET: Ok");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle HTTP POST requests
        response.getWriter().write("HTTP POST: Ok");
    }
}