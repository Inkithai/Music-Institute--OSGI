package com.musicacademy.osgi.studentconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.musicacademy.osgi.middleservice.IMiddleService;


public class StudentConsumerActivator implements BundleActivator {

	ServiceReference serviceReference;
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Student consumer started...\n");

		serviceReference = context.getServiceReference(IMiddleService.class
				.getName());
		IMiddleService middleService = (IMiddleService) context.getService(serviceReference);
		
		middleService.selectStudentOpt();;
		

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Student consumer stopped...\n");
		context.ungetService(serviceReference);
	}

}
