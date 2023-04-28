import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap ;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Map;

public class Main {

    private static final Map<String, String> questionsMap = new LinkedHashMap<>(
        Map.of(
            "can a chicken fly?", "no",
            "can a penguin fly?", "no",
            "can a dog walk?", "yes",
            "whats the result of one plus one?", "two",
            "it's a cat a feline?", "yes"
            )
    );

    private static int points = 0;
    private static int counter = 0;

    /**
     * @param args
     */
    public static void main(String[] args) {
        responseHandler(questionHandler());
    }




    public static Map<String, Map<String, String>> questionHandler()  {
        final Scanner scanner = new Scanner(System.in);
        final Map<String, Map<String, String>> answerMap = new HashMap();
        System.out.println("do you want to continue?");
        if(scanner.nextLine().equalsIgnoreCase("yes")) {
            for (Map.Entry<String,String> entry : questionsMap.entrySet()) {
                System.out.println(String.format("Question #%1s %2s", counter, entry.getKey()));
                final String userAnswer = scanner.nextLine();
                answerMap.put(entry.getKey(), new HashMap<>( Map.of( String.valueOf(counter), userAnswer)));
                if(userAnswer.equalsIgnoreCase(entry.getValue())) {
                    points++;
                }
                counter++;
            }
        }
        return answerMap;
    }

    public static void responseHandler(Map<String, Map<String, String>> answerMap) {
        System.out.println("\n\n");
        for (Map.Entry<String, Map<String, String>> entry : answerMap.entrySet()) {
            final Map<String, String> questionAnswerMap = entry.getValue();
            final Map.Entry<String,String> questionIterator = questionAnswerMap.entrySet().iterator().next();
            System.out.println(String.format("in the answer for #%1s %2s you put %3s", questionIterator.getKey(), entry.getKey(), questionIterator.getValue()));
            System.out.println(String.format("your answer is %s", questionsMap.get(entry.getKey()).equals(questionIterator.getValue()) ? "correct" : "not correct"));
        }
        System.out.println("your total correct answers is: " + points);
    }

}