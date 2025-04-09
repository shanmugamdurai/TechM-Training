package com.myTraining.core.models;

import com.myTraining.core.services.HelloWorldService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NewsModel {

    private static final Logger LOG = LoggerFactory.getLogger(NewsModel.class);

    @Reference
    private HelloWorldService helloWorldService;

    public String getHelloMessage() {
        String message = helloWorldService.getMessage();
        LOG.info("Service Message: {}", message);
        return message;
    }

    @ValueMapValue
    private String newsTitle;

    @ValueMapValue
    private String newsDetail;

    @ValueMapValue
    private String publishedDate;

    @ValueMapValue
    private String newsSource;

    public String getNewsTitle() {
        return newsTitle;
    }

    public String getNewsDetail() {
        return newsDetail;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getNewsSource() {
        return newsSource;
    }
}
