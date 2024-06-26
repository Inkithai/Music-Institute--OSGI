package com.musicacademy.osgi.quizpublisher;

public interface IQuizPublisher {
    /**
     * add new quizzes to the quiz list
     */
    public void addNewQuiz();

    /**
     * get the quiz list
     */
    public void displayQuiz();

    /**
     * Student can take the quiz
     */
    public void takeQuiz();

    /**
     * remove a quiz from the quiz list
     */
    public void removeQuiz();

    /**
     * update a selected quiz
     */
    public void updateQuiz();

    public void chooseAnOption(String consumer);
}

