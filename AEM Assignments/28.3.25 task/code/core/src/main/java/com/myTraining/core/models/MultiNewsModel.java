package com.myTraining.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import java.util.List;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MultiNewsModel {

    @ChildResource(name = "newsItems")
    private List<NewsItem> newsItems;

    public List<NewsItem> getNewsItems() {
        return newsItems;
    }

    @Model(adaptables = Resource.class)
    public static class NewsItem {
        @ValueMapValue
        private String title;

        @ValueMapValue
        private String source;

        public String getTitle() {
            return title;
        }

        public String getSource() {
            return source;
        }
    }
}

