package com.musicacademy.osgi.musicresourcespublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class MusicResourceProducerActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	


	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Music resource publisher started...\n ");
		IMusicResourcePublisher musicResourcePublisher = new MusicResourcePublisherImpl();
		publishServiceRegistration = context.registerService(
				IMusicResourcePublisher.class.getName(), musicResourcePublisher, null);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Music resource publisher stopped stopped...");
	}

}
