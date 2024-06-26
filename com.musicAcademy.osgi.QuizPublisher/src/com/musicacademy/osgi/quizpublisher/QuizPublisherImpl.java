package com.musicacademy.osgi.quizpublisher;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author R.Abiraj.k.k.k
 * it21118654
 */

public class QuizPublisherImpl implements IQuizPublisher {

    private ArrayList<Quiz> westernMusicQuizzes;
    private ArrayList<Quiz> classicalMusicQuizzes;
    private ArrayList<Quiz> jazzMusicQuizzes;
    private ArrayList<Quiz> easternMusicQuizzes;
    private Scanner scanner;

    public QuizPublisherImpl() {

        scanner = new Scanner(System.in);

        // add initial quizzes to the western music quiz list
        westernMusicQuizzes = new ArrayList<>();
        westernMusicQuizzes.add(new Quiz("Who composed 'The Flying Dutchman'?", "Johann Sebastian Bach", "Richard Wagner", "Johann Strauss", "Johannes Brahms", 2));
        westernMusicQuizzes.add(new Quiz("Which of the following came first", "Orchestra", "Consert", "Sonata", "Symphony", 3));
        westernMusicQuizzes.add(new Quiz("Which of the following is an oratorio?", "Fidelio", "Vernice", "William tel oevrture", "Israel in Egypt", 4));
        westernMusicQuizzes.add(new Quiz("Who is the \"Father of the symphony\"?", "Ludwig van Beethoven", "Wolfgang Amadeus Mozart", "Franz Liszt", "Franz Joseph Hayden", 4));
        westernMusicQuizzes.add(new Quiz("Who composed 'The Flying Dutchman'?", "Johann Sebastian Bach", "Richard Wagner", "Johann Strauss", "Johannes Brahms", 2));

        // add initial quizzes to the classical music quiz list
        classicalMusicQuizzes = new ArrayList<>();
        classicalMusicQuizzes.add(new Quiz("Which of these is NOT the subtitle of a Haydn symphony?", "HornSignal", "Lamentatione", "Tragic", "Mercury", 3));
        classicalMusicQuizzes.add(new Quiz("Who is the composer of the symphony 'La Scala'?", "Giuseppe Verdi", "Richard Wagner", "Johann Strauss", "Johannes Brahms", 1));
        classicalMusicQuizzes.add(new Quiz("What is known as the \"Common practice\" period??", "1550-1900", "1700-1900", "1600-1900", "1500-1800", 1));
        classicalMusicQuizzes.add(new Quiz("Where was cellist Jaqueline du Pré born?", "Cheltenham", "Oxford", "Cambridge", "Cirencester", 2));
        classicalMusicQuizzes.add(new Quiz("How old was Giuseppe Verdi when he wrote his Requiem?", "50", "60", "70", "80", 2));

        // add initial quizzes to the jazz music quiz list
        jazzMusicQuizzes = new ArrayList<>();
        jazzMusicQuizzes.add(new Quiz("What are syncopations, a typical feature of jazz?", "Off-beat music", "A brass instrument", "A slow mournful song", "Melody song", 1));
        jazzMusicQuizzes.add(new Quiz("Where did jazz music originate from?", "Australia", "India", "African america communities", "France", 3));
        jazzMusicQuizzes.add(new Quiz("What century was it created in?'?", "20th", "13th", "21st", "18th", 1));
        jazzMusicQuizzes.add(new Quiz(" In which U.S city did jazz music first become popular?", "New Orleans", "Los Angeles", "Boston", "Birmingham", 1));
        jazzMusicQuizzes.add(new Quiz("The word \"jazz\" began as a what coast slang term ?", "Because its not in the dictionary", "Because the teacher hasnt explained it", "Because it spans from Ragtime waltzes to 2000s-era fusion", "Because its music with a different ballad", 3));

        easternMusicQuizzes = new ArrayList<>();
       
        easternMusicQuizzes.add(new Quiz("What is the \"Romantic period\"?", "1700-1900", "1600-1900", "1500-1800", "1400-1900", 3));
	    easternMusicQuizzes.add(new Quiz("Who is the composer of the symphony 'La Scala'?", "Giuseppe Verdi", "Richard Wagner", "Johann Strauss", "Johannes Brahms", 1));
        easternMusicQuizzes.add(new Quiz("What is known as the \"Common practice\" period??", "1550-1900", "1700-1900", "1600-1900", "1500-1800", 1));
        easternMusicQuizzes.add(new Quiz("Who is the composer of the symphony 'Rondo alla Turca'?", "Giuseppe Verdi", "Richard Wagner", "Johann Strauss", "Johannes Brahms", 1));
        easternMusicQuizzes.add(new Quiz("What is the \"Baroque period\"?", "1700-1900", "1600-1900", "1500-1800", "1400-1900", 2));

    }

    @Override
    public void addNewQuiz() {
        char addNewQuiz;
        int quizType;

        do {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("  Please select the quiz type quiz number you would like to add: ");
            System.out.println("-----------------------------------------------------------------");

            displayMenu();

            quizType = scanner.nextInt();
            scanner.nextLine();

            switch (quizType) {
                case 1:
                    westernMusicQuizzes.add(getQuestionData("Western Music"));
                    break;
                case 2:
                    classicalMusicQuizzes.add(getQuestionData("Classical Music"));
                    break;
                case 3:
                    jazzMusicQuizzes.add(getQuestionData("Jazz Music"));
                    break;
                case 4:
                    easternMusicQuizzes.add(getQuestionData("Eastern Music"));
                    break;
                default:
                    System.out.println("Invalid quiz type");
            }

            System.out.println("Would you like to add another quiz? (Y/N)");
            addNewQuiz = scanner.next().charAt(0);
        } while (addNewQuiz == 'y' || addNewQuiz == 'Y');
    }

    @Override
    public void displayQuiz() {
        char displayQuiz;
        int quizType;

        do {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("  Please select the quiz type quiz number you would like to display: ");
            System.out.println("-----------------------------------------------------------------");

            displayMenu();

            quizType = scanner.nextInt();
            scanner.nextLine();

            switch (quizType) {
                case 1:
                    displayQuizData(westernMusicQuizzes);
                    break;
                case 2:
                    displayQuizData(classicalMusicQuizzes);
                    break;
                case 3:
                    displayQuizData(jazzMusicQuizzes);
                    break;
                case 4:
                    displayQuizData(easternMusicQuizzes);
                    break;
                default:
                    System.out.println("Invalid quiz type");
            }

            System.out.println("\n Would you like to display another quiz? (Y/N)");
            displayQuiz = scanner.next().charAt(0);
        } while (displayQuiz == 'y' || displayQuiz == 'Y');
        return;
    }

    @Override
    public void takeQuiz() {
        char takeAnotherQuiz;
        int quizType;
        ArrayList<Quiz> selectedQuiz = null;
        int marks = 0;

        do {

            System.out.println("-----------------------------------------------------------------");
            System.out.println("Please select the quiz type quiz number you would like to take: ");
            System.out.println("-----------------------------------------------------------------");
            displayMenu();
            quizType = scanner.nextInt();
            scanner.nextLine();

            switch (quizType) {
                case 1:
                    selectedQuiz = westernMusicQuizzes;
                    break;
                case 2:
                    selectedQuiz = classicalMusicQuizzes;
                    break;
                case 3:
                    selectedQuiz = jazzMusicQuizzes;
                    break;
                case 4:
                    selectedQuiz = easternMusicQuizzes;
                    break;
                default:
                    System.out.println("Invalid quiz type");
            }

            if (selectedQuiz != null) {
                int questionNumber = 1;
                int correctAnswer;

                for (Quiz quiz : selectedQuiz) {
                    System.out.println(questionNumber + ". " + quiz.getQuestion());
                    System.out.println("-------------------Answers-------------------");
                    System.out.println("1. " + quiz.getFirstAnswer());
                    System.out.println("2. " + quiz.getSecondAnswer());
                    System.out.println("3. " + quiz.getThirdAnswer());
                    System.out.println("4. " + quiz.getFourthAnswer());
                    System.out.println("Enter number of correct answer: ");
                    correctAnswer = scanner.nextInt();
                    scanner.nextLine();

                    //check if answer is correct
                    if (correctAnswer == quiz.getCorrect()) {
                        System.out.println("You are correct!");
                        marks += 10;
                    } else {
                        System.out.println("You are incorrect!");
                        System.out.println("The correct answer is: " + quiz.getCorrectAnswer());
                        System.out.println();
                    }
                    questionNumber++;
                }
            }
            System.out.println("-----------------------------------------------------------------");
            System.out.println("                 You scored " + marks + " marks                     ");
            System.out.println("-----------------------------------------------------------------\n");
            System.out.println("Do you want to take another quiz? (Y/N)");
            takeAnotherQuiz = scanner.next().charAt(0);
        } while (takeAnotherQuiz == 'Y' || takeAnotherQuiz == 'y');
    }

    @Override
    public void removeQuiz() {
        int removeQuiz;
        char deleteMore;
        int quizType;
        ArrayList<Quiz> selectedQuiz = null;

        do {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Please select the quiz type quiz number you would like to remove: ");
            System.out.println("-----------------------------------------------------------------");
            displayMenu();
            quizType = scanner.nextInt();
            scanner.nextLine();

            switch (quizType) {
                case 1:
                    selectedQuiz = westernMusicQuizzes;
                    break;
                case 2:
                    selectedQuiz = classicalMusicQuizzes;
                    break;
                case 3:
                    selectedQuiz = jazzMusicQuizzes;
                    break;
                case 4:
                    selectedQuiz = easternMusicQuizzes;
                    break;
                default:
                    System.out.println("Invalid quiz type");
            }
            displayQuizData(selectedQuiz);
            System.out.println("Enter the number of the quiz you would like to remove: ");
            removeQuiz = scanner.nextInt();
            scanner.nextLine();
            if (removeQuiz > 0 && removeQuiz <= selectedQuiz.size()) {
                selectedQuiz.remove(removeQuiz - 1);
                System.out.println("-----------------------------------------------------------------");
                System.out.println("              Quiz removed successfully!                         ");
                System.out.println("-----------------------------------------------------------------\n");
            } else {
                System.out.println("-----------------------------------------------------------------");
                System.out.println("              Invalid quiz number!                              ");
                System.out.println("-----------------------------------------------------------------\n");
            }
            System.out.println("Do you want to remove another quiz? (Y/N)");
            deleteMore = scanner.next().charAt(0);
        } while (deleteMore == 'Y' || deleteMore == 'y');
    }

    @Override
    public void updateQuiz() {
        int updateQuiz;
        char updateMore;
        int quizType;
        char updateState;
        ArrayList<Quiz> selectedQuiz = null;

        do {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Please select the quiz type quiz number you would like to update: ");
            System.out.println("-----------------------------------------------------------------");
            displayMenu();
            quizType = scanner.nextInt();
            scanner.nextLine();

            switch (quizType) {
                case 1:
                    selectedQuiz = westernMusicQuizzes;
                    break;
                case 2:
                    selectedQuiz = classicalMusicQuizzes;
                    break;
                case 3:
                    selectedQuiz = jazzMusicQuizzes;
                    break;
                case 4:
                    selectedQuiz = easternMusicQuizzes;
                    break;
                default:
                    System.out.println("Invalid quiz type");
            }

            displayQuizData(selectedQuiz);
            System.out.println("Enter the number of the quiz you would like to update: ");
            updateQuiz = scanner.nextInt();
            scanner.nextLine();
            if (updateQuiz > 0 && updateQuiz <= selectedQuiz.size()) {
                Quiz quiz = new Quiz();
                System.out.println("Do you want to update the question? (Y/N)");
                updateState = scanner.nextLine().charAt(0);
                if (updateState == 'Y' || updateState == 'y') {
                    System.out.println("Enter the new question: ");
                    quiz.setQuestion(scanner.nextLine());
                } else {
                    quiz.setQuestion(selectedQuiz.get(updateQuiz - 1).getQuestion());
                }
                System.out.println("Do you want to update the first answer? (Y/N)");
                updateState = scanner.nextLine().charAt(0);
                if (updateState == 'Y' || updateState == 'y') {
                    System.out.println("Enter the new first answer: ");
                    quiz.setFirstAnswer(scanner.nextLine());
                } else {
                    quiz.setFirstAnswer(selectedQuiz.get(updateQuiz - 1).getFirstAnswer());
                }
                System.out.println("Do you want to update the second answer? (Y/N)");
                updateState = scanner.nextLine().charAt(0);
                if (updateState == 'Y' || updateState == 'y') {
                    System.out.println("Enter the new second answer: ");
                    quiz.setSecondAnswer(scanner.nextLine());
                } else {
                    quiz.setSecondAnswer(selectedQuiz.get(updateQuiz - 1).getSecondAnswer());
                }
                System.out.println("Do you want to update the third answer? (Y/N)");
                updateState = scanner.nextLine().charAt(0);
                if (updateState == 'Y' || updateState == 'y') {
                    System.out.println("Enter the new third answer: ");
                    quiz.setThirdAnswer(scanner.nextLine());
                } else {
                    quiz.setThirdAnswer(selectedQuiz.get(updateQuiz - 1).getThirdAnswer());
                }
                System.out.println("Do you want to update the fourth answer? (Y/N)");
                updateState = scanner.nextLine().charAt(0);
                if (updateState == 'Y' || updateState == 'y') {
                    System.out.println("Enter the new fourth answer: ");
                    quiz.setFourthAnswer(scanner.nextLine());
                } else {
                    quiz.setFourthAnswer(selectedQuiz.get(updateQuiz - 1).getFourthAnswer());
                }
                System.out.println("Do you want to update the correct answer? (Y/N)");
                updateState = scanner.nextLine().charAt(0);
                if (updateState == 'Y' || updateState == 'y') {
                    System.out.println("Enter the new correct answer: ");
                    quiz.setCorrect(scanner.nextInt());
                } else {
                    quiz.setCorrect(selectedQuiz.get(updateQuiz - 1).getCorrect());
                }
                selectedQuiz.remove(updateQuiz - 1);
                selectedQuiz.add(updateQuiz - 1, quiz);

                System.out.println("-----------------------------------------------------------------");
                System.out.println("              Quiz updated successfully!                         ");
                System.out.println("-----------------------------------------------------------------\n");
            } else {
                System.out.println("-----------------------------------------------------------------");
                System.out.println("              Invalid quiz number!                              ");
                System.out.println("-----------------------------------------------------------------\n");
            }
            System.out.println("Do you want to update another quiz? (Y/N)");
            updateMore = scanner.next().charAt(0);
        } while (updateMore == 'Y' || updateMore == 'y');
    }

    @Override
    public void chooseAnOption(String consumer) {
        char exit;
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
        	if(consumer.equals("student")) {
        		System.out.println("Enter the choice");
                System.out.println("1. take a test");
                System.out.println("2. Exit");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        this.takeQuiz();
                        break;
                    case 2: 
                    	System.out.println("Exiting...\n");
                    	break;
                    default:
                        System.out.println("Invalid choice");
                }

                System.out.println("Do you want to continue?(y/n)");
                exit = scanner.next().charAt(0);
        		
        	}else {
        		// options for teacher
        		System.out.println("Enter the choice");
                System.out.println("1. Add Question");
                System.out.println("2. view Question");
                System.out.println("3. Remove Question");
                System.out.println("4. update Question");
                System.out.println("5. Exit");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        this.addNewQuiz();
                        break;
                    case 2:
                        this.displayQuiz();
                        break;
                    case 3:
                        this.removeQuiz();
                        break;
                    case 4:
                        this.updateQuiz();
                        break;
                    case 5: 
                    	System.out.println("Exiting...\n");
                    	break;
                    default:
                        System.out.println("Invalid choice");
                }

                System.out.println("Do you want to continue?(y/n)");
                exit = scanner.next().charAt(0);
        		
        	}
        } while (exit == 'y' || exit == 'Y');
    }

    private void displayQuizData(ArrayList<Quiz> musicQuizzes) {
        int quizNumber = 1;
        for (Quiz quiz : musicQuizzes) {
            System.out.println(quizNumber + ". " + quiz.toString());
            quizNumber++;
        }
    }

    private Quiz getQuestionData(String questionType) {
        Quiz newQuiz = new Quiz();
        System.out.println("Please enter a " + questionType + " question: ");
        newQuiz.setQuestion(scanner.nextLine());
        System.out.println("Please enter first answer: ");
        newQuiz.setFirstAnswer(scanner.nextLine());
        System.out.println("Please enter second answer: ");
        newQuiz.setSecondAnswer(scanner.nextLine());
        System.out.println("Please enter third answer: ");
        newQuiz.setThirdAnswer(scanner.nextLine());
        System.out.println("Please enter fourth answer: ");
        newQuiz.setFourthAnswer(scanner.nextLine());
        System.out.println("Please enter number the correct answer: ");
        newQuiz.setCorrect(scanner.nextInt());
        return newQuiz;
    }

    private void displayMenu() {
        System.out.println("1. Western Music");
        System.out.println("2. Classical Music");
        System.out.println("3. Jazz Music");
        System.out.println("4. Eastern Music");
    }
}