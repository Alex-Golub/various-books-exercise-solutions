package chapter2_objects;

import java.awt.*;

/**
 * • Testing E2.3 - E2.4
 * Write an AreaTester program that constructs a Rectangle
 * object and then computes and prints its area.
 *
 * Created by ag on 08-Nov-20 1:00 PM
 */
class Ex2_3_AreaParameterTester {
  public static void main(String[] args) {
    Rectangle box = new Rectangle(0, 0, 15, 10);
    double    h   = box.getHeight();
    double    w   = box.getWidth();
    System.out.printf(
            "box: w = %.2f, h = %.2f, area = %.2f * %.2f = %.2f\n",
            w, h, w, h, w * h
    );
    System.out.printf(
            "box: perimeter = 2 * (%.2f * %.2f) = %.2f\n",
            w, h, 2 * (w + h)
    );
  }
}
