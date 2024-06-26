/**
 * 
 */
package com.musicacademy.osgi.eventpublisher;

/**
 * @author imashiuyanahewa
 *
 */
public interface IEventPublisher {
	public void chooseAnOption(String consumer);
	public void addNewEvent();
	public void displayAllEvents();
	public void cancelEvent();
	public void filterByEventCategory();

}
