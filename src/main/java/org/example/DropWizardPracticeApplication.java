package org.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

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
        // TODO: implement application
    }

}
