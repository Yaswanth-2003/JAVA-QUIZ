package String;
import java.util.Scanner;
public class Quiz 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "What is the capital of India?",
                "Which programming language is used for this quiz?",
                "Who painted the Mona Lisa?"
        };
        String[] answers = {
                "New Delhi",
                "Java",
                "Leonardo da Vinci"
        };
        int correctAnswers = 0;

        System.out.println("Welcome to the Quiz!");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[i]);
            }
        }

        System.out.println("\nYou answered " + correctAnswers + " out of " + questions.length + " questions correctly.");
    }
}
