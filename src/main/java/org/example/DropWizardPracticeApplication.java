package org.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.example.health.TemplateHealthCheck;
import org.example.resources.HelloWorldResource;

public class DropWizardPracticeApplication extends Application<DropWizardPracticeConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropWizardPracticeApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropWizardPractice";
    }

    @Override
    public void initialize(final Bootstrap<DropWizardPracticeConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropWizardPracticeConfiguration configuration,
                    final Environment environment) {
        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
        );

        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }

}
