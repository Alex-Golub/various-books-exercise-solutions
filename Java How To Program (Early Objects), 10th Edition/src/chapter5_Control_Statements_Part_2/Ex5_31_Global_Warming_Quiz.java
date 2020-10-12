package chapter5_Control_Statements_Part_2;

import java.util.Scanner;

/**
 * 5.31 (Global Warming Facts Quiz)
 * NOTE: I've used String arrays although arrays and strings hasn't been covered yet.
 *
 * https://www.nationalgeographic.com/environment/global-warming/global-warming-quiz/
 *
 * Created by ag on 12-Oct-20 2:36 PM 
 */
class Ex5_31_Global_Warming_Quiz {
  public static void main(String[] args) {
    System.out.println("===========================");
    System.out.println("=== Global Warming Quiz ===");
    System.out.println("===========================\n");

    final String[] questions = {
        "Which country currently emits the most greenhouse gases?",
        "Which planet's poisonous atmosphere has been described as the product of a \"runaway greenhouse effect\"?",
        "How many human deaths per year does the World Health Organization attribute to climate change?",
        "How long does it take for carbon dioxide in the atmosphere to disperse?",
        "Which of the following industries could be negatively affected by global warming?"
    };

    // Answers must be group of four
    final String[] options = {
        "India", "The United States", "China", "The United Kingdom",
        "Jupiter", "Earth", "Venus", "Mars",
        "150,000", "10,000", "1,500", "1,500,000",
        "100 years", "1 year", "50 years", "69 years",
        "Commercial fishing", "Insurance", "Car industry", "All of the above"
    };

    final String[] answers = {"3", "3", "1", "1", "4"};

    int     correctAnswers = 0;
    Scanner scanner        = new Scanner(System.in);

    for (int i = 0; i < questions.length; i++) {
      System.out.println(questions[i]);

      // Display options for i-th question
      for (int j = 4 * i; j < 4 * (i + 1); j++) {
        System.out.println(1 + (j % 4) + ": " + options[j]);
      }

      // Get and check user answer
      System.out.print("Your Answer => ");
      String userAnswer = scanner.next();

      if (userAnswer.equals(answers[i])) {
        System.out.println("Correct!");
        correctAnswers++;
      } else {
        int    indexOfCorrect = Integer.parseInt(answers[i]) - 1; // NOTE: index 0 based
        String correctAnswer  = options[4 * i + indexOfCorrect];
        System.out.println("Incorrect. The correct answer is " + correctAnswer);
      }

      System.out.println();
    }

    // Quiz summary
    System.out.println("=== Summery ===");
    switch (correctAnswers) {
      case 5:
        System.out.println("Excellent you scored " + correctAnswers + "\\5");
        break;
      case 4:
        System.out.println("Very good you scored " + correctAnswers + "\\5");
        break;
      case 3:
      case 2:
      case 1:
      case 0:
        System.out.println("Time to brush up on your knowledge of global warming, " +
                               "you scored " + correctAnswers + "\\5");
    }
  }
}
