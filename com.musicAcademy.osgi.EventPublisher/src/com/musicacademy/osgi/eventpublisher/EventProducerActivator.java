package com.musicacademy.osgi.eventpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class EventProducerActivator implements BundleActivator {
	
	ServiceRegistration publishServiceRegistration;
	
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Event publisher started...\n");
		IEventPublisher eventPublisher = new EventPublisherImpl();
		publishServiceRegistration = context.registerService(
				IEventPublisher.class.getName(), eventPublisher, null);

	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Event publisher stopped...\n");
		publishServiceRegistration.unregister();
	}

}
