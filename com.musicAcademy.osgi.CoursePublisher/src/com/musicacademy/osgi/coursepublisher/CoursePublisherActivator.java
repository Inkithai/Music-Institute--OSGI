package com.musicacademy.osgi.coursepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class CoursePublisherActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Course publisher started...\n");
		IMusicCoursePublisher coursePublisher = new MusicCoursePublisherImpl();
		publishServiceRegistration = context.registerService(
				IMusicCoursePublisher.class.getName(), coursePublisher, null);

	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Course publisher stopped...\n");
		publishServiceRegistration.unregister();
	}

}
