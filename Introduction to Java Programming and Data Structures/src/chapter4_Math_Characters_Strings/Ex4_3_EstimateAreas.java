package chapter4_Math_Characters_Strings;

import static java.lang.Math.*;
import static java.lang.Math.cos;

/**
 * *4.3 (Geography: estimate areas)
 * Compute the estimated area enclosed by these four cities.
 * Orlando (28.5383355, –81.3792365)
 * Savannah (32.0835407, –81.0998342)
 * Charlotte (35.2270869, –80.8431267)
 * Atlanta (33.7489954, –84.3879824)
 *
 * @author Mr.Dr.Professor
 * @since 12-Nov-20 6:46 PM
 */
class Ex4_3_EstimateAreas {
  public static void main(String[] args) {
    double orlandoX   = 28.5383355;
    double orlandoY   = -81.3792365;

    double savannahX  = 32.0835407;
    double savannahY  = -81.0998342;

    double charlotteX = 35.2270869;
    double charlotteY = -80.8431267;

    double atlantaX   = 33.7489954;
    double atlantaY   = -84.3879824;

    double orlandoCharlotte  = greatCircleDistance(orlandoX, orlandoY, charlotteX, charlotteY);
    double orlandoSavannah   = greatCircleDistance(orlandoX, orlandoY, savannahX, savannahY);
    double orlandoAtlanta    = greatCircleDistance(orlandoX, orlandoY, atlantaX, atlantaY);
    double savannahCharlotte = greatCircleDistance(savannahX, savannahY, charlotteX, charlotteY);
    double atlantaCharlotte  = greatCircleDistance(atlantaX, atlantaY, charlotteX, charlotteY);

    double area =
            triangleArea(orlandoSavannah, savannahCharlotte, orlandoCharlotte) +
            triangleArea(orlandoAtlanta, atlantaCharlotte, orlandoCharlotte);

    System.out.println("Area enclosed by Orlando, Savannah, Charlotte " +
            "and Atlanta is " + area + " m^3");
  }

  public static double greatCircleDistance(double x1, double y1,
                                           double x2, double y2) {
    final double EARTH_RADIUS = 6371.01;
    x1 = toRadians(x1);
    y1 = toRadians(y1);
    x2 = toRadians(x2);
    y2 = toRadians(y2);

    return EARTH_RADIUS * acos(
            sin(x1) * sin(x2) +
                    cos(x1) * cos(x2) * cos(y1 - y2)
    );
  }

  public static double triangleArea(double a, double b, double c) {
    double s = (a + b + c) / 2;
    return sqrt(s * (s - a) * (s - b) * (s - c));
  }
}

// 117863.34165851158