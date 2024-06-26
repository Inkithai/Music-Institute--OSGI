/**
 * 
 */
package com.musicacademy.osgi.eventpublisher;

/**
 * @author lahirujeewantha
 *
 */
public class EventModel {
	private String eventName, date, venue, duration;
	private int category;

	/**
	 * constructor
	 */
	public EventModel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param eventName
	 * @param category
	 * @param date
	 * @param venue
	 * @param duration
	 */
	public EventModel(String eventName, int category, String date, String venue, String duration) {
		super();
		this.eventName = eventName;
		this.category = category;
		this.date = date;
		this.venue = venue;
		this.duration = duration;
	}

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	/**
	 * @return category
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * @return the category name
	 */
	public String getCategoryName() {
		
		String categoryName = "default";
		switch(this.category) {
			case 1: 
				categoryName = "Classical music Concert";
				break;
			case 2: 
				categoryName = "Recital Concert";
				break;
			case 3: 
				categoryName = "Music Festival";
				break;
			case 4:
				categoryName = "Orchestra";
				break;
			case 5:
				categoryName = "Opera";
				break;
			case 6: 
				categoryName = "Choral event";
				break;
			case 7: 
				categoryName = "Music competition";
				break;
		}
		return categoryName;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(int category) {
		this.category = category;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the venue
	 */
	public String getVenue() {
		return venue;
	}

	/**
	 * @param venue the venue to set
	 */
	public void setVenue(String venue) {
		this.venue = venue;
	}

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

}