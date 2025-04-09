package com.myTraining.core.config;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Yellow World Scheduler Config", description = "Scheduler to log Yellow World")
public @interface YellowWorldSchedulerConfig {

    @AttributeDefinition(name = "Cron Expression", description = "Cron schedule for job")
    String scheduler_expression() default "0 0/5 * * * ?"; // Every 5 minutes

    @AttributeDefinition(name = "Enable Scheduler", description = "True to enable")
    boolean scheduler_enabled() default true;

    @AttributeDefinition(name = "Scheduler Name", description = "Name of the scheduler")
    String scheduler_name() default "Yellow World Scheduler";
}