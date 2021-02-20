package chapter8_MD_Arrays;

import java.util.Scanner;

/**
 * Case Study: Daily Temperature and Humidity
 *
 * (bash)
 * javac Weather.java
 * java Weather < weather.txt
 *
 * @author Mr.Dr.Professor
 * @since 10-Feb-21 12:16 PM
 */
class Weather {
  public static void main(String[] args) {
    final int NUMBER_OF_DAYS  = 10;
    final int NUMBER_OF_HOURS = 24;

    double[][][] data = getData(NUMBER_OF_DAYS, NUMBER_OF_HOURS);
    // [DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY, DAY]
    // DAY => [HRS, HRS, HRS, HRS, HRS, HRS, HRS, HRS, HRS, HRS, HRS..., HRS]
    // HRS => [TEMPERATURE, HUMIDITY]

    averageTempAndHumidityPerDay(data);
  }

  private static void averageTempAndHumidityPerDay(double[][][] data) {
    for (int d = 0; d < data.length; d++) {
      double totalTemperature = 0;
      double totalHumidity    = 0;
      int    numberOfHours    = data[d].length;

      for (int h = 0; h < numberOfHours; h++) {
        totalTemperature += data[d][h][0];
        totalHumidity += data[d][h][1];
      }

      // Display results
      System.out.printf("Day %d's average temperature is %.4f\n",
                        d + 1, totalTemperature / numberOfHours);
      System.out.printf("Day %d's average humidity is %.4f\n",
                        d + 1, totalHumidity / numberOfHours);
    }
  }

  private static double[][][] getData(int NUMBER_OF_DAYS, int NUMBER_OF_HOURS) {
    double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

    // read input using redirection
    Scanner console = new Scanner(System.in);
    for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
      int    day         = console.nextInt();
      int    hour        = console.nextInt();
      double temperature = console.nextDouble();
      double humidity    = console.nextDouble();

      data[day - 1][hour - 1][0] = temperature;
      data[day - 1][hour - 1][1] = humidity;
    }

    return data;
  }
}
