package com.musicacademy.osgi.quizpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class QuizPublisherActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Quiz publisher started...\n");
		IQuizPublisher quizPublisher = new QuizPublisherImpl();
		publishServiceRegistration = context.registerService(
				IQuizPublisher.class.getName(), quizPublisher, null);

	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Quiz publisher stopped...\n");
		publishServiceRegistration.unregister();
	}

}
