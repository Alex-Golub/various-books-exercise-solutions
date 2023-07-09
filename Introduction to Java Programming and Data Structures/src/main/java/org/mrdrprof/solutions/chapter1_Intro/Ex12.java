package org.mrdrprof.solutions.chapter1_Intro;

/**
 * 1.12 (Average speed in kilometers)
 * Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
 * Write a program that displays the average speed in
 * kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
 *
 * Created by ag on 30-Sep-20 11:13 PM 
 */
class Ex12 {
  public static void main(String[] args) {
    // 1 mile -> 1.6km => 24mile -> x = 24 * 1.60934
    // 1 hour + 40 minutes / 60min/hour + 5 seconds / 3600 sec/hour
    System.out.println(24 * 1.60934 / (1 + 40.0 / 60 + 35.0 / 3600 ));
  }
}
