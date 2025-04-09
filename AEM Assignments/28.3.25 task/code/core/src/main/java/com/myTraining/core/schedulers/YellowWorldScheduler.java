package com.myTraining.core.schedulers;

import com.myTraining.core.config.YellowWorldSchedulerConfig;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicBoolean;

import org.osgi.service.component.annotations.ConfigurationPolicy;

import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;

import java.util.Map;

@Component(service = Runnable.class,
        configurationPolicy = ConfigurationPolicy.REQUIRE,
        immediate = true,
        configurationPid = "com.myproject.core.config.YellowWorldSchedulerConfig")
@Designate(ocd = YellowWorldSchedulerConfig.class)
public class YellowWorldScheduler implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(YellowWorldScheduler.class);

    private String schedulerName;
    private final AtomicBoolean running = new AtomicBoolean(false);

    private YellowWorldSchedulerConfig config;

    private final Scheduler scheduler;

    public YellowWorldScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    @Activate
    @Modified
    protected void activate(YellowWorldSchedulerConfig config, Map<String, Object> properties) {
        this.config = config;
        this.schedulerName = config.scheduler_name();

        if (config.scheduler_enabled()) {
            ScheduleOptions scheduleOptions = scheduler.EXPR(config.scheduler_expression());
            scheduleOptions.name(schedulerName);
            scheduleOptions.canRunConcurrently(false);
            scheduler.schedule(this, scheduleOptions);
            LOG.info("Yellow World Scheduler activated with cron expression: {}", config.scheduler_expression());
        } else {
            LOG.info("Yellow World Scheduler is disabled.");
        }
    }

    @Override
    public void run() {
        if (running.compareAndSet(false, true)) {
            try {
                LOG.info("Yellow World from AEM Scheduler 🟡");
            } finally {
                running.set(false);
            }
        }
    }
}
