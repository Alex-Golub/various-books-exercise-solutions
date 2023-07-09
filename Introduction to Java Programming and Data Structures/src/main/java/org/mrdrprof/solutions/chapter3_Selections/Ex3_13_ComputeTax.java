package org.mrdrprof.solutions.chapter3_Selections;

import java.util.Scanner;

/**
 * *3.13 (Financial application: compute taxes)
 * Complete this program to compute taxes for all filing statuses.
 * <p>
 * Created by ag on 26-Oct-20 3:57 PM
 */
class Ex3_13_ComputeTax {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print(
            "0-single filer\n" +
                    "1-married jointly or qualifying widow(er)\n" +
                    "2-married separately\n" +
                    "3-head of household\n" +
                    "Enter the filing status: ");
    int status = input.nextInt();

    System.out.print("Enter the taxable income: ");
    double income = input.nextDouble();

    double tax = 0;
    switch (status) {
      case 0:
        double FIRST_RATE = 8350 * 0.10;
        double SECOND_RATE = (33_950 - 8_350) * 0.15;
        double THIRD_RATE = (82_250 - 33_950) * 0.25;
        double FORTH_RATE = (171_550 - 82_250) * 0.28;
        double FIFTH_RATE = (372_950 - 171_550) * 0.33;

        if (income <= 8_350)
          tax = income * 0.10;
        else {
          if (income <= 33_950)
            tax = FIRST_RATE + (income - 8350) * 0.15;
          else {
            if (income <= 82_250)
              tax = FIRST_RATE + SECOND_RATE + (income - 33_950) * 0.25;
            else {
              if (income <= 171_550)
                tax = FIRST_RATE + SECOND_RATE + THIRD_RATE + (income - 82_250) * 0.28;
              else {
                if (income <= 372_950)
                  tax = FIRST_RATE + SECOND_RATE + THIRD_RATE + FORTH_RATE + (income - 171_550) * 0.33;
                else {
                  tax = FIRST_RATE + SECOND_RATE + THIRD_RATE + FORTH_RATE + FIFTH_RATE + (income - 372_950) * 0.35;
                }
              }
            }
          }
        }
        break;

      case 1:
        FIRST_RATE = 16_700 * 0.10;
        SECOND_RATE = (67_900 - 16_700) * 0.15;
        THIRD_RATE = (137_050 - 67_900) * 0.25;
        FORTH_RATE = (208_850 - 137_050) * 0.28;
        FIFTH_RATE = (372_950 - 208_850) * 0.33;

        if (income <= 16_700)
          tax = income * 0.10;
        else {
          if (income <= 67_900)
            tax = FIRST_RATE + (income - 16_700) * 0.15;
          else {
            if (income <= 137_050)
              tax = FIRST_RATE + SECOND_RATE + (income - 67_900) * 0.25;
            else {
              if (income <= 208_850)
                tax = FIRST_RATE + SECOND_RATE + THIRD_RATE + (income - 137_050) * 0.28;
              else {
                if (income <= 372_950)
                  tax = FIRST_RATE + SECOND_RATE + THIRD_RATE + FORTH_RATE + (income - 208_850) * 0.33;
                else {
                  tax = FIRST_RATE + SECOND_RATE + THIRD_RATE + FORTH_RATE + FIFTH_RATE + (income - 372_950) * 0.35;
                }
              }
            }
          }
        }
        break;

      case 2:
        FIRST_RATE = 8_350 * 0.10;
        SECOND_RATE = (33_950 - 8_350) * 0.15;
        THIRD_RATE = (68_525 - 33_950) * 0.25;
        FORTH_RATE = (104_425 - 68_525) * 0.28;
        FIFTH_RATE = (186_475 - 104_425) * 0.33;

        if (income <= 8_350)
          tax = income * 0.10;
        else {
          if (income <= 33_950)
            tax = FIRST_RATE + (income - 8_350) * 0.15;
          else {
            if (income <= 68_525)
              tax = FIRST_RATE + SECOND_RATE + (income - 33_950) * 0.25;
            else {
              if (income <= 104_425)
                tax = FIRST_RATE + SECOND_RATE + THIRD_RATE + (income - 68_525) * 0.28;
              else {
                if (income <= 186_475)
                  tax = FIRST_RATE + SECOND_RATE + THIRD_RATE + FORTH_RATE + (income - 104_425) * 0.33;
                else {
                  tax = FIRST_RATE + SECOND_RATE + THIRD_RATE + FORTH_RATE + FIFTH_RATE + (income - 186_475) * 0.35;
                }
              }
            }
          }
        }
        break;

      case 3:
        FIRST_RATE = 11_950 * 0.10;
        SECOND_RATE = (45_500 - 11_950) * 0.15;
        THIRD_RATE = (117_450 - 45_500) * 0.25;
        FORTH_RATE = (190_200 - 117_450) * 0.28;
        FIFTH_RATE = (372_950 - 190_200) * 0.33;

        if (income <= 11_950)
          tax = income * 0.10;
        else {
          if (income <= 45_500)
            tax = FIRST_RATE + (income - 11_950) * 0.15;
          else {
            if (income <= 117_450)
              tax = FIRST_RATE + SECOND_RATE + (income - 45_500) * 0.25;
            else {
              if (income <= 190_200)
                tax = FIRST_RATE + SECOND_RATE + THIRD_RATE + (income - 117_450) * 0.28;
              else {
                if (income <= 372_950)
                  tax = FIRST_RATE + SECOND_RATE + THIRD_RATE + FORTH_RATE + (income - 190_200) * 0.33;
                else {
                  tax = FIRST_RATE + SECOND_RATE + THIRD_RATE + FORTH_RATE + FIFTH_RATE + (income - 372_950) * 0.35;
                }
              }
            }
          }
        }
        break;

      default:
        System.err.println(status + " invalid status!");
        break;
    }

    System.out.printf("Tax is $%,.1f\n", tax);
  }
}
