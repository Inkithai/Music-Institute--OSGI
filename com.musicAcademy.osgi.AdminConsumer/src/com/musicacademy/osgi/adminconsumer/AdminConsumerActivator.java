package com.musicacademy.osgi.adminconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;



import com.musicacademy.osgi.middleservice.IMiddleService;

public class AdminConsumerActivator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {
		System.out.println("Admin consumer started...\n ");

		serviceReference = context.getServiceReference(IMiddleService.class
				.getName());
		IMiddleService middleService = (IMiddleService) context.getService(serviceReference);
		
		middleService.selectAdminOpt();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Admin consumer stopped...\n ");
		context.ungetService(serviceReference);
	}

}
