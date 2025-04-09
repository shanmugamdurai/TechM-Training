package com.myTraining.core.models;

import com.adobe.cq.wcm.core.components.models.Page;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, adapters = Page.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BasePageModel {

    @ValueMapValue
    private String ogTitle;

    @ValueMapValue
    private String ogDescription;

    @ValueMapValue
    private String ogImage;

    public String getOgTitle() {
        return ogTitle;
    }

    public String getOgDescription() {
        return ogDescription;
    }

    public String getOgImage() {
        return ogImage;
    }
}

