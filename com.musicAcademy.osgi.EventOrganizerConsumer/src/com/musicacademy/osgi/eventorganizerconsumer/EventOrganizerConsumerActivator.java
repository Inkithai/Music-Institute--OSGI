package com.musicacademy.osgi.eventorganizerconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import com.musicacademy.osgi.middleservice.IMiddleService;

public class EventOrganizerConsumerActivator implements BundleActivator {

    private ServiceReference<IMiddleService> serviceReference;

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Event consumer started...\n");

        serviceReference = context.getServiceReference(IMiddleService.class);
        if (serviceReference != null) {
            IMiddleService middleService = context.getService(serviceReference);
            try {
                middleService.selectEventOrganizerOpt();
            } catch (Exception e) {
                System.err.println("Error while selecting event organizer option: " + e.getMessage());
                // Handle the exception gracefully, for example, log it or display a message to the user.
            }
        } else {
            System.err.println("IMiddleService is not available.");
        }
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Event consumer stopped...\n");
        if (serviceReference != null) {
            context.ungetService(serviceReference);
        }
    }
}