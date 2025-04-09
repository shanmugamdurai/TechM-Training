package com.myTraining.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HelloWorldModel {

    @ValueMapValue
    private String firstName;

    @ValueMapValue
    private String lastName;

    // Getter for firstName
    public String getFirstName() {
        return firstName != null ? firstName : "";
    }

    // Getter for lastName
    public String getLastName() {
        return lastName != null ? lastName : "";
    }
}
