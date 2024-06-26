package com.musicacademy.osgi.middleservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.musicacademy.osgi.eventpublisher.EventPublisherImpl;
import com.musicacademy.osgi.eventpublisher.IEventPublisher;

public class MiddleServiceActivator implements BundleActivator {


	ServiceRegistration publishServiceRegistration;
	
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Middle service publisher started...\n");
		IMiddleService middleService = MiddleServiceImpl.getMidService();
		publishServiceRegistration = context.registerService(
				IMiddleService.class.getName(), middleService, null);

	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Middle service publisher stopped...");
		publishServiceRegistration.unregister();
	}

}
