package com.myTraining.core.servlets;

import com.day.cq.search.PredicateGroup;
import com.day.cq.search.Query;
import com.day.cq.search.QueryBuilder;
import com.day.cq.search.result.Hit;
import com.day.cq.search.result.SearchResult;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.framework.Constants;

import javax.jcr.Session;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

@Component(
        service = Servlet.class,
        property = {
                Constants.SERVICE_DESCRIPTION + "=Search Servlet Using PredicateMap",
                "sling.servlet.paths=/bin/searchpages",
                "sling.servlet.methods=GET"
        }
)
public class SearchServlet extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {

        ResourceResolver resolver = request.getResourceResolver();
        QueryBuilder queryBuilder = resolver.adaptTo(QueryBuilder.class);

        if (queryBuilder != null) {
            Map<String, String> predicates = new HashMap<>();
            predicates.put("path", "/content/us"); // 👈 search path
            predicates.put("type", "cq:Page"); // 👈 content type
            predicates.put("p.limit", "10"); // max results

            Query query = queryBuilder.createQuery(PredicateGroup.create(predicates), resolver.adaptTo(Session.class));
            SearchResult result = query.getResult();

            JSONArray pagesArray = new JSONArray();
            for (Hit hit : result.getHits()) {
                JSONObject pageObj = new JSONObject();
                pageObj.put("path", hit.getPath());
                pagesArray.put(pageObj);
            }

            response.setContentType("application/json");
            response.getWriter().write(pagesArray.toString());
        } else {
            response.getWriter().write("QueryBuilder is not available");
        }
    }
}

