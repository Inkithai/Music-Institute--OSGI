package com.musicacademy.osgi.coursepublisher;

public class CourseModel {
	
	
	private String courseId,courseName,courseDuration,hours,musicTeacher,type,otherDetails;
	private double price;
	

	public CourseModel() {
		super();
	}


	public CourseModel(String courseId, String courseName, String courseDuration, String hours,
			String tutor, String type, String otherDetails, double price) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.hours = hours;
		this.musicTeacher = tutor;
		this.type = type;
		this.otherDetails = otherDetails;
		this.price = price;
	}


	public String getCourseId() {
		return courseId;
	}


	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseDuration() {
		return courseDuration;
	}


	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}


	


	public String getHours() {
		return hours;
	}


	public void setHours(String hours) {
		this.hours = hours;
	}


	public String getMusicTeacher() {
		return musicTeacher;
	}


	public void setMusicTeacher(String tutor) {
		this.musicTeacher = tutor;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getOtherDetails() {
		return otherDetails;
	}


	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Course Id: " + courseId + "\nCourse Name: " + courseName + "\nCourse Duration: " + courseDuration
			    + "\nHours: " + hours + "\nTeacher: " + musicTeacher + "\nType: " + type
				+ "\nOther Details: " + otherDetails + "\nPrice: " + price;
	}
	
	
	
	
	
	

}
