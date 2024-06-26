package com.musicacademy.osgi.middleservice;

import java.util.Scanner;

import com.musicacademy.*;
import com.musicacademy.osgi.coursepublisher.IMusicCoursePublisher;
import com.musicacademy.osgi.coursepublisher.MusicCoursePublisherImpl;
import com.musicacademy.osgi.eventpublisher.EventPublisherImpl;
import com.musicacademy.osgi.eventpublisher.IEventPublisher;
import com.musicacademy.osgi.musicresourcespublisher.IMusicResourcePublisher;
import com.musicacademy.osgi.musicresourcespublisher.MusicResourcePublisherImpl;
import com.musicacademy.osgi.quizpublisher.IQuizPublisher;
import com.musicacademy.osgi.quizpublisher.QuizPublisherImpl;

public class MiddleServiceImpl implements IMiddleService{
	IEventPublisher eventPublisher;
	IMusicCoursePublisher coursePublisher;
	IMusicResourcePublisher resourcePublisher;
	IQuizPublisher quizPublisher;
	private static MiddleServiceImpl instance;
	
	//constructor
	private MiddleServiceImpl() {
		eventPublisher = new EventPublisherImpl();
		coursePublisher = new MusicCoursePublisherImpl();
		resourcePublisher = new MusicResourcePublisherImpl();
		quizPublisher = new QuizPublisherImpl();
	}
	
	public static MiddleServiceImpl getMidService() {
		
		if(instance == null) {
			instance = new MiddleServiceImpl();
		}
		
		return instance;
	}
	

	@Override
		public void selectEventOrganizerOpt() {
		// TODO Auto-generated method stub
		int choice;
        boolean ex = true;
        Scanner scanner = new Scanner(System.in);
        do {
        	System.out.println("\nDear Event organizer, \n To proceed, please choose one of the options (1–5):");
			System.out.println("1). Add new musical event");
			System.out.println("2). View all musical events");
	        System.out.println("3). Sort events according to their category.");
	        System.out.println("4).Postpone an event");
	        System.out.println("5). Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                	eventPublisher.addNewEvent();
                    break;
                case 2:
                	eventPublisher.displayAllEvents();
                    break;
                case 3: 
                	eventPublisher.filterByEventCategory();
                	break;
                case 4: 
                	eventPublisher.cancelEvent();
                	break;
                case 5: 
                	System.out.println("Exiting...\n");
                	ex = false;
                	break;
                default:
                    System.out.println("Invalid input.please try again.");
            }
        } while (ex);
	}

	@Override
	public void selectStudentOpt() {
		// TODO Auto-generated method stub
	        int choice;
	        boolean ex = true;
	        Scanner scanner = new Scanner(System.in);
	        do {
	            System.out.println("Dear Student,\nPlease enter your choice to continue:");
	            System.out.println("1. View courses");
	            System.out.println("2. Take Quiz");
	            System.out.println("3. View musical instruments");
	            System.out.println("4. Exit");
	            choice = scanner.nextInt();
	            scanner.nextLine();
	            switch (choice) {
	                case 1:
	                	coursePublisher.selectCourseOPt("student");
	                    break;
	                case 2:
	                    quizPublisher.takeQuiz();;
	                    break;
	                case 3: 
	                	resourcePublisher.chooseAnOption("student");
	                	break;
	                case 4: 
	                	System.out.println("Exiting...\n");
	                	ex = false;
	                	break;
	                default:
	                    System.out.println("Invalid choice");
	            }
	        } while (ex);
	}
	
	@Override
	public void selectAdminOpt() {
		int choice;
        boolean ex = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Dear Admin,\nPlease enter your choice to continue:");
            System.out.println("1. Manage musical resources/instruments");
            System.out.println("2. View courses");
            System.out.println("3. View musical events");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                	resourcePublisher.chooseAnOption("admin");
                    break;
                case 2:
                	coursePublisher.selectCourseOPt("admin");
                    break;
                case 3: 
                	eventPublisher.chooseAnOption("admin");
                	break;
                case 4: 
                	System.out.println("Exiting...\n");
                	ex = false;
                	break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ex);
	}
	
	@Override
	public void selectTeacherOpt() {
        int choice;
        boolean ex = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Dear Teacher,\nPlease enter your choice to continue:");
            System.out.println("1. Manage courses");
            System.out.println("2. View Quizes");
            System.out.println("3. Add Quizes");
            System.out.println("4. Update Quizes");
            System.out.println("5. Delete Quizes");
            System.out.println("6. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                	coursePublisher.selectCourseOPt("teacher");
                    break;
                case 2:
                    quizPublisher.displayQuiz();
                    break;
                case 3:
                    quizPublisher.addNewQuiz();
                    break;
                case 4:
                    quizPublisher.updateQuiz();
                    break;
                case 5:
                    quizPublisher.removeQuiz();
                    break;
                case 6: 
                	System.out.println("Exiting...\n");
                	ex = false;
                	break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ex);
	}
	
	public void chooseConsumer() {
        int choice;
        boolean ex = true;
        Scanner scanner = new Scanner(System.in);
        do {
        	System.out.println("-----------------------------------------------------------------");
            System.out.println("             ~ Welcome to SLIIT Music Academy ~ ");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Enter your choice to continue:");
            System.out.println("1. Admin");
            System.out.println("2. Event Organizer");
            System.out.println("3. Teacher");
            System.out.println("4. Student");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    this.selectAdminOpt();
                    break;
                case 2:
                    this.selectEventOrganizerOpt();
                    break;
                case 3: 
                	this.selectTeacherOpt();
                	break;
                case 4: 
                	this.selectStudentOpt();
                	break;
                case 5: 
                	System.out.println("Exiting...Thank you!\n");
                	ex = false;
                	break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (ex);
    }
	
}
