package cse_142.cs1_exams.finals;

import java.util.Scanner;

/**
 * https://practiceit.cs.washington.edu/problem/view/cs1/exams/finals/final12/frequentFlier
 *
 * The rules for awarding frequent flier miles are:
 *  - 1 frequent flyer mile is earned for each mile traveled in coach.
 *  - 2 frequent flyer miles are earned for each mile traveled in first class.
 *  - Zero frequent flyer miles are earned on a discounted flight.
 *
 * @author Alex Golub
 * @since 15-Apr-21 8:56 PM
 */
class frequentFlier {
  public static void main(String[] args) {
    String data = "coach 1500   firstclass 2000   discount 900   coach 3500";
    System.out.println(frequentFlier(new Scanner(data)));
  }

  public static int frequentFlier(Scanner flights) {
    int miles = 0;

    while (flights.hasNext()) {
      String flight = flights.next().toLowerCase();
      switch(flight) {
        case "coach": miles += flights.nextInt(); break;
        case "firstclass": miles += 2 * flights.nextInt(); break;
      }
    }

    return miles;
  }
}
