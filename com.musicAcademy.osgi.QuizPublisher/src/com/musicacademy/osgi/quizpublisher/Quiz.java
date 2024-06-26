package com.musicacademy.osgi.quizpublisher;

public class Quiz {
    private String question;
    private String firstAnswer;
    private String secondAnswer;
    private String thirdAnswer;
    private String fourthAnswer;
    private int correct;


    public Quiz() {

    }

    /**
     * @param question
     * @param firstAnswer
     * @param secondAnswer
     * @param thirdAnswer
     * @param fourthAnswer
     * @param correct
     */
    public Quiz(String question, String firstAnswer, String secondAnswer, String thirdAnswer, String fourthAnswer, int correct) {
        this.question = question;
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        this.fourthAnswer = fourthAnswer;
        this.correct = correct;
    }

    /**
     * @param question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return firstAnswer
     */
    public String getFirstAnswer() {
        return firstAnswer;
    }

    /**
     * @param firstAnswer
     */
    public void setFirstAnswer(String firstAnswer) {
        this.firstAnswer = firstAnswer;
    }

    /**
     * @return secondAnswer
     */
    public String getSecondAnswer() {
        return secondAnswer;
    }

    /**
     * @param secondAnswer
     */
    public void setSecondAnswer(String secondAnswer) {
        this.secondAnswer = secondAnswer;
    }

    /**
     * @return thirdAnswer
     */
    public String getThirdAnswer() {
        return thirdAnswer;
    }

    /**
     * @param thirdAnswer
     */
    public void setThirdAnswer(String thirdAnswer) {
        this.thirdAnswer = thirdAnswer;
    }

    /**
     * @return fourthAnswer
     */
    public String getFourthAnswer() {
        return fourthAnswer;
    }

    /**
     * @param fourthAnswer
     */
    public void setFourthAnswer(String fourthAnswer) {
        this.fourthAnswer = fourthAnswer;
    }

    /**
     * @param correct
     */
    public void setCorrect(int correct) {
        this.correct = correct;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @return correct
     */
    public int getCorrect() {
        return correct;
    }

    /**
     * @return correct answer
     */
    public String getCorrectAnswer() {
        switch (correct) {
            case 1:
                return firstAnswer;
            case 2:
                return secondAnswer;
            case 3:
                return thirdAnswer;
            case 4:
                return fourthAnswer;
        }
        return "";
    }

    @Override
    public String toString() {
        return  "Question='" + question + '\n' +
                "\t First Answer = " + firstAnswer + '\n' +
                "\t Second Answer = " + secondAnswer + '\n' +
                "\t Third Answer = " + thirdAnswer + '\n' +
                "\t Fourth Answer = " + fourthAnswer + '\n' +
                "\t Correct Answer = " + correct ;

    }


}
