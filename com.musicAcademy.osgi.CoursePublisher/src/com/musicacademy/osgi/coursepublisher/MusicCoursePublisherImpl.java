package com.musicacademy.osgi.coursepublisher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicCoursePublisherImpl implements IMusicCoursePublisher {

	protected List<CourseModel> musicCourses;
	
	public MusicCoursePublisherImpl() {
		super();
		
		musicCourses = new ArrayList<CourseModel>();
		
		CourseModel c1 = new CourseModel("a001","course east 1","1 month","2 hours","teacher 1","Eastern","course will start on 10th of May",12);
		CourseModel c2 = new CourseModel("a002","course east 2","2 month","2 hours","teacher 2","Eastern","course will start on 10th of May",20);
		CourseModel c3 = new CourseModel("a003","course east 3","3 month","2 hours","teacher 3","Eastern","course will start on 10th of May",25);
		CourseModel c4 = new CourseModel("a004","course east 4","6 month","4 hours","teacher 4","Eastern","course will start on 10th of May",40);
		CourseModel c5 = new CourseModel("a005","course east 5","12 month","4 hours","teacher 5","Eastern","course will start on 10th of May",50);
		CourseModel c6 = new CourseModel("a006","course west 1","1 month","2 hours","teacher 1","Western","course will start on 10th of May",12);
		CourseModel c7 = new CourseModel("a007","course west 2","2 month","2 hours","teacher 2","Western","course will start on 10th of May",20);
		CourseModel c8 = new CourseModel("a008","course west 3","3 month","2 hours","teacher 3","Western","course will start on 10th of May",25);
		CourseModel c9 = new CourseModel("a009","course west 4","6 month","4 hours","teacher 4","Western","course will start on 10th of May",40);
		CourseModel c10 = new CourseModel("b001","course west 5","12 month","4 hours","teacher 5","Western","course will start on 10th of May",50);
		CourseModel c11 = new CourseModel("b002","course mix 1","6 month","6 hours","teacher 1","Western","course will start on 10th of May",60);
		CourseModel c12 = new CourseModel("b003","course mix 2","12 month","6 hours","teacher 2","Western","course will start on 10th of May",90);

		musicCourses.add(c1);
		musicCourses.add(c2);
		musicCourses.add(c3);
		musicCourses.add(c4);
		musicCourses.add(c5);
		musicCourses.add(c6);
		musicCourses.add(c7);
		musicCourses.add(c8);
		musicCourses.add(c9);
		musicCourses.add(c10);
		musicCourses.add(c11);
		musicCourses.add(c12);
	}

	@Override
	public void addNewCourse() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String id = "";

		while (true) {
			CourseModel musicCourse = new CourseModel();
			System.out.println();
			System.out.println("==============Add New Course====================");
			while (true) {

				System.out.print("Enter course id: ");
				id = scan.next();

				if (id == "") {
					System.out.println("Id can not be empty");

				} else if (id.length() < 4) {
					System.out.println("Id must have 5 characters");
				} else {

					musicCourse.setCourseId(id);
					break;
				}
			}

			while (true) {
				System.out.print("Enter course name: ");
				id = scan.next();

				if (id == "") {
					System.out.println("Name can not be empty");

				} else if (id.length() < 5) {
					System.out.println("Name must at least have 5 characters");
				}

				else {

					musicCourse.setCourseName(id);
					break;

				}
			}

			while (true) {
				System.out.print("Enter course duration(months): ");
				id = scan.next();
				if (id == "") {
					System.out.println("Duration can not be empty ");
				} else if (id.matches("[0-9]+")) {
					musicCourse.setCourseDuration(id);
					break;
				}

				else {
					System.out.println("Wrong Duration ");

				}
			}

			while (true) {
				System.out.print("Enter course hours: ");
				id = scan.next();
				if (id == "") {
					System.out.println("Hours can not be empty");
				} else if (id.matches("[0-9]+")) {
					musicCourse.setHours(id);
					break;
				} else {
					System.out.println("Wrong Hour Type");
				}
			}

			while (true) {
				System.out.print("Enter course  Music teacher: ");
				id = scan.next();
				if (id != "") {
					musicCourse.setMusicTeacher(id);
					break;
				} else {
					System.out.println("Tutor Name can not be empty");
				}
			}

			while (true) {
				System.out.print("Enter course type(Eastern or Western): ");
				id = scan.next();
				if (id != "") {
					musicCourse.setType(id);
					break;
				} else {
					System.out.println("Type can not be empty");
				}
			}

			while (true) {
				System.out.print("Enter course details: ");
				id = scan.next();
				if (id != "") {
					musicCourse.setOtherDetails(id);
					break;
				} else {
					System.out.println("Details can not be empty");

				}
			}

			System.out.print("Enter course price: ");
			double num = scan.nextDouble();
			musicCourse.setPrice(num);

			musicCourses.add(musicCourse);

			System.out.println();
			System.out.println("Enter number 1 to exit: ");
			System.out.println("Enter any other number to add more courses: ");
			int option = scan.nextInt();

			if (option == 1) {
				break;
			}

		}

	}

	@Override
	public void viewAllCourses() {

		if (musicCourses.isEmpty()) {
			System.out.println("No Courses");
		}

		System.out.println();
		System.out.println("==============View All Courses====================");
		for (CourseModel cm : musicCourses) {

			System.out.println(cm.toString());
			System.out.println();
		}

	}

	@Override
	public void searchCourseById() {

		String id;
		boolean done = false;
		System.out.println();
		System.out.println("==============View Course====================");
		System.out.print("Enter course Id to search: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		id = scan.next();

		for (CourseModel cm : musicCourses) {

			if (cm.getCourseId().equalsIgnoreCase(id)) {
				System.out.println("Course Found");
				System.out.println(cm.toString());
				done = true;
				break;

			}

		}

		if (!done) {
			System.out.println();
			System.out.println("Course Not Found");
		}

	}

	@Override
	public void deleteCourseById() {

		String id;
		boolean done = false;
		System.out.println();
		System.out.println("==============Remove Course====================");
		System.out.print("Enter course Id to delete: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		id = scan.next();

		for (int x = 0; x < musicCourses.size(); x++) {

			if (musicCourses.get(x).getCourseId().equalsIgnoreCase(id)) {
				System.out.println("Course Deleted");
				musicCourses.remove(x);
				done = true;
				break;

			}

		}
		if (!done) {
			System.out.println();
			System.out.println("Course Not Found");
		}

	}

	@Override
	public void updateCourse() {

		String id;
		int opt;
		boolean done = false;
		System.out.println();
		System.out.println("==============Update Course====================");
		System.out.print("Enter course Id to update: ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		id = scan.next();

		for (int x = 0; x < musicCourses.size(); x++) {

			if (musicCourses.get(x).getCourseId().equalsIgnoreCase(id)) {

				while (true) {
					System.out.println();
					System.out.println("Select an option to update: ");
					System.out.println("1 - update Course Name:\n" + "2 - update Duration:\n" + "3 - update hours:\n"
							+ "4 - update  Music teacher\n" + "5 -  update details\n" + "6 -  update price \n"
							+ "7 -  exit \n");

					opt = scan.nextInt();

					if (opt == 1) {

						while (true) {
							System.out.print("Enter course name: ");
							id = scan.next();

							if (id == "") {
								System.out.println("Name can not be empty");

							} else if (id.length() < 5) {
								System.out.println("Name must at least have 5 characters");
							}

							else {

								musicCourses.get(x).setCourseName(id);
								break;

							}
						}

					}

					else if (opt == 2) {

						while (true) {
							System.out.print("Enter course duration(months): ");
							id = scan.next();
							if (id == "") {
								System.out.println("Duration can not be empty ");
							} else if (id.matches("[0-9]+")) {
								musicCourses.get(x).setCourseDuration(id);
								break;
							}

							else {
								System.out.println("Wrong Duration ");

							}
						}

					}

					else if (opt == 3) {

						while (true) {
							System.out.print("Enter course hours: ");
							id = scan.next();
							if (id == "") {
								System.out.println("Hours can not be empty");
							} else if (id.matches("[0-9]+")) {
								musicCourses.get(x).setHours(id);
								break;
							} else {
								System.out.println("Wrong Hour Type");
							}
						}

					}

					else if (opt == 4) {

						while (true) {
							System.out.print("Enter course  Music teacher: ");
							id = scan.next();
							if (id != "") {
								musicCourses.get(x).setMusicTeacher(id);
								break;
							} else {
								System.out.println("Tutor Name can not be empty");
							}
						}
					}

					else if (opt == 5) {
						while (true) {
							System.out.print("Enter course details: ");
							id = scan.next();
							if (id != "") {
								musicCourses.get(x).setOtherDetails(id);
								break;
							} else {
								System.out.println("Details can not be empty");

							}
						}
					}

					else if (opt == 6) {

						System.out.print("Enter course price: ");
						double num = scan.nextDouble();
						musicCourses.get(x).setPrice(num);
					}

					else if (opt == 7) {

						break;
					} else {
						System.out.print("Wrong option");
					}
				}

				done = true;

			}

		}
		if (!done) {
			System.out.println();
			System.out.println("Course Not Found");
		}

	}

	@Override
	public void selectCourseOPt(String consumer) {

		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		boolean run = true;
		do {
			if(consumer.equals("student") || consumer.equals("admin")) {
				System.out.println("Select your choice(1-3) :");
				System.out.println("1 - View all music courses");
				System.out.println("2 - Search  music course by Id");
				System.out.println("3 - Exit");

				int response = scn.nextInt();
				switch (response) {

				case 1:
					this.viewAllCourses();
					break;
				case 2:
					this.searchCourseById();
					break;
				case 3:
					run = false;
					break;
				default:
					System.out.print("Wrong option");
				
				}
			}
			else {
				// options for teacher
				System.out.println("Select your choice(1-6) :");
				System.out.println("1 - Add a musical course");
				System.out.println("2 - View all music courses");
				System.out.println("3 - Search  music course by Id");
				System.out.println("4 - Update music course  ");
				System.out.println("5 - Delete music course by Id");
				System.out.println("6 - Exit");

				int response = scn.nextInt();
				switch (response) {

				case 1:
					this.addNewCourse();
					break;
				case 2:
					this.viewAllCourses();
					break;
				case 3:
					this.searchCourseById();
					break;
				case 4:
					this.deleteCourseById();
					break;
				case 5:
					this.deleteCourseById();
					break;
				case 6:
					run = false;
					break;
				default:
					System.out.print("Wrong option");
			}
			}
			
		} while (run == true);
	}

}
