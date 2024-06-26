package com.musicacademy.osgi.teacherconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import com.musicacademy.osgi.middleservice.IMiddleService;

public class MusicTeacherConsumerActivator implements BundleActivator {


	ServiceReference serviceReference;
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Music teacher consumer started...\n");

		serviceReference = context.getServiceReference(IMiddleService.class
				.getName());
		IMiddleService middleService = (IMiddleService) context.getService(serviceReference);
		
		middleService.selectTeacherOpt();
		

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Music teacher consumer stopped...\n");
		context.ungetService(serviceReference);
	}

}
