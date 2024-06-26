package com.musicacademy.osgi.coursepublisher;

public interface IMusicCoursePublisher {
	public void addNewCourse();
	public void viewAllCourses();
	public void searchCourseById();
	public void deleteCourseById();
	public void updateCourse();
	public void selectCourseOPt(String consumer);

}
