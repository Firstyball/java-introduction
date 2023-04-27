import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = 0;

        String[] questions = {"can a chicken fly?", "can a penguin fly?", "can a dog walk?", "whats the result of one plus one", "it's a cat a feline?"};
        String[] answers = {"no", "no", "yes", "two", "yes"};

        String[] n = new String[5];
        while (true) {
            System.out.println("do you want to continue?");
            if (scanner.nextLine().equals("yes")) {
                points = 0;
                for (int i = 0; i < 5; i++) {
                    String questionReturn = questionLoop(scanner, questions[i], i);
                    n[i] = questionReturn;

                }
                for (int i = 0; i < n.length; i++) {
                    points = answerLoop(n[i], answers[i], i, points);
                }

                System.out.println("your total correct answers is: " + points);
            } else {
                break;
            }
        }
    }

    public static String questionLoop(Scanner scanner, String question, int questionNumber) {

        System.out.println("Question #" + questionNumber + " " + question);
        String input = scanner.nextLine();

        String answerInput = input;

        return answerInput;

    }

    public static int answerLoop(String answerInput, String answer, int answerNumber, int points) {


        System.out.println("in the answer #" + answerNumber + " you put " + answerInput);

        if (answerInput.equals(answer)) {
            System.out.println("your answer is correct");
            points++;
        } else {
            System.out.println("your answer is not correct ");
        }
        return points;

    }
/*
    private static void question() {
        Scanner scanner = new Scanner(System.in);
        String questionOne = "can a chicken fly?";
        String questionTwo = "can a penguin fly?";
        String questionThree = "can a dog walk?";

        String answerOne = "no";
        String answerTwo = "no";
        String answerThree = "yes";

        int points = 0;

        System.out.println("answer the next questions with yes or not");
        System.out.println("Question 1: " + questionOne);
        points = getPoints(scanner, answerOne, points);
        System.out.println("Question 2: " + questionTwo);
        points = getPoints(scanner, answerTwo, points);
        System.out.println("Question 3: " + questionThree);
        String input3 = scanner.next();

        if (input3.equals(answerThree)) {
            System.out.println("your answer its correct");
            points++;
        } else {
            System.out.println("your answer its not correct, the correct answer is: " + answerThree);
        }
        System.out.println(("you say: " + input3));

        System.out.println("your total points is: " + points);
    }

    private static int getPoints(Scanner scanner, String answerOne, int points) {
        String input = scanner.next();

        if (input.equals(answerOne)) {
            System.out.println("your answer its correct");
            points++;
        } else {
            System.out.println("your answer its not correct, the correct answer is: " + answerOne);
        }
        System.out.println(("you say: " + input));

        System.out.println("answer the next questions with yes or not");
        return points;
    }
    
 */
}