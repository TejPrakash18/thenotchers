package SystemDesign.QuizApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private final String questionText;
    private final List<String> options;
    private final int correctAnswerIndex;

    public Question(String questionText, List<String> options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public boolean isCorrect(int answerIndex) {
        return correctAnswerIndex == answerIndex;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}

class Quiz {
    private final List<Question> questions;
    private int currentQuestionIndex;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.currentQuestionIndex = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public boolean hasNextQuestion() {
        return currentQuestionIndex < questions.size();
    }

    public Question getNextQuestion() {
        if (!hasNextQuestion()) {
            throw new IllegalStateException("No more questions");
        }
        return questions.get(currentQuestionIndex++);
    }

    public boolean checkAnswer(int answerIndex) {
        return questions.get(currentQuestionIndex - 1).isCorrect(answerIndex);
    }

}

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name !");
        String name = scanner.nextLine();
        int correctAnswer =0;
        int wrongAnswer = 0;
        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question("What is the capital of France?", List.of("Paris", "London", "Berlin", "Rome"), 0));
        quiz.addQuestion(new Question("What is the largest mammal?", List.of("Elephant", "Whale", "Giraffe", "Lion"), 1));
        quiz.addQuestion(new Question("What is 2+2?", List.of("3", "4", "5", "6"), 1));
        quiz.addQuestion(new Question("What is 2/2?", List.of("3", "4", "1", "6"), 2));



        while (quiz.hasNextQuestion()) {
            Question question = quiz.getNextQuestion();
            System.out.println(question.getQuestionText());
            List<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }
            System.out.print("Your answer: ");
            int answerIndex = scanner.nextInt() - 1; // Adjust for 0-based indexing 1-1 = 0
            if (quiz.checkAnswer(answerIndex)) {
                correctAnswer++;
                System.out.println("Correct!");
            } else {
                wrongAnswer++;
                System.out.println("Incorrect. The correct answer is: " + options.get(question.getCorrectAnswerIndex()));
            }
            System.out.println();
        }
        System.out.println("Hello "+ name +" your correct answer is "+correctAnswer+" and wrong answer is "+ wrongAnswer);
        System.out.println("total score is "+correctAnswer+"/4");
        scanner.close();
    }
}

