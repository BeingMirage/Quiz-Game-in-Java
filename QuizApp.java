import java.util.Random;  // Import the Random class
import java.util.Scanner;  // Import the Scanner class

public class QuizApp {

    public static class Question {
        private String question;
        private int answer;  
        private String option1;
        private String option2;
        private String option3;
        private String option4;
        private int OptionRNG;
        private final Random random = new Random(); 
        private final int min = 1; 
        private final int max = 4;
        private final Scanner scanner = new Scanner(System.in);

        public void DisplayQuestion() {
            OptionRNG = random.nextInt(max - min + 1) + min;
            System.out.println("Randomiser : " + OptionRNG);
            System.out.println("Question : " + question);

            switch (OptionRNG) {
                case 1 -> {
                    System.out.println("Option1 : " + option1 + "\t" + "Option2 : " + option2);
                    System.out.println("Option3 : " + option3 + "\t" + "Option4 : " + option4);
                }
                case 2 -> {
                    System.out.println("Option1 : " + option1 + "\t" + "Option2 : " + option3);
                    System.out.println("Option3 : " + option2 + "\t" + "Option4 : " + option4);
                }
                case 3 -> {
                    System.out.println("Option1 : " + option1 + "\t" + "Option2 : " + option4);
                    System.out.println("Option3 : " + option2 + "\t" + "Option4 : " + option3);
                }
                case 4 -> {
                    System.out.println("Option1 : " + option2 + "\t" + "Option2 : " + option4);
                    System.out.println("Option3 : " + option1 + "\t" + "Option4 : " + option3);
                }
                default -> System.out.println("Invalid OptionRNG value");
            }
        }

        public void CheckAnswer() {
            System.out.println("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == answer) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer was " + answer);
            }
        }

        public void setAnswer(int answer) {
            this.answer = answer;  // Set the correct answer
        }

        public void closeScanner() {
            scanner.close();  // Close the scanner
        }
    }

    public static void main(String[] args) {
        Question que1 = new Question();

        que1.question = "What is Java?";
        que1.option1 = "Dragon";
        que1.option2 = "Country";
        que1.option3 = "Superhero movie";
        que1.option4 = "Language"; 
        que1.setAnswer(4);  

        que1.DisplayQuestion();
        que1.CheckAnswer();
        que1.closeScanner();  
    }
}
