package com.myTraining.core.services;

import org.osgi.service.component.annotations.Component;

@Component(service = HelloWorldService.class)
public class HelloWorldService {
    public String getMessage() {
        return "Hello World from OSGi Service!";
    }
}

