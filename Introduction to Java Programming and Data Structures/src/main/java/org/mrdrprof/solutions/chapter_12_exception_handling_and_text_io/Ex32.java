package org.mrdrprof.solutions.chapter_12_exception_handling_and_text_io;

import java.net.URL;
import java.util.Scanner;

/**
 * *12.32 (Ranking summary) Write a program that uses the files described in Programming Exercise 12.31 and displays a ranking summary table for the first five
 * girl’s and boy’s names as follows:
 * <p>
 * Year Rank 1 Rank 2 Rank 3 Rank 4 Rank 5 Rank 1 Rank 2 Rank 3 Rank 4 Rank 5
 * 2010 Isabella Sophia Emma Olivia Ava Jacob Ethan Michael Jayden William
 * 2009 Isabella Emma Olivia Sophia Ava Jacob Ethan Michael Alexander William
 * 2008 Emma Isabella Emily Olivia Ava Jacob Michael Ethan Joshua Daniel
 * 2007 Emily Isabella Emma Ava Madison Jacob Michael Ethan Joshua Daniel
 * 2006 Emily Emma Madison Isabella Ava Jacob Michael Joshua Ethan Matthew
 * 2005 Emily Emma Madison Abigail Olivia Jacob Michael Joshua Matthew Ethan
 * 2004 Emily Emma Madison Olivia Hannah Jacob Michael Joshua Matthew Ethan
 * 2003 Emily Emma Madison Hannah Olivia Jacob Michael Joshua Matthew Andrew
 * 2002 Emily Madison Hannah Emma Alexis Jacob Michael Joshua Matthew Ethan
 * 2001 Emily Madison Hannah Ashley Alexis Jacob Michael Matthew Joshua Christopher
 *
 * @author Alex Golub
 * @since 11/06/2023 8:16 PM
 */
class Ex32 {

    private static String[][][] names = new String[10][2][5];
    private static final String PATH_TEMPLATE = "http://liveexample.pearsoncmg.com/data/babynamesranking%s.txt";

    public static void main(String[] args) {
        readNames();
        displayRankingSummary();
    }

    public static void displayRankingSummary() {
        System.out.printf("%-5s", "Year");

        for (int i = 1; i <= 5; i++) {
            System.out.printf("%-10s", "Rank " + i);
        }

        for (int i = 1; i <= 5; i++) {
            System.out.printf("%-10s", "Rank " + i);
        }

        System.out.println();

        for (int i = 9; i >= 0; i--) {
            System.out.printf("%-5d", 2001 + i);
            for (int j = 1; j >= 0; j--) {
                for (int k = 0; k < 5; k++) {
                    System.out.printf("%-10s", names[i][j][k]);
                }
            }
            System.out.println();
        }
    }

    public static void readNames() {
        for (int i = 0; i < 10; i++) {
            int year = 2001 + i;
            try (Scanner input = new Scanner(new URL(PATH_TEMPLATE.formatted(year)).openStream())) {
                for (int j = 0; j < 5; j++) {
                    input.nextInt(); // Skip the ranking
                    names[i][0][j] = input.next();
                    input.nextInt(); // Skip the number of boy's name
                    names[i][1][j] = input.next();
                    input.nextInt(); // Skip the number of girl's name
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
