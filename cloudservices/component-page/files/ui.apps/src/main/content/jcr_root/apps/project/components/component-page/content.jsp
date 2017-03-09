<%
%>
<%@page contentType="text/html"
        pageEncoding="utf-8"
        import="com.day.cq.i18n.I18n"
%>
<%@include file="/libs/foundation/global.jsp" %>
<%@include file="/libs/cq/cloudserviceconfigs/components/configpage/init.jsp" %>

<%
    I18n i18n = new I18n(slingRequest);
    String path = slingRequest.getResource().getPath();
    String url = path + ".pem.html";
%>

<div>
    <h3>{{ jcr:title }}</h3>
    <ul>
        <li>
            <div class="li-bullet"><strong><%= i18n.get("Key Label 1") %>:</strong><br><%= xssAPI
                    .encodeForHTML(properties.get("propertykey1", "")) %>
            </div>
        </li>
        <li>
            <div class="li-bullet"><strong><%= i18n.get("Key Label 2") %>:</strong><br><%= xssAPI
                    .encodeForHTML(properties.get("propertykey2", ""))%>
            </div>
        </li>
    </ul>
</div>
